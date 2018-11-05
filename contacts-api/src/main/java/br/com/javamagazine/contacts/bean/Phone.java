package br.com.javamagazine.contacts.bean;

public class Phone {
	  
	 private String type;
	 private String number;
	  
	 public Phone() {}
	  
	 public Phone(String type, String number) {
	  this.type = type;
	  this.number = number;
	 }
	  
	 public String getPhone()
	    {   return number+" "+type;
	     }
	 
	 public void setPhone(String type, String number) {
		 Phone p = new Phone();
		 p.number =number;
		 p.type = type;
	 }
	}