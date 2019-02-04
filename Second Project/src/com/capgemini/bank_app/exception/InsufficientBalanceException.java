package com.capgemini.bank_app.exception;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String message) {
		super(message);
	}
}
