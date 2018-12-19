package module003.model;

public class AccountException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6078847470370671205L;
	
	String message = "";
	public AccountException(){
		
	}
	public AccountException(String error) {
		this.message = error;
	}
}
