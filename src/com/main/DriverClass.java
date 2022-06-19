package com.main;

import java.util.Scanner;

import com.models.Employee;
import com.services.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
       Employee myName = new Employee("Suprateek" , "Korukonda");
       
       CredentialService objCredentialService = new CredentialService();
       
       System.out.println("Please enter the department from the following");
       System.out.println("1. Technical");
       System.out.println("2. Admin");
       System.out.println("3. Human Resources");
       System.out.println("4. Legal");
       
       Scanner sc = new Scanner(System.in);
       
       int selection = sc.nextInt();
       switch (selection) {
         case 1:
        	  String generatedEmail1 = objCredentialService.generateEmailAddress(myName.getFirstName(), myName.getLastName(),"Technincal");
              char[] generatedPassword1 = objCredentialService.generatePassword();
              System.out.println("Dear" + " " + myName.getFirstName() + " " + "your generated credentials are as follows");
              System.out.println(objCredentialService.showCredentials(generatedEmail1, generatedPassword1));
          break;
         case 2:
        	 String generatedEmail2 = objCredentialService.generateEmailAddress(myName.getFirstName(), myName.getLastName(),"Admin");
             char[] generatedPassword2 = objCredentialService.generatePassword();
             System.out.println("Dear" + " " + myName.getFirstName() + " " + "your generated credentials are as follows");
             System.out.println(objCredentialService.showCredentials(generatedEmail2, generatedPassword2));
          break;
         case 3:
        	 String generatedEmail3 = objCredentialService.generateEmailAddress(myName.getFirstName(), myName.getLastName(),"Human Resources");
             char[] generatedPassword3 = objCredentialService.generatePassword();
             System.out.println("Dear" + " " + myName.getFirstName() + " " + "your generated credentials are as follows");
             System.out.println(objCredentialService.showCredentials(generatedEmail3, generatedPassword3));
           break;
         case 4:
        	 String generatedEmail4 = objCredentialService.generateEmailAddress(myName.getFirstName(), myName.getLastName(),"Legal");
             char[] generatedPassword4 = objCredentialService.generatePassword();
             System.out.println("Dear" + " " + myName.getFirstName() + " " + "your generated credentials are as follows");
             System.out.println(objCredentialService.showCredentials(generatedEmail4, generatedPassword4));
           break;
         default: 
             System.out.println("Please input valid option from menu");
           break;
          }
        sc.close();
       
       }

}
