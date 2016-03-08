package packageMain;

import java.util.Scanner;

public class PrimeOrNot {
	
	static int temp;
	static boolean primeisit;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The input is: "+num);
		
		PrimeOrNot.IsItPrime(num);
		
		if (!primeisit) {
			System.out.println("The Input "+ num + " is a prime number");
		} else {
			System.out.println("The number " + num + "is not a prime number");
		}

	}

	//Method Logic
	private static void IsItPrime(int num) {
				
		for (int i = 2; i <= num/2; i++) {
			temp = num%i;
			if (temp==0) {
				primeisit=true;
			}
			
		}
		
	}


}
