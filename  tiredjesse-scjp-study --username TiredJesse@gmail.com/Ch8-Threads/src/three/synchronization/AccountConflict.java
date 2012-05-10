package three.synchronization;

// Run multiple times to see varying scenarios of withdrawing from the same account
// Sometimes the program runs correctly
// Sometimes Fred withdrew too much, but then Lucy would still withdraw money
// Sometimes Lucy withdrew too much, but then Fred would still withdraw money

public class AccountConflict implements Runnable {

	private static final float WITHDRAW_AMOUNT = 5.00f;
	private Account account;

	public AccountConflict() {
		account = new Account(50.00f);
	}

	public static void main(String[] args) {
		AccountConflict conflict = new AccountConflict();

		Thread one = new Thread(conflict, "Fred"), 
			   two = new Thread(conflict, "Lucy");

		one.start();
		two.start();
	}

	public void run() { // Adding synchronize here, blocks the second thread from using this method
		  				// until the first one completes
		for (int x = 0; x < 10; x++) {
//			try {
//				Thread.sleep(100); // This sleep() partially remedies the issue, by allowing a short delay
//								   // before withdrawing an account 
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			if (account.withdraw(WITHDRAW_AMOUNT)) {
				System.out.println(Thread.currentThread().getName()
						+ " withdrew $" + WITHDRAW_AMOUNT
						+ ". The balance is now: $" + account.getBalance());
			} else {
				System.out.println(Thread.currentThread().getName() + " withdrew too much!");
			}
		}
	}
}
