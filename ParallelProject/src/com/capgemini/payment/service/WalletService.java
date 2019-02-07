package com.capgemini.payment.service;

import java.math.BigDecimal;

import com.capgemini.payment.bean.Customer;

public interface WalletService {
	public Customer createAccount(String name, String mobileNo, BigDecimal amount);
	public Customer showBalance(String mobileNo);
	public Customer fundTransfer(String sourceMobile, String targetMobileNo, BigDecimal amount);
	public Customer depositAmount(String mobileNo, BigDecimal amount);
	public Customer withdrawAmount(String mobileNo, BigDecimal amount);
}
