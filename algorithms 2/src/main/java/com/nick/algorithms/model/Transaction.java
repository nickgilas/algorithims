package com.nick.algorithms.model;

import java.util.Date;

public class Transaction implements Comparable<Transaction> {

	private double amount;
	private Date when;
	private String who;

	@Override
	public int compareTo(Transaction o) {
		return o.compareTo(this);
	}

	public double getAmount() {
		return amount;
	}

	public Date getWhen() {
		return when;
	}

	public String getWho() {
		return who;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public void setWho(String who) {
		this.who = who;
	}

}
