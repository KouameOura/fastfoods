package com.fastfood.fastfood.exceptions;

public class ChildRecordsFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ChildRecordsFoundException() {
		super();
	}

	public ChildRecordsFoundException(final String message) {
		super(message);

	}

}
