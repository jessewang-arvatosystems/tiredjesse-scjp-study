package four.serialization;

import java.io.Serializable;

public class SerializeRelatedObjects extends FileIO {
	public static void main(String[] args) {
		Classroom c = new Classroom(321);
		School s = new School(c);
		School s2 = null;
		
		System.out.println("s School size is: " + s.getClassroom().getClassroomSize());
		
		outputObjectToFile(s);
		
		s2 = inputObjectFromFile();
		
		System.out.println("s2 School size is: " + s2.getClassroom().getClassroomSize());
	}
	private static class School implements Serializable { // Must serialize!
		
		private static final long serialVersionUID = 6926246613961754656L;
		private Classroom classroom;
		
		School(Classroom classroom) {
			this.classroom = classroom;
		}
		
		public Classroom getClassroom() {
			return classroom;
		}
	}
	
	private static class Classroom implements Serializable { // Connected to School, also must serialize!
		
		private static final long serialVersionUID = -764392848423316039L;
		private int classroomSize;
		
		Classroom(int classroomSize) {
			this.classroomSize = classroomSize;
		}
		
		public int getClassroomSize() {
			return classroomSize;
		}
	}
}
