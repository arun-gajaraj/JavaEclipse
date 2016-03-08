package exercisesOCAJP;

public class Casting {

	public static void main(String[] args) {
		
		float fl_var = 234.56f;
		
		short sh_var =(short) fl_var;  //Explicit Casting as its Narrowing conversion
		
		
		System.out.println("Float Value is "+ fl_var);
		System.out.println("Short Value after casting is "+ sh_var);

	}

}
