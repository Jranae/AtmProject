package BankingProject;

import java.util.Scanner;

public class BankingAccount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int balance = 100000, withdraw, deposit;
		System.out.println("Which account would you like to access: \n 1. Checking \n 2. Savings \n 3. exit");
		int Choice = scan.nextInt();
		
		switch(Choice)
			
		{
		case 1:
			System.out.println("Enter money to be deposited");
			deposit = scan.nextInt();
			balance = balance + deposit;
			System.out.println("Your money has been successfully deposited");
			System.out.println("Balance: "+ balance);
			System.out.println("How much would you like to take out:");
			withdraw = scan.nextInt();
		if(balance>=withdraw)
			{
			balance = balance - withdraw;
			System.out.println("Please collect your money");
			}
		else
			{
			System.out.println("Insufficient Balance");
			}
			System.out.println("Balance: "+ balance);
			
		
		case 2:
			System.out.println("Enter money to be deposited");
			deposit = scan.nextInt();
			balance = balance + deposit;
			System.out.println("Your money has been successfully deposited");
			System.out.println("Balance: "+ balance);
			System.out.println("How much would you like to take out:");
			withdraw = scan.nextInt();
		if(balance>=withdraw)
			{
			balance = balance - withdraw;
			System.out.println("Please collect your money");
			}
		else
			{
			System.out.println("Insufficient Balance");
			}
			System.out.println("Balance: "+ balance);
			
		case 3:
			
			System.out.println("Thanks for using leah's ATM!");
			break;
		}
			
		
	}
		


	}

