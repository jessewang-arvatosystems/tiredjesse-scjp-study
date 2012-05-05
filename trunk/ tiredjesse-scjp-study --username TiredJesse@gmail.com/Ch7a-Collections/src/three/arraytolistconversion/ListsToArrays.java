package three.arraytolistconversion;

import java.util.ArrayList;
import java.util.List;

public class ListsToArrays {
	
	public static void main(String args[]) {
		List<String> nameList = new ArrayList<String>(0);
		nameList.add("John");
		nameList.add("Jane");
		nameList.add("Bob");
		nameList.add("Mary");
		
		String[] names = new String[4];
		Object[] objNames;
		objNames = nameList.toArray();   // Version #1
		names = nameList.toArray(names); // Version #2
		
		for(Object name : objNames)
			System.out.println("ObjName: " + name);		
		
		for(String name : names)
			System.out.println("StrName: " + name);

		// Works with numbers too
		List<Integer> numList = new ArrayList<Integer>(0);
		numList.add(1);
		numList.add(5);
		numList.add(0);
		numList.add(7);
		numList.add(8);
		
		Integer[] nums = new Integer[4];
		Object[] objNums;
		objNums = numList.toArray();
		nums = numList.toArray(nums);
		
		for(Object num : objNums)
			System.out.println("ObjNum: " + num);		
		
		for(Integer num : nums)
			System.out.println("IntName: " + num);
	}

}
