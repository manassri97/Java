package com.capgemini.bank_app.exception;

public class InsufficientOpeningBalanceException extends Exception {

	public InsufficientOpeningBalanceException(String message) {
		super(message);
	}
}
