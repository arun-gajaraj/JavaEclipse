package packageMain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepPropagate {
	
	static String reverse(String str) {
		String RevString="";
		int strLen = str.length();
		
		for (int i = strLen-1; i >=0; i--) {
			RevString += str.charAt(i);
			}
		return RevString;
		}


	public static void main(String[] args) throws IOException {
		
		
//		try {
//			System.out.println(reverse("Arun")); //No Exception
//			System.out.println(reverse("")); //No Exception
//			System.out.println(reverse(null)); //Exception
//		} catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//			System.out.println("Inside catch");
//		} finally {
//			System.out.println("finally being executed");
//		}
		
		try{
			throw new IOException();
		}finally{
			System.out.println("Manually thrown exception");
		}
		
	}

}
