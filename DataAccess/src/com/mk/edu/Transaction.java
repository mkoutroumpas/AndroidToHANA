package com.mk.edu;

public class Transaction {
	private long _ID;
	public long getID() {
		return _ID;
	}
	public void setID(long _ID) {
		this._ID = _ID;
	}

	private double TransactionValue;
	public double getTransactionValue() {
		return TransactionValue;
	}
	public void setTransactionValue(double transactionValue) {
		TransactionValue = transactionValue;
	}

	private String TransactionCode;
	public String getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		TransactionCode = transactionCode;
	}
	
}
