package one.introduction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

@SuppressWarnings({ "rawtypes", "unused" })
public class CollectionHierarchy {
	
	public static void main(String[] args) {
		// Sets, lists and queues all extend Collection
		Collection c1 = new HashSet(); // Sets do not allow duplicate elements
		Collection c2 = new ArrayList(); // Lists are more powerful versions of Arrays
		Collection c3 = new PriorityQueue(); // Queues do - First In, First Out (FIFO)
											 // Stacks (not mentioned here) do - Last In, First Out (LIFO)
		
		// Arrays and Maps are not part of the Collection interface!
//		Collection c4 = new int[5];
//		Collection c5 = new HashMap();
		
		// Sets
		Set s1 = new HashSet(); // Fastest access
		Set s2 = new LinkedHashSet(); // Ordered by insertion order
		Set s3 = new TreeSet(); // Sorts in natural ascending order, implements NavigableSet
								// Will throw ClassCastException if the type inserted does not implement Comparable
		
		// Lists
		List l1 = new ArrayList(); // Fastest iteration
		List l2 = new Vector(); // Synchronized version of ArrayList
		List l3 = new LinkedList(); // Fast insertion and deletion, implements Queue and List
		
		// Queues
		Queue q1 = new PriorityQueue(); // Does a Priority In, Priority Out (PIPO). Sorts elements in
										// natural ascending order and deals with the element with the
										// highest priority (first element)
		Queue q2 = new LinkedList();	// Description in Lists section
		
		// Maps
		Map m1 = new HashMap(); // Fast access, can have a null key and null values
		Map m2 = new Hashtable(); // Synchronized version of HashMap, cannot have a null key or null values
		Map m3 = new LinkedHashMap(); // Ordered by insertion order and last accessed order, fast iteration
		Map m4 = new TreeMap(); // Sorts in natural ascending order, implements NavigableMap
								// Will throw ClassCastException if the type of the key inserted does not implement Comparable
	}

}
