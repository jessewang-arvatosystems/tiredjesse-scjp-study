package four.genericdeclarations;

import java.util.LinkedList;
import java.util.List;

public class GenericMethodsAdvanced {

	// The goal is to return a reverse list, like Collections.reverse()
	public <T> List<T> backwards(List<T> numList) {
		List<T> output = new LinkedList<T>();
		for(T element : numList)
			output.add(0, element);
		return output;
	}
	
	public <T> List<T> backwards1(List<? extends T> numList) {
		List<T> output = new LinkedList<T>();
		for(T element : numList) // Valid, if T = Object, ? = String,  it's like Object obj = new String("str");
			output.add(0, element);
		return output;
	}
	
//	public <T> List<T> backwards2(List<T extends ?> numList) { // Wild card can NEVER be extended/supered on
//		List<T> output = new LinkedList<T>();
//		for(T element : numList)
//			output.add(0, element);
//		return output;
//	}
	
//	public <T,X> List<T> backwards2(List<T super X> numList) { // Makes no sense, generic type cannot extend/super another generic type
//		List<T> output = new LinkedList<T>();
//		for(T element : numList)
//			output.add(0, element);
//		return output;
//	}
	
//	public <T> List<T> backwards2(List<? super T> numList) {
//		List<T> output = new LinkedList<T>();
//		for(T element : numList) // Problem is on this line ? can be a super of T. 
								 // So if T = String, ? = Object,  it's like String str = new Object();
//			output.add(0, element);
//		return output;
//	}
	
//	public <T> List<T> backwards2(List<?> numList) {
//		List<T> output = new LinkedList<T>();
//		for(T element : numList) // Also will not work ? can be a non-related type to T
//			output.add(0, element);
//		return output;
//	}
	
	public <T> List<? extends T> backwards3(List<T> numList) {
		List<T> output = new LinkedList<T>();
		for(T element : numList)
			output.add(0, element);
		return output; // Valid, List<T> will always fulfill List<? extends T>
	}
	
	public <T> List<? super T> backwards4(List<T> numList) {
		List<T> output = new LinkedList<T>();
		for(T element : numList)
			output.add(0, element);
		return output; // Valid, List<T> will always fulfill List<? super T>
	}
	
//	public <? extends T> List<T> backwards5(List<T> numList) { // Wild card not allowed in generic declaration
//		List<T> output = new LinkedList<T>();
//		for(T element : numList)
//			output.add(0, element);
//		return output;
//	}
	
	// The following also work:
	public <T> List<? extends T> backwards6(List<? extends T> numList) {
		List<T> output = new LinkedList<T>();
		for(T element : numList)
			output.add(0, element);
		return output;
	}
	
	public <T> List<? super T> backwards7(List<? extends T> numList) {
		List<T> output = new LinkedList<T>();
		for(T element : numList)
			output.add(0, element);
		return output;
	}
	
}