package four.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("unused")
public class UnaccessibleParentClass extends FileIO {

	public static void main(String... args) {
		Child firstChild = new Child();
		Child secondChild = null;
		
		System.out.println("Before writing object output stream");
		
		outputObjectToFile(firstChild);
		
		System.out.println("Reading object input stream");
		
		secondChild = inputObjectFromFile();
	}
	
}

class Parent { // Because not serialized, the parent constructor runs again once deserialized
	
	Parent() {
		System.out.println("Parent constructor ran");
	}
	
}

class Child extends Parent implements Serializable {

	private static final long serialVersionUID = 5960564448660444690L;
	
	Child() {
		System.out.println("Child constructor ran");
	}
}