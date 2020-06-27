package emailapp;

import java.util.Scanner;

public class Email {
	 private Scanner in = new Scanner(System.in);
	 private String firstName , lastName , department , email , password;
	 
	 public Email(String firstName , String lastName) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 
		 department = getDepart(); // return Department
		 
		 email = GenerateEmail();// return Email
		 
		 password = GeneratePass();// return Pass
	 }
	 
//	 method return department choices
	 
	 private String getDepart() {
		 System.out.println("Choose from these department\n , Enter 1 to Select \"Sales\" ,\n2 \"Department\" , " + " \nor 3 for \"accounting\"\n");
		 int ch = in.nextInt();
		 String dep = "";
		 while(true) {
			 if(ch==1 ||ch==2 || ch==3)
				 break;
			 else {
				 System.out.println("please Select from 1 --> 3");
				 ch = in.nextInt();
			 }

		 }
		 switch(ch) {
		 case 1:
			 dep = "Sales";
			 break;
		 case 2:
			 dep = "Development";
			 break;
		 case 3:
			 dep = "Accounting";
			 break;
			 default:
				 dep = "";
		 }
		 return dep;
	 }
//	  method generate an email address
	 private String GenerateEmail() {
		 String em = firstName.toLowerCase() +","+ lastName.toLowerCase() + "@" + department + ".gmail.com";
		 return em;
	 }
//	 method to generate random pass
	 private String GeneratePass() {
		 System.out.println("Enter password Length");
		 String ch = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012356789!@#$&*^";
		 	int size = in.nextInt();
		 	
		 	char arr[] = new char[size];
		 	for(int i=0;i<arr.length;++i) {
		 		int rad = (int)((Math.random()) * ch.length());
		 		arr[i]+=ch.charAt(rad);
		 	}
		 	return new String(arr);
	 }
//	 getters to attributes
	 public String toString() {
		 String data = " FullName : " + firstName + " " + lastName + "\n Email Address : " + email + "\n password: " + password;
		 return data;
		 }
	 
 }
