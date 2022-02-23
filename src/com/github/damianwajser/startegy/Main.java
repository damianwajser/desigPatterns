package com.github.damianwajser.startegy;

import com.github.damianwajser.startegy.impl.ChristmasDiscounter;
import com.github.damianwajser.startegy.impl.Discounter;
import com.github.damianwajser.startegy.impl.EasterDiscounter;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args){

		Discounter d = new ChristmasDiscounter();
		Discounter d1 = new EasterDiscounter();

		BigDecimal amount = BigDecimal.valueOf(10);
		System.out.println(String.format("ammount: %f, d: %f, d1: %f",amount, d.apply(amount), d1.apply(amount)));
	}
}
