/**
 * 
 */
package module003.model.impl;

import module003.model.Account;
import module003.model.AccountTypes;


/**
 * @author Sinoop
 *
 */
public final class SavingsAccount extends Account {
	float interestRate;
	static final int SAVINGS_MIN_BALANCE = 100;
	static final float SAVINGS_INTEREST_RATE = 4.0f;
	
	public SavingsAccount() {
		this.setMinBalance(SavingsAccount.SAVINGS_MIN_BALANCE);
		this.interestRate = SavingsAccount.SAVINGS_INTEREST_RATE;
		this.setAccountType(AccountTypes.SAVINGS);
	}
	

}
