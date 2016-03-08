package myWorks;

import java.util.StringJoiner;

public class UsingStringJoiner {

	public static void main(String[] args) {

		
//		With Prefix and Suffix
		StringJoiner sj = new StringJoiner(":", "(", ")");
		
		sj.add("4A");
		sj.add("3D");
		sj.add("4E");
		sj.add("5G");
		sj.add("U4");
		sj.add("K9");
		
		System.out.println("StringJoiner Output:");
		System.out.println(sj);
		
		
//		Without Prefix and Suffix!!
		StringJoiner sj2 = new StringJoiner("<>");
		
		sj2.add("Hi");
		sj2.add("Hello!!!");
		
		System.out.println(sj2);
		

	}

}
