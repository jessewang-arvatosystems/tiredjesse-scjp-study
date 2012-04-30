package one.introduction;

import java.util.ArrayList;
import java.util.List;

public class Coupling {}

// Coupling is the degree to which one class knows about or
// uses members of another class.

// Loose coupling is a desirable state where classes are well encapsulated and
// minimize references to each other.

// Tight coupling is an undesirable state where classes are very dependent on each
// other and break the rules for loose coupling.

// IE:
@SuppressWarnings("unused")
class BankTeller {
	// Tightly coupled, every instance of BankTeller will need to instantiate
	// a list of accounts
	private List<Account> tightlyCoupledAccounts = new ArrayList<Account>();
	
	private List<Account> looselyCoupledAccounts;
	
	void buildListOfAccounts(List<Account> looselyCoupledAccounts) {
		// Much more loosely coupled, can instantiate BankTeller without having
		// to instantiate Account;
		this.looselyCoupledAccounts = looselyCoupledAccounts;
	}
}

class Account {}