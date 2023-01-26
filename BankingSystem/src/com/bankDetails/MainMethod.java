package com.bankDetails;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		GetBankDemo gd=new GetBankDemo();
		
		gd.pinLogic(sc);
		
		sc.close();
	
	}

}
