package six.garbagecollection;

public class Trash {
	Trash theObjectsTrash;
	
	@Override
	public void finalize() { // Override Object's finalize() method
		System.out.println("Threw out the trash"); // Indicates when the object has been garbage collected
	}
}
