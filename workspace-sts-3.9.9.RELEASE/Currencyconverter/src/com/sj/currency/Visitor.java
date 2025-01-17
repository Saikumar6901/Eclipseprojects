package com.sj.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Visitor {
	@Value("Saikumar")
	String name;
	@Value("100")
	double amount;
	@Autowired
	@Qualifier("currency1")
	CurrencyConverter currency;
	public Visitor() {
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		System.out.println(name);
		System.out.println(currency.convertCurrency(amount));
	}
	public String toString() {
	    double curr = currency.convertCurrency(amount);
	    return "Name: "+name+"\nAmount: "+curr+" Rupees";
	}
}
