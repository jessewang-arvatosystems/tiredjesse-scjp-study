package six.garbagecollection;

public class IslandsOfIsolation {
	
	
	public static void main(String args[]) {
		Trash one = new Trash();
		Trash two = new Trash();
		Trash three = new Trash();
		
		// Point the Trash member variable of each object to another Trash object
		one.theObjectsTrash = two;
		two.theObjectsTrash = three;
		three.theObjectsTrash = one;
		
		one = null;
		two = null;
		three = null;
		
		// Three objects now available for garbage collection
		
		System.gc(); 

		// Some long method
		for(int i=0; i<100000; i++) {} 	
	}

}
