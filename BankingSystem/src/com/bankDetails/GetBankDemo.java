package com.bankDetails;

import java.util.Random;
import java.util.Scanner;

public class GetBankDemo {
	private static long balance=50000;
	
	public void pinLogic(Scanner sc) {
		final int pin=1212;
		System.out.println("WELCOME TO ONLINE BANKING ");
		System.out.print("ENTER YOUR PIN: ");
		int entry = sc.nextInt();
       
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = sc.nextInt();
		}
		
		System.out.println("--------------Welcome to Online Banking System-------------");
		System.out.println(" ");
		System.out.println(" ");
		
		getReturn(sc);
		 sc.close();
		
	}
	
	public static void getExit() {
		System.out.println("<<<    THANK YOU   >>>");
	}
	

	
	public static void getReturn(Scanner sc) {
	
		System.out.println(" Enter 1 >> to show Balance \n Enter 2 >> to get withdraw Balance \n Enter 3 >> to deposite balance \n Enter 4 >> to create new Account \n Enter 5 >> for exit ");
		
		int no=sc.nextInt();
		
		switch(no) {
		case 1:
			getAccBal(sc);
			break;
		
		case 2:
			getWithdraw(sc);
			break;
			
		case 3:
			getDeposite(sc);
			break;
			
		case 4:
			newAccount(sc);
			break;
		case 5:
			getExit();
		
		}
		 sc.close();
		
	}
	
	
	public static void getDeposite(Scanner sc) {
		
		System.out.println("Enter deposite amount");
		long amount=sc.nextLong();
	
		balance = amount+balance;
		getAccBal(sc);
		//System.out.println("New Balance "+balance);
		
		System.out.println(" ");
		getReturn(sc);
		 sc.close();
	}
	
	
	public static void getWithdraw(Scanner sc) {
		
	System.out.println("Enter Withdraw ammount");
    int withdrawamt = sc.nextInt();
    
    if(withdrawamt>balance) {
     try {
		throw new ExceptionDemo("Insufficient balance in your account");
	} catch (ExceptionDemo e) {
		
		e.printStackTrace();
	}
    }else {
    balance = balance - withdrawamt;
    System.out.println(" YOUR TRANSACTION IS SUCCESSFUL");
	    System.out.println("  ");
	    getAccBal(sc);
	    System.out.println(" ");
	    
	   
	    getReturn(sc);
	    sc.close();
    	
    }
    }
	
	public static void getAccBal(Scanner sc) {
		
		  System.out.println(" YOUR ACCOUNT BALANCE IS >>> "+balance);
		  System.out.println(" ");
		
		  getReturn(sc);
	  }
	
	public static void newAccount(Scanner sc) {
		
		UserInput ui=new UserInput();
		
		System.out.println("Create new Account");
		System.out.println(" ");
		
		System.out.println("Enter your name ");
		String name=sc.next();
		
		System.out.println("Enter your mobile number ");
		int mono=sc.nextInt();
		
		System.out.println("Enter your city ");
		String city=sc.next();
		
		System.out.println("Enter yout PAN number ");
		String pan=sc.next();
		
		ui.setName(name);
		ui.setMono(mono);
		ui.setCity(city);
		ui.setPan(pan);
		
		System.out.println("Your account is created ");
		System.out.println("Your name is "+ui.getName());
		System.out.println("Your mono is "+ui.getMono());
		System.out.println("Your city is "+ui.getCity());
		System.out.println("Your pan number is "+ui.getPan());
		
         Random random = new Random();
 		int rand = (int) Math.round(random.nextFloat() * Math.pow(10,12));
// 		if(rand < 0) {
// 			System.out.print("Your Account number is "+rand);
// 		}
// 		else {
// 			
// 			 rand = (int) Math.round(random.nextFloat() * Math.pow(10,12));
// 		}
 		System.out.print("Your Account number is "+rand);
 		
 		
 		System.out.println(" ");
 		getReturn(sc);
		sc.close();
		
	}
	
}
