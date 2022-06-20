package com.services;

import java.util.Random;



public class CredentialService {
	
	
	
public String generateEmailAddress(String firstName, String lastName, String department){
return firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase().replaceAll("\\s", "") + ".abc.com";
	

		
}

		public char[] generatePassword(){

		
		{
		        int length = 10;
		        String symbol = "-/.^&*_!@%=+>)"; 
		        String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		        String smallLetter = "abcdefghijklmnopqrstuvwxyz"; 
		        String numbers = "0123456789"; 


		        String finalString = capLetter + smallLetter + 
		                numbers + symbol; 

		        Random random = new Random(); 

		        char[] password = new char[length]; 

		        for (int i = 0; i < length; i++) 
		        { 
		            password[i] = 
		                    finalString.charAt(random.nextInt(finalString.length())); 

		        } 
		       return password;
		}

		

	};
	
	public String showCredentials(String generatedEmail, char[] generatedPassword){
    return "Email ---> " + " " + generatedEmail + "\n" + 
    	   "Password ---> " + " " + generatedPassword.toString();

	}

}

