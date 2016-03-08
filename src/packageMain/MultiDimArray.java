package packageMain;

public class MultiDimArray {

	public static void main(String[] args) {
//		
//		String[][][] stringArray = {{	{"Arun","Chennai"},	{"Valar","Chennai"},	{"Divakar","Chennai"}	},
//									{	{"Uma","Chennai"},	{"Mamatha","Chennai"},{"Shiva","Chennai"}	},
//									{	{"Ananth","Chennai"},	{"Vignesh","Chennai"},{"Shreya","Chennai"}	}};
//		
//		
//		for (int i = 0; i < stringArray.length; i++) {
//			
//		for (int j = 0; j < stringArray[i].length; j++) {
//			
//			for (int k = 0; k < stringArray[i][j].length; k++) {
//				
//				System.out.println(stringArray[i][j][k]);
//			}
//			
//			}	
//			
//		}
//		
//		System.out.println(stringArray.length);
//		System.out.println(stringArray[0].length);
//		System.out.println(stringArray[0][0].length);
		
		
		
		int[][][] intArray = new int[3][3][3];
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[0].length; j++) {
				for (int k = 0; k < intArray[0][0].length; k++) {
					
					intArray[i][j][k]=i+j+k;
					
				}
			}
		}
		
		
		//ASK VIGNESH
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[0].length; j++) {
				for (int k = 0; k < intArray[0][0].length; k++) {
		
				System.out.print( intArray[i][j][k] );
				System.out.print("\t");
				}
				System.out.println("");
			}
			System.out.println("");
			System.out.println(" ");
//		}
		
//		char[] charArray = {'a','r','u','n'};
//		char[] anotherCharArray; anotherCharArray = new char[4];
//		
//		System.arraycopy(charArray, 0, anotherCharArray, 0, 4);
//		
//		System.out.println(charArray);
//		System.out.println(anotherCharArray);
//		
//		if (charArray.equals(anotherCharArray)) { //Conditional expression works for string, not for Arrays
//			
//			System.out.println("The array is copied!");
//			
//		} else {
//			System.out.println("The array isn't copied!");
//			
			//ASK VIGNESH THE CODER!
			
			
		}
	}

}
