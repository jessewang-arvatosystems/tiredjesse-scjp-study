package four.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeRelatedObjectsPt2 {
	public static void main(String[] args) {
		Classroom c = new Classroom(321);
		School s = new School(c);
		School s2 = null;
		
		System.out.println("s School size is: " + s.getClassroom().getClassroomSize());
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("testSer.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s2 = (School) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("s2 School size is: " + s2.getClassroom().getClassroomSize());
	}
	private static class School implements Serializable { // Must serialize!
		
		private static final long serialVersionUID = 6926246613961754656L;
		private transient Classroom classroom; // When set as transient, will result in a null pointer exception
											   // when trying to access after deserialization
		
		School(Classroom classroom) {
			this.classroom = classroom;
		}
		
		public Classroom getClassroom() {
			return classroom;
		}
	}
	
	private static class Classroom { // If Classroom can't be implemented Serializable (due to encapsulation)
									 // Mark the Classroom parameter in House as "transient"
		
		private int classroomSize;
		
		Classroom(int classroomSize) {
			this.classroomSize = classroomSize;
		}
		
		public int getClassroomSize() {
			return classroomSize;
		}
	}
}
