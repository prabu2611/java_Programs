package com.javaprogramss;

public class Email_Check {
	
		   static boolean isValid(String email) {
		      String regex = "^[\\w_\\.+]*[\\w_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		      return email.matches(regex);
		   }
		   public static void main(String[] args) {
		      String email = "prabu1$23_93@gmail.com";
		      System.out.println("The E-mail ID is: " + email);
		      System.out.println("Is the above E-mail ID valid? " + isValid(email));
		   }
		}

