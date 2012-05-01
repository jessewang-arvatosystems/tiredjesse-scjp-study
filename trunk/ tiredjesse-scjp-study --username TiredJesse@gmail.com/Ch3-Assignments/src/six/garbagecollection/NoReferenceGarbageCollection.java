package six.garbagecollection;

public class NoReferenceGarbageCollection {

	@SuppressWarnings("unused")
	public static void main(String... trashCollection) {
		Trash trashOne = new Trash(); // #1
		Trash trashTwo = new Trash(); // #2
		trashOne = trashTwo;
		
		//#1 object now available for garbage collection
		
		System.gc(); 

		// Some long method
		for(int i=0; i<100000; i++) {} 
	}
	
}
