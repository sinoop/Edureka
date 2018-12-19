package module003.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import module003.model.Account;
import module003.model.AccountException;
import module003.model.impl.SavingsAccount;
import module003.model.impl.CurrentAccount;

public class CreateAccount {
	static Scanner sc = new Scanner(System.in);
	ArrayList<Account> accounts = null;
	Account selectedAccount = null;

	public static void main(String[] args) {
		CreateAccount ca = new CreateAccount();
		ca.accounts = new ArrayList<>();
		String lastResponse = "";
		while (true) {
			while (!lastResponse.toLowerCase().equals("e")) {
				lastResponse = ca.displaytheMenu();
			}
			System.out.println("Do you want to continue ? (Y/N)");
			if (sc.nextLine().equals("N")) {
				sc.close();
				break;
			} else {
				lastResponse = "";
				ca.accounts = new ArrayList<>();
				ca.selectedAccount = null;
			}
		}
		sc.close();
	}

	private String displaytheMenu() {
		String userResponse = "";
		String header = "";
		if (selectedAccount != null) {
			header = ">>>>>> Currently Selected Account is : " + selectedAccount.toString();
			for (int i = 0; i < header.length(); i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println(header);
			for (int i = 0; i < header.length(); i++) {
				System.out.print("=");
			}

			System.out.println("");
			System.out.println("Select from following options : ");
			System.out.println("D : Deposit money ");
			System.out.println("W : Withdraw money from this account ");
			System.out.println("A : Get Account Details of this accounts ");
			System.out.println("");
			System.out.println("N : Open New Account ");
			System.out.println("S : Select another Account");
			System.out.println("E : Exit");
			userResponse = getResponseFromUser("Enter the option :");
			switch (userResponse.toLowerCase()) {
			case "a":
				System.out.println(selectedAccount.toString());
				break;

			case "d":
				userResponse = getResponseFromUser("Amount to deposit : ");
				Double depositAmount = Double.parseDouble(userResponse);
				selectedAccount.deposit(depositAmount);
				break;

			case "w":
				userResponse = getResponseFromUser("Amount to withdraw : ");
				Double withdrawAmount = Double.parseDouble(userResponse);
				try {
					Double newBalance = selectedAccount.withdraw(withdrawAmount);
					System.out.println("Withdraw successful. New Balance : " + newBalance);
				} catch (AccountException e) {
					System.out.println("Please add more fund to the accounts before withdrawing..");
				}
				break;
			case "e":
				break;
			case "n":
				accounts.add(createAccount());
				break;
			case "s":
				selectedAccount = selectAccount(accounts);
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		} else {
			accounts.add(createAccount());
			selectedAccount = accounts.get(0);
		}

		return userResponse.toLowerCase();
	}

	private void intializeAccount(Account account) {
		String acName = getResponseFromUser("Please Enter Name : ");
		Integer acNumber = Integer.parseInt(getResponseFromUser("Please Account Number : "));
		Double initialBalance = Double.parseDouble(getResponseFromUser("Please Enter intial Deposit Amount : "));

		account.setAccountName(acName);
		account.setAccountNumber(acNumber);
		account.setBalalnce(initialBalance);
	}

	private Account createAccount() {
		Account account = null;
		String userResponse = getResponseFromUser(
				"What type of Account would you like to create : Savings(S) / Current(C)");

		switch (userResponse.toLowerCase()) {
		case "savings":
		case "s":
			account = new SavingsAccount();
			intializeAccount(account);
			break;

		case "current":
		case "c":
			account = new CurrentAccount();
			intializeAccount(account);
			break;

		default:
			break;
		}

		return account;
	}

	private String getResponseFromUser(String message) {
		System.out.println(message);
		return sc.nextLine();
	}

	private Account selectAccount(List<Account> accounts) {
		Account selectedAccount = null;
		int i = 0;
		String userResponse = "";

		if (accounts.size() == 1) {
			System.out.println("Only 1 account present. Please add new accounts.");
			return accounts.get(0);
		}

		if (accounts.size() > 1) {
			do {
				i = 1;
				System.out.println("Select your account : ");
				for (Account a : accounts) {
					System.out.println(i++ + "." + a.toString());
				}
				userResponse = getResponseFromUser("");
				if (Integer.parseInt(userResponse) <= accounts.size()) {
					selectedAccount = accounts.get(Integer.parseInt(userResponse) - 1);
					break;
				} else {
					System.out.println("Invalid Account selected");
				}
			} while (true);
		}

		return selectedAccount;

	}
}
