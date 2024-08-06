package com.oppo;
class BankAccount {
	 private double balance;
	 public BankAccount(double initialBalance) {
	 balance = initialBalance;
	 }
	 public double getBalance() {
	 return balance;
	}
	 }
	 public class Smartphone {
	 public static void main(String[] args) {
	 BankAccount account = new BankAccount(1000.0);
	 System.out.println("Current balance: " + account.getBalance());
	 account.balance = 1500.0;
	 System.out.println("Updated balance: " + account.getBalance());
	 }
	 }