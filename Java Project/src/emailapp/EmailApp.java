package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Welcome to generate Email smart program >>\n");
	  System.out.println("Enter your FirstName & LastName");
	  String fName = sc.next();
	  String lName = sc.next();
	  
	  Email e = new Email(fName , lName);
	  System.out.println(e);

	}

}
