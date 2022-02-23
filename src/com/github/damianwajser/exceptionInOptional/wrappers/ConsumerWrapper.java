package com.github.damianwajser.exceptionInOptional.wrappers;


@FunctionalInterface
public interface ConsumerWrapper<T> {

	void acceptWithException(T t) throws Exception;
}
