package com.github.damianwajser.exceptionInOptional;

import com.github.damianwajser.exceptionInOptional.wrappers.OptionalWrapper;

public class Main {

	public void test() throws Exception {

		OptionalWrapper.of(new ReturnOptionalClass().returnOptional()).ifPresent((t) -> {
			throw new Exception();
		});
	}

	private void validateUser(String user) {
	}
}
