package packageMain;

import java.util.Scanner;

public class BubbleSort {

	static int n;
	static int[] array;
	


	private static void display(int[] array2) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
			
		}
		
	}

	private static void sortasc(int[] array2) {
		
		int swap;
		for (int p = 0; p < array2.length-1; p++) {
			for (int q = 0; q < array2.length-p-1; q++) {
				if (array2[q] > array2[q+1]) {
					swap = array2[q+1];
					array2[q+1]=array2[q];
					array2[q]=swap;
				}
				
			}
			
		}
	}

	private static void sortdesc(int[] array2) {
		
		int swap;
		for (int p = 0; p < array2.length-1; p++) {
			for (int q = 0; q < array2.length-p-1; q++) {
				if (array2[q] < array2[q+1]) {
					swap = array2[q+1];
					array2[q+1]=array2[q];
					array2[q]=swap;
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		n= sc.nextInt();
		
		array = new int[n];
		System.out.println("Enter n numbers to sort");
		for (int i = 0; i < n; i++)
			array[i]=sc.nextInt();
		
		sortasc(array);
		System.out.println("Ascending order");
		display(array);
		System.out.println("Descending order");
		sortdesc(array);
		display(array);
	}
}
