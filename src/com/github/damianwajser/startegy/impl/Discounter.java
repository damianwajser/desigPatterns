package com.github.damianwajser.startegy.impl;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Discounter {

	BigDecimal apply(BigDecimal d);

}
