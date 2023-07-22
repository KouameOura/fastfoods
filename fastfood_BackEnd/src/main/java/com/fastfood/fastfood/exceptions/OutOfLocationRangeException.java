package com.fastfood.fastfood.exceptions;

public class OutOfLocationRangeException  extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public OutOfLocationRangeException() {
		super();
	}

	public OutOfLocationRangeException(final String message) {
		super(message);

	}
}
