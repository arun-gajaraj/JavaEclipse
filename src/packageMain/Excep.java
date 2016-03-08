package packageMain;

public class Excep {
	
	//The Program Throws Exception on purpose
	//See how exception is thrown and passed down to each method
	
	static void method1(){
		System.out.println("Method model");
		
		rootEXception();
	}
	
	static void rootEXception() {
		int x=5/0;
		System.out.println(x);
				
	}

	static void callAnException(){
		System.out.println("Exception is called");
		
		method1();
	}

	public static void main(String[] args) {
		
		callAnException();
		
	}

}
