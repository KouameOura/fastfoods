package com.fastfood.fastfood.exceptions;

public class SubCategoryNameAlreadyExistsException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SubCategoryNameAlreadyExistsException() {
		super();
	}

	public SubCategoryNameAlreadyExistsException(final String message) {
		super(message);
	}

}
