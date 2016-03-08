package ocajp_study;

public class MemberInitialisation {

	
	int i;
	float f;
	double d;
	String st;
	byte b;
	short sh;
	boolean bl;
	
	
	public static void main(String[] args) {
		
//		int i;
//		float f;
//		double d;
//		String st;
//		byte b;
//		short sh;
//		boolean bl;		//Local variables can't be used without initialisation
		
		MemberInitialisation mi = new MemberInitialisation();
		
		//Default values of class variables
		
		System.out.println(" " + mi.i);
		System.out.println(" " + mi.f);
		System.out.println(" " + mi.d);
		System.out.println(" " + mi.st);
		System.out.println(" " + mi.b);
		System.out.println(" " + mi.sh);
		System.out.println(" " + mi.bl);

	}

}
