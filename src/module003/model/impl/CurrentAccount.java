package module003.model.impl;

import module003.model.Account;
import module003.model.AccountTypes;


public final class CurrentAccount extends Account {
//	static final int CURRENT_MIN_BALANCE = -10000;

	/*
	 * (non-Javadoc)
	 * 
	 * @see module003.model.Account#withdraw(java.lang.Double)
	 * 
	 * Current Account allows negative balance
	 * 
	 */

	public CurrentAccount() {
//		this.setMinBalance(CurrentAccount.CURRENT_MIN_BALANCE);
		this.setAccountType(AccountTypes.CURRENT);
	}

	@Override
	public Double withdraw(Double amnt) {
		this.setBalalnce(this.getBalalnce() - amnt);
		return this.getBalalnce();		
	}
}
