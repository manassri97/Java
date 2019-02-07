package com.capgemini.payment.UI;

import com.capgemini.payment.bl.WalletRepoImpl;
import com.capgemini.payment.bl.WalletServiceImpl;
import com.capgemini.payment.repo.WalletRepo;
import com.capgemini.payment.service.WalletService;

public class UserInterface {

	public static void main(String[] args) {
		WalletRepo walletRepo = new WalletRepoImpl();
		WalletService walletService = new WalletServiceImpl(walletRepo);
		

	}

}
