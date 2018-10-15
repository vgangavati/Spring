package com.n26.rama.app.bigdecimal;

import java.math.BigDecimal;

@FunctionalInterface
public interface ToBigDecimalFunction<T> {

	/**
	 * Applies this function to the given argument.
	 *
	 * @param value
	 *            the function argument
	 * @return the function result
	 */
	BigDecimal applyAsBigDecimal(T value);
}
