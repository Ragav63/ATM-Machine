package com.main.repo;
import java.io.IOException;

import com.option.repo.OptionMenu;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		char ch;
		
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		
		do {
			
			optionMenu.mainMenu();
			
			System.out.println("Do you want to continue to Option menu");
			ch=sc.next().charAt(0);
			
		}while(ch=='y'|| ch=='Y');
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project!");
	}
}
