package three.synchronization;


public class Account {

	private float balance;

	public Account(float balance) {
		this.balance = balance;
	}
	
	
	public float getBalance() {
		return balance;
	}
	
	public boolean withdraw(float amount) {
		synchronized(this) {
			if(verifyAmount(amount) && checkWithdrawalAmount(amount)) {
				balance -= amount;
				return true;
			}
		}
		return false;
	}
	
	public boolean deposit(float amount) {
		synchronized(this) {
			if(verifyAmount(amount)) {
				balance += amount;
				return true;
			}			
		}
		return false;
	}
	
	private boolean verifyAmount(float amount) {
		return amount >= 0;
	}
	
	private boolean checkWithdrawalAmount(float amount) {
		return ((balance - amount) >= 0);
	}
	
}
