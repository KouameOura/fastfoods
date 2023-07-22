package com.fastfood.fastfood.exceptions;

public class OrderContainsInactiveItemsException  extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderContainsInactiveItemsException() {
		super();
	}

	public OrderContainsInactiveItemsException(final String message) {
		super(message);

	}
}
