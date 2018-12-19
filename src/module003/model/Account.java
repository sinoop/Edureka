package module003.model;

public abstract class Account {
	int accountNumber;
	String accountName;
	double balalnce;
	double minBalance;
	AccountTypes accountType;

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalalnce() {
		return balalnce;
	}

	public void setBalalnce(double balalnce) {
		this.balalnce = balalnce;
	}

	public void deposit(Double amnt) {
		this.balalnce += amnt;
	}

	// By default Account cannot have balance less than negative balance
	public Double withdraw(Double amnt) throws AccountException {
		if ((this.balalnce - amnt) < this.getMinBalance()) {
			throw new AccountException("Insufficent Balance. You can withdraw only " + (this.balalnce - this.getMinBalance()));
		} else {
			this.balalnce -= amnt;
			return this.balalnce;
		}
	}

	public String toString() {
		return "Account Name : " + this.accountName + " | Account Number : " + this.accountNumber + " | Balance : "
				+ this.balalnce + " | " + this.accountType.name();
	}

	public AccountTypes getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypes accountType) {
		this.accountType = accountType;
	}

}
