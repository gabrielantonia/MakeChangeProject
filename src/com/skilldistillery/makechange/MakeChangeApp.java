package com.skilldistillery.makechange;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(1000);
		System.out.print("3....  ");
		Thread.sleep(1000);
		System.out.print("2....  ");
		Thread.sleep(1000);
		System.out.println("1....  \n\n");
		Thread.sleep(1000);
		System.out.print("Loading  ");
		Thread.sleep(2000);
		System.out.print("..................  ");
		Thread.sleep(1000);
		System.out.println("Almost done  \n\n");
		Thread.sleep(2000);
		System.out.print("....  ");
		Thread.sleep(1000);
		System.out.print("Really this time  ");
		Thread.sleep(1000);
		System.out.println("....  \n\n");
		Thread.sleep(1000);

		System.out.println(
				"Hello and welcome to the Cash Register App, \nhere to remedy all your Mathematical Ineptitude.\nPlease follow the prompts:\n\n");

		while (true) {
			Thread.sleep(3000);
			System.out.println("__________________________________\n");
			System.out.println("\n" + "How much is the item?");

			double price = getNumber();
			System.out.println("How much cash was tendered?");
			double priceTendered = getNumber();

			if (priceTendered == price) {
				System.out.println("That's the exact amount! You must be some kinda rocket scientist!");

			} else if (priceTendered < price) {
				System.out.println("Get a job bum!");

			} else if (priceTendered > price) {
				double change = priceTendered - price;

				Thread.sleep(2000);
				System.out.println("\nokay, give me a sec..");
				Thread.sleep(2000);
				System.out.println("where'd I put my "
						+ "calculator..");
				Thread.sleep(2000);
				System.out.println("Screw it, asking Google..");
				Thread.sleep(2000);
				System.out.println("There we go:");

				if (change >= 10) {
					int tens = (int) (change / 10);
					System.out.println("\n" + tens + " Hamiltons");
					change = change % 10.0;
				}
				if (change >= 5) {
					int fives = (int) (change / 5);
					System.out.println("\n" + fives + " Lincolns");
					change = change % 5.0;
				}

				if (change >= 1) {
					int ones = (int) (change / 1);
					System.out.println("\n" + ones + " Washingtons");
					change = change % 1.0;
				}

				if (change >= .25) {
					int quarters = (int) (change / .25);
					System.out.println("\n" + quarters + " Quarters");
					change = change % .25;
				}

				if (change >= .1) {
					int dimes = (int) (change / .1);
					System.out.println("\n" + dimes + " Dimes");
					change = change % .10;
				}

				if (change >= .05) {
					int nickles = (int) (change / .05);
					System.out.println("\n" + nickles + " Nickels");
					change = change % .05;
				}

				if (change >= .01) {
					int pennies = (int) (change / .01 + .005);
					System.out.println("\n" + pennies + " Pennies");

				}
				System.out.println("\n_______________" + "___________________\n\n\n");
				promptEnterKey();
				clearScreen();
				

			}
		}
	}

	public static double getNumber() {
		Scanner kb = new Scanner(System.in);
		double num = 0;
		try {
			num = kb.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println(
					"Come on, I'm already doing all the hard work the least you could do is input a valid number.\n\n");

		}
		return num;
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J"+ "\n");
		System.out.flush();
	}

	public static void promptEnterKey() {
		System.out.println("Press \"ENTER\" to continue...");
		try {
			int read = System.in.read(new byte[2]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
