package four.anonymousclasses;

public class ArgumentDefinedAnonymousClass {
	public static void main(String[] args) {
		LawFirm lawFirm = new LawFirm();

//		lawFirm.sealTheDeal(new Contract()); // Does not work need some way to implement signPapers();
		
		// Version #1, Make Anonymous Class to implement Contract
		Contract firstContract = new Contract() {
			public void signPapers() {
				System.out.println("signed by John Doe");
			}
		};
		lawFirm.sealTheDeal(firstContract);
		
		// Version #2, Make Anonymous Class in the argument itself
		lawFirm.sealTheDeal(new Contract() {
			public void signPapers() {
				System.out.println("signed by Jane Dane");
			}
		});
		
	}
}

interface Contract {
	void signPapers();
}

class LawFirm {
	void sealTheDeal(Contract contract) {
		System.out.print("Client signing contract: ");
		contract.signPapers();
	}
}