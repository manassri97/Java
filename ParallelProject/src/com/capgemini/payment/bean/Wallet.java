package com.capgemini.payment.bean;

import java.math.BigDecimal;

public class Wallet {
	private BigDecimal balance;

	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}