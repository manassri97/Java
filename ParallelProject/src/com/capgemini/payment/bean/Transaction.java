package com.capgemini.payment.bean;

import java.math.BigDecimal;

public class Transaction {
	private String id;
	private String tmobileNo;
	private BigDecimal credit;
	private BigDecimal debit;
	private BigDecimal total;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTmobileNo() {
		return tmobileNo;
	}
	public void setTmobileNo(String tmobileNo) {
		this.tmobileNo = tmobileNo;
	}
	public BigDecimal getCredit() {
		return credit;
	}
	public void setCredit(BigDecimal credit) {
		this.credit = credit;
	}
	public BigDecimal getDebit() {
		return debit;
	}
	public void setDebit(BigDecimal debit) {
		this.debit = debit;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", tmobileNo=" + tmobileNo + ", credit=" + credit + ", debit=" + debit
				+ ", total=" + total + "]\n";
	}
}