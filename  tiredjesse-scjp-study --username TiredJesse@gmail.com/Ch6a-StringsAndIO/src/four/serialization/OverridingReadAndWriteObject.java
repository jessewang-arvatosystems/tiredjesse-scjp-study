package four.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class OverridingReadAndWriteObject {
	public static void main(String[] args) {
		Classroom c = new Classroom(321, 20);
		School s = new School(c);
		School s2 = null;
		
		System.out.println("s School size is: " + s.getClassroom().getClassroomSize());
		System.out.println("s Number students is: " + s.getClassroom().getNumberStudents());
		
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
		System.out.println("s2 Number students is: " + s2.getClassroom().getNumberStudents());
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
		
		// To avoid this null pointer exception scenario
		// implement writeObject() and readObject() methods
		private void writeObject(ObjectOutputStream oos)  {
			try {
				oos.defaultWriteObject();
				oos.writeInt(classroom.getClassroomSize());
				oos.writeInt(classroom.getNumberStudents()); // The order matters!
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private void readObject(ObjectInputStream ois) {
			try {
				ois.defaultReadObject();
				classroom = new Classroom(ois.readInt(), ois.readInt()); // Note readInt first reads classroomSize then reads numberStudents
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	private static class Classroom { // If Classroom can't be implemented Serializable (due to encapsulation)
									 // Mark the Classroom parameter in House as "transient"
		
		private int classroomSize;
		private int numberStudents;
		
		Classroom(int classroomSize, int numberStudents) {
			this.classroomSize = classroomSize;
			this.numberStudents = numberStudents;
		}
		
		public int getClassroomSize() {
			return classroomSize;
		}
		
		public int getNumberStudents() {
			return numberStudents;
		}
	}
}
