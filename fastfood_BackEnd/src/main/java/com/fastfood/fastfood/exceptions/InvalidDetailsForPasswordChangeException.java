package com.fastfood.fastfood.exceptions;

public class InvalidDetailsForPasswordChangeException extends RuntimeException{
	
	private static final long serialVersionUID = -9079454849611061074L;

	public InvalidDetailsForPasswordChangeException() {
		super();
	}

	public InvalidDetailsForPasswordChangeException( String message) {
		super(message);

	}

}
