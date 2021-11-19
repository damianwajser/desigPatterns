package com.github.damianwajser.chainOfRespoonsability.chain.impl;

import com.github.damianwajser.chainOfRespoonsability.chain.Logger;

public class ConsoleBasedLogger extends Logger {

	@Override
	protected void log(int level, String msg) {
		if (level == OUTPUTINFO)
			System.out.println("CONSOLE LOGGER INFO: " + msg);
		super.next(msg, level);
	}

}
