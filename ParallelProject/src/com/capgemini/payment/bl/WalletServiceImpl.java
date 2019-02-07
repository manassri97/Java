package com.capgemini.payment.bl;

import java.math.BigDecimal;

import com.capgemini.payment.bean.Customer;
import com.capgemini.payment.bean.Wallet;
import com.capgemini.payment.repo.WalletRepo;
import com.capgemini.payment.service.WalletService;

public class WalletServiceImpl implements WalletService {

	WalletRepo walletRepo;
	Customer customer;
	Wallet wallet;
	
	public WalletServiceImpl(WalletRepo walletRepo) {
		this.walletRepo=walletRepo;
	}

	@Override
	public Customer createAccount(String name, String mobileNo, BigDecimal amount) {
		if(validateName(name))
		{
			
		}
		else if(validate(mobileNo))
		{
			
		}
		else
		{
			customer.setName(name);
			customer.setMobileno(mobileNo);
			wallet.setBalance(amount);
			customer.setWallet(wallet);
		}
		if(walletRepo.save(customer))
		{
			return customer;
		}
		else
		{
			return null;
		}
	}

	private boolean validate(String mobileNo) {
		if(mobileNo.length()!=10)
		{
			return true;
		}
		else
			return false;
	}

	private boolean validateName(String name) {
		if(name==null)
			return true;
		else
			return false;
	}

	@Override
	public Customer showBalance(String mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer fundTransfer(String sourceMobile, String targetMobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
