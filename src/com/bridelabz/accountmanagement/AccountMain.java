package com.bridelabz.accountmanagement;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1)To view current balance 2)To add balance  3)To withdraw balance");
			Account account = new Account();
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("The balance is:");
				account.viewBalnce();

				break;
			case 2:
				account.addBalnce();
				break;
			case 3:
				account.withdrawBalance();
				break;
			}

		}
	}
}