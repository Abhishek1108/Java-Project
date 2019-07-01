import java.util.Locale;

import java.util.Scanner;
import java.io.*;
import java.math.BigDecimal;

import javax.swing.JPasswordField;



public  class UserLogin {

	Scanner sc=new Scanner(System.in);
	
public String ID = "null";
String pass,name,email,phn,dob;

BigDecimal inc;
	


	UserLogin()
	{
		ID=null;
		pass=null;
		name=null;
		email=null;
		phn=null;
		dob=null;
	

	}

	
	public void getInput() {
	try {
		

		
		 
			System.out.println("Enter User ID");
			ID=sc.nextLine();
			System.out.println("Enter Password ");
			pass=sc.nextLine();
			System.out.println("Enter Your Name ");
			name=sc.nextLine();
			System.out.println("Enter Your email ");
			email=sc.nextLine();
			System.out.println("Enter Your Phone Number");
		    phn=sc.nextLine();
			System.out.println("Enter Your Date Of Birth");
			dob=sc.nextLine();
			System.out.println(" Enter Your Income");
			inc=sc.nextBigDecimal();
			System.out.println("Congrats You Have Regsistred Successfully ");
			System.out.println("Your Details");
			Formatting fr =new Formatting();
			fr.printDetails(ID,email,dob,inc,pass,name,phn);
			 
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
		
	
		
			
		 }
	/*public   void  printDetails() {
		System.out.println( "Your Name is"+Formatting.titleCase(name)+"\n"+"Your ID is"+ID+"\n"+"Your Password is"+pass+"\n"
	+"Your email is"+email+"\n"+"Your Phone Number is"+phn+
				"\n"+"Your Date Of Birth is"+Formatting.dateFormat(dob)+"\n"+"Your Income is"+Formatting.currencyFormat(inc)+"\n");
		
	}*/
	
	
	
	


}
	


