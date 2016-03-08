package packageMain;

public class ACMEBicycle implements Bike {
	int speed=0;
	int cadence=0;
	int gear=1;
	
	public void ChangeSpeed(int newSpeed){
		speed = newSpeed;
	}
	
	public void ChangeCadence(int newCadence){
		cadence = newCadence;
	}
	
	public void ChangeGear(int newGear){
		gear = newGear;
	}
	
	public void printState(){
		System.out.println("Speed is "+ speed);
		System.out.println("Cadence is "+ cadence);
		System.out.println("Gear is "+ gear);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		System.out.println("This is my First Java Program!");
		
		Bicycle bicyc = new Bicycle();

		
		bicyc.printState();
		
//		Bicycle 1
		System.out.println("");
		System.out.println("Speeding up!");
		System.out.println("");

		bicyc.ChangeCadence(48);
		bicyc.ChangeGear(4);
		bicyc.ChangeSpeed(25);
		
		bicyc.printState();
		
		
//		Bicycle 2
		System.out.println("");
		System.out.println("Bicycle 2:");
		
		Bicycle bicyc2 = new Bicycle();
		bicyc2.printState();
		
		System.out.println("");
		System.out.println("Speeding up!");
		System.out.println("");

		bicyc2.ChangeCadence(72);
		bicyc2.ChangeGear(4);
		bicyc2.ChangeSpeed(40);
		
		bicyc2.printState();
		
	}

}