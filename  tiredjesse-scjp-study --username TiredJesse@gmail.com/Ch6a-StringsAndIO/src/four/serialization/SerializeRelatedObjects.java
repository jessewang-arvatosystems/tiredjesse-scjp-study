package four.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeRelatedObjects {
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
