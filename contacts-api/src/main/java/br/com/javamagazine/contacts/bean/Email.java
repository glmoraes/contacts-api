package br.com.javamagazine.contacts.bean;

public class Email {
	  
	 private String type;
	 private String address;
	  
	 public Email() {}
	  
	 public Email(String type, String address) {
	  this.type = type;
	  this.address = address;
	 }
	  
	 public void setEmail(String type, String address) {
		 Email e = new Email();
		 e.address =address;
		 e.type = type;
	 }
	}
