package br.com.javamagazine.contacts.bean;

import java.util.ArrayList;
import java.util.List;

  
public class Contact {
  
 private int id;
 private String name;
 private Phone phone;
 private Email email;
 //private List<Phone> phones = new ArrayList<Phone>();
 //private List<Email> emails = new ArrayList<Email>();
  
 // gets e sets omitidos...
 public Contact() {}
 
 public void add(Contact contact ) {
	 Contact c = new Contact();
	 c.name = contact.name;
	 c.email = contact.email;
	 c.phone = contact.phone;
 }
 
 public String getName() {
	 return this.name;
 }
 
 public void setId(int id) {
	  this.id = id ;
 }
 
 @Override
 public boolean equals(Object obj) {
  boolean result = false;
  
  if (obj instanceof Contact) {
   Contact c = (Contact) obj;
   //result = c.getId() == this.getId();
   result = c.id == this.id;
     }
  
  return result;
 }
  
 @Override
 public int hashCode() {
	 return this.id ^7;
  //return getId() ^ 7;
	// return HashCode.class.hashCode()^7;
 }
 
}