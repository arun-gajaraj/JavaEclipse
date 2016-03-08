package packageMain;

public class StackOverfError {

	public static void main(String[] args) {
		
		go();

	}

	private static void go() {
		go2();
		
	}

	private static void go2() {
		go();
	}

	
	//This Program throws Stack Overflow Error using recursion
}
