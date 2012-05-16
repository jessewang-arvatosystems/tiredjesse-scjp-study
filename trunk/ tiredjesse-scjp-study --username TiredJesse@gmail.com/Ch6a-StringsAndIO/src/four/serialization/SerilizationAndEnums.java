package four.serialization;

import java.io.Serializable;

// Enums don't need to implement Serializable.
// They are serilizable by default.

public class SerilizationAndEnums extends FileIO {

	public static void main(String... args) {
		Zoo zoo = new Zoo(new Animal[]{Animal.ELEPHANT, Animal.ZEBRA});
		Zoo zoo2 = null;
		
		outputObjectToFile(zoo);
		
		zoo2 = inputObjectFromFile();
		
		for(Animal a : zoo2.getAnimals()) {
			System.out.println(a);
		}
	}
	
}

class Zoo implements Serializable {
	private static final long serialVersionUID = -3843894763485303729L;
	private Animal[] animals;
		
	Zoo(Animal[] animals) {
		this.animals = animals;
	}

	public Animal[] getAnimals() {
		return animals;
	}
}

enum Animal { // enums always implement serializable!
	ELEPHANT,
	ZEBRA,
	LION,
	WALRUS;
}
