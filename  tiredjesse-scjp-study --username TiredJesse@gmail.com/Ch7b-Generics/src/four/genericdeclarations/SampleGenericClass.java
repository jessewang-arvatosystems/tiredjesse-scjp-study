package four.genericdeclarations;

import java.util.HashMap;
import java.util.Map;

// Generics are almost always used for Collections
// But on rare occasions it might be necessary to write Generic Classes and Methods

public class SampleGenericClass {

	// Note this should have really been done through JUnit test
	// The gist of this class is to demonstrate basic CRUD implementation with a ClassRoster
	// The class roster has an overloaded constructor so that it can accept other class rosters
	public static void main(String... generics) throws InvalidIDException {
		ClassRosterDatabase roster = new ClassRosterDatabase();
		
		roster.create(1, "Jacob");
//		roster.create(1, "Henry"); // ID already exists
		roster.create(2, "Richard");
		roster.create(3, "Susan");
		System.out.println(roster.retrieve(1));
		System.out.println(roster.retrieve(2));
//		System.out.println(roster.retrieve(5)); // ID does not exist
		roster.update(1, "Catherine");
//		roster.update(5, "Jacob"); // ID does not exist
		System.out.println(roster.retrieve(1));
		
		ClassRosterDatabase anotherRoster = new ClassRosterDatabase(roster); // Move all information to another roster	
		
		anotherRoster.delete(1);
		anotherRoster.delete(2);
		anotherRoster.delete(3);
//		roster.delete(5); // ID does not exist
		System.out.println(anotherRoster.containsID(1));
		System.out.println(anotherRoster.containsID(2));
		System.out.println(anotherRoster.containsID(3));
	}

}

interface DatabaseFunction<I, E> {
	boolean create(I id, E element) throws InvalidIDException;
	E retrieve(I id) throws InvalidIDException;
	boolean update(I id, E element) throws InvalidIDException;
	boolean delete(I id) throws InvalidIDException;
	boolean containsID(I id);
}

class ClassRosterDatabase implements DatabaseFunction<Integer, String> {
	
	private final Map<Integer, String> classRoster;
	
	// Add functionality so that a roster can start empty or start with an initial roster
	public ClassRosterDatabase() {
		this.classRoster = new HashMap<Integer, String>(); 
	}
	
	public ClassRosterDatabase(final ClassRosterDatabase classRosterDatabase) {
		this.classRoster = classRosterDatabase.classRoster; 
	}
	
	public boolean create(final Integer id, final String element) throws InvalidIDException {
		if (containsID(id))
			throw new InvalidIDException("The ID already exists!");
		
		classRoster.put(id, element);
		
		return containsID(id);
	}

	public String retrieve(final Integer id) throws InvalidIDException {
		if (!containsID(id))
			throw new InvalidIDException("The ID does not exist!");
		
		return classRoster.get(id);
	}

	public boolean update(final Integer id, final String element) throws InvalidIDException {
		if (!containsID(id))
			throw new InvalidIDException("The ID does not exist!");
		
		classRoster.put(id, element);
		
		return classRoster.get(id).equals(element);
	}

	public boolean delete(final Integer id) throws InvalidIDException {
		if (!containsID(id))
			throw new InvalidIDException("The ID does not exist!");
		
		classRoster.remove(id);
		
		return !containsID(id);
	}

	public boolean containsID(final Integer id) {
		return classRoster.containsKey(id);
	}
	
}

@SuppressWarnings("serial")
class InvalidIDException extends Exception {
	InvalidIDException(final String msg) {
		super(msg);
	}
}
