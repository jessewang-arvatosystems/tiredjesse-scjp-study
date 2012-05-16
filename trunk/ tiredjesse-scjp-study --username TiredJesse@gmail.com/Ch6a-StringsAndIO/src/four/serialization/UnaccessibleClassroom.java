package four.serialization;

import java.io.Serializable;

public class UnaccessibleClassroom extends FileIO {
	public static void main(String[] args) {
		Classroom c = new Classroom(321);
		School s = new School(c);
		School s2 = null;
		
		System.out.println("s School size is: " + s.getClassroom().getClassroomSize());
		
		outputObjectToFile(s);
		
		s2 = inputObjectFromFile();
		
		try {
			System.out.println("s2 School size is: " + s2.getClassroom().getClassroomSize());
		} catch (NullPointerException ex) {
			System.out.println("Error loading s2 school's size");
		}
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
