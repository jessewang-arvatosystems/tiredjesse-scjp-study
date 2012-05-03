package four.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("unused")
public class SerializeRelatedObjectsPt4 {

	public static void main(String... args) {
		Child firstChild = new Child();
		Child secondChild = null;
		
		System.out.println("Before writing object output stream");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("testSer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(firstChild);
			oos.flush();
			oos.close();
			
			System.out.println("Reading object input stream");
			
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			secondChild = (Child) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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