package com.github.damianwajser.chainOfRespoonsability;

import com.github.damianwajser.chainOfRespoonsability.chain.Logger;
import com.github.damianwajser.chainOfRespoonsability.chain.impl.ConsoleBasedLogger;
import com.github.damianwajser.chainOfRespoonsability.chain.impl.DebugBasedLogger;
import com.github.damianwajser.chainOfRespoonsability.chain.impl.ErrorBasedLogger;

public class Main {

	private static Logger doChaining() {
		// Create the chaining
		Logger consoleLogger = new ConsoleBasedLogger();
		Logger errorLogger = new ErrorBasedLogger();
		Logger debugLogger = new DebugBasedLogger();
		consoleLogger.setNextLevelLogger(debugLogger).setNextLevelLogger(errorLogger);
		return consoleLogger;
	}

	public static void main(String args[]) {
		Logger chain = doChaining();
		chain.log(Logger.OUTPUTINFO, "Enter the sequence of values ");
		chain.log(Logger.ERRORINFO, "An error is occured now");
		chain.log(Logger.DEBUGINFO, "This was the error now debugging is compeled");
	}


}
