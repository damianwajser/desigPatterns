package com.github.damianwajser.chainOfRespoonsability.chain.impl;

import com.github.damianwajser.chainOfRespoonsability.chain.Logger;

public class DebugBasedLogger extends Logger {

	@Override
	public void log(int level, String msg) {
		if (level == DEBUGINFO)
			System.out.println("DEBUG LOGGER INFO: " + msg);
		super.next(msg, level);
	}

}
