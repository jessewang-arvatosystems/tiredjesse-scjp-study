package three.synchronization;

public class SynchronizedClass extends Thread {
	StringBuffer letter;

	public SynchronizedClass(StringBuffer letter) {
		this.letter = letter;
	}

	public void run() {
		synchronized (letter) {
			for (int i = 1; i <= 100; ++i)
				System.out.print(letter);
			System.out.println();
			char temp = letter.charAt(0);
			++temp; // Increment the letter in StringBuffer:
			letter.setCharAt(0, temp);
		}
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		new SynchronizedClass(sb).start();
		new SynchronizedClass(sb).start();
		new SynchronizedClass(sb).start();
	}
}
