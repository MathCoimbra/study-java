package com.design_patterns.exceptions;

@SuppressWarnings("serial")
public class LoginInvalidoException extends Exception {

	public LoginInvalidoException() {
		super();
	}

	public LoginInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LoginInvalidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginInvalidoException(String message) {
		super(message);
	}

	public LoginInvalidoException(Throwable cause) {
		super(cause);
	}

	
	
}
