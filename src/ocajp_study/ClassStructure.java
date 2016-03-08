package ocajp_study;



public class ClassStructure {

	public ClassStructure() {
		temperature=23.46f;
	}
	
	public float getTemperature() {
		
		return temperature;
	}
		

	public static void main(String[] args) {
		
		ClassStructure cs = new ClassStructure();
		System.out.println(cs.temperature);
		System.out.println(cs.getTemperature());
		
//		myPackage.SecretiveClass sc;

	}
	
	float temperature;
	
	

}
