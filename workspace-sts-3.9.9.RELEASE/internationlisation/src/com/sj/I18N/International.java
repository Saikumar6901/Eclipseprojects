package com.sj.I18N;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.*;

public class International {

	 String language,country;
	 double amount;
	 
	

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * public International() { // TODO Auto-generated constructor stub }
	 */
	 public void getMsg() {
	        try {
	        Locale locale = new Locale(language, country);
//	        System.out.println("locale is fine"); 
//	        System.out.println(Locale.US); 
//	        System.out.println(locale); 
	   //     NumberFormat mf=new NumberFormat.getInstance(locale);
	      ResourceBundle messages = ResourceBundle.getBundle("messages",locale);
	      System.out.println("Country Code : "+locale.getCountry());
	      System.out.println("Country : "+locale.getDisplayCountry());
	      System.out.println("Language code : "+locale.getLanguage());
	       System.out.println("Language : "+locale.getDisplayLanguage());
	        System.out.print(messages.getString("welcome.message") + " ");
	       // System.out.println(messages.getString("world"));
	        }
	        catch(Exception e) {
	        	System.out.println(e);
	        }
	    }
}
