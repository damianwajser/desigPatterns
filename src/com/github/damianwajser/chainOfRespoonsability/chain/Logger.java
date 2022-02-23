package com.github.damianwajser.chainOfRespoonsability.chain;

public abstract class Logger {

	public static int OUTPUTINFO = 1;
	public static int ERRORINFO = 2;
	public static int DEBUGINFO = 3;

	protected Logger nextLevelLogger;

	public abstract void log(int level, String msg);

	public Logger setNextLevelLogger(Logger nextLevelLogger) {
		this.nextLevelLogger = nextLevelLogger;
		return nextLevelLogger;
	}

	protected void next(String msg, int level) {
		if (nextLevelLogger != null) {
			nextLevelLogger.log(level, msg);
		}
	}
}
