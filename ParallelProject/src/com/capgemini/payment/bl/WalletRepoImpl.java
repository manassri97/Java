package com.capgemini.payment.bl;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.payment.bean.Customer;
import com.capgemini.payment.repo.WalletRepo;

public class WalletRepoImpl implements WalletRepo {

	Map<String, Customer> hashMap = new HashMap<>();
	@Override
	public boolean save(Customer customer) {
		if(hashMap.containsKey(customer.getMobileno()))
			return false;
		else
		{
			hashMap.put(customer.getMobileno(), customer);
			return true;
		}
	}

	@Override
	public Customer findOne(String mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
