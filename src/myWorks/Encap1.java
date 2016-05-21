package myWorks;

public class Encap1 extends Encap2 {

	public void encapmeth1(){
		System.out.println("Encap method 1 is called! Sub class");
		
	}
	public static void main(String[] args) {

		Encap2 en = new Encap1();
		en.encapmeth1();
	}

}
