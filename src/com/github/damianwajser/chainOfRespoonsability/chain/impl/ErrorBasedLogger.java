package com.github.damianwajser.chainOfRespoonsability.chain.impl;

import com.github.damianwajser.chainOfRespoonsability.chain.Logger;

public class ErrorBasedLogger extends Logger {

	@Override
	protected void log(int level, String msg) {
		if (level == ERRORINFO)
			System.err.println("ERROR LOGGER INFO: " + msg);
		super.next(msg, level);
	}


}
