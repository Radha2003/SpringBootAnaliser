package com.example.demo.model;

import com.example.demo.Controller.TradeController;

public class CannonicalTrade {
	int account_number;
	String  security_id ;
	String tradetype;
	
	CannonicalTrade(String str){
		
		String[] parts=str.split(",");
		this.account_number=Integer.parseInt(parts[0]);
		this.security_id=parts[1];
		this.tradetype=parts[2];
	}
	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getSecurity_id() {
		return security_id;
	}

	public void setSecurity_id(String security_id) {
		this.security_id = security_id;
	}

	public String getTradetype() {
		return tradetype;
	}

	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}

	

	
	
	
	
	
	

}
