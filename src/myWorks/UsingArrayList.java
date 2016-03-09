package myWorks;

import java.util.ArrayList;

public class UsingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("Arun");
		
		System.out.println(aList.add("Divakar")); // add method returns boolean
		System.out.println(aList);
		
		System.out.println(aList.indexOf("Divakar"));
		System.out.println(aList.contains(aList.get(1)));
//		aList.set(2, "Vignesh");	//Can only set. Cant add
		aList.add(2, "Vignesh");
		System.out.println("Before change");
		System.out.println(aList);
		
		System.out.println("aList Size is " + aList.size());
		System.out.println(aList.set(2, "Valar"));	// Prints before setting
		System.out.println(aList.get(2));
		
		aList.set(2, "Shiva");
		System.out.println("Printing final ArrayList");
		System.out.println(aList.toString());
	}

}
