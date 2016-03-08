package packageMain;


public class Arrayss {
	
	String[] us =  {"Arun","is","from","Vellore"};

	public static void main(String[] args) {
		
	//Array Declaration
		
		int[] array; array = new int[5];
//		Anonymous Array
		
		int[] anArr;
		anArr = new int[] {1,2,3};
		
		Arrayss ar = new Arrayss();
		ar.joinStrings();
	}
	
	public void joinStrings(){
		String joinedStr = String.join(" ",us);
		System.out.println(joinedStr);
		
	}

}
