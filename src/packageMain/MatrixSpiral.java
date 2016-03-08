package packageMain;

import java.util.Scanner;

public class MatrixSpiral {
	
	//damn thing isnt working!!

	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
				
//				a[3][3]= { 	{1;  2;  3};
//						{7;  8;  9};
//						{13; 14; 15} };
		@SuppressWarnings("resource")
		Scanner sc= new Scanner( System.in);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		 
		    spiralPrint(3,3,a);
		    
		
	}

	static void spiralPrint(int m, int n, int a[][])
	{
	    int i, k = 0, l = 0;
	 
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	        /* Print the first row from the remaining rows */
	        for (i = l; i < n; ++i)
	        {
	            System.out.println(a[k][i]);
	        }
	        k++;
	 
	        /* Print the last column from the remaining columns */
	        for (i = k; i < m; ++i)
	        {
	        	System.out.println(a[i][n-1]);
	        }
	        n--;
	 
	        /* Print the last row from the remaining rows */
	        if ( k < m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	            	System.out.println(a[m-1][i]);
	            }
	            m--;
	        }
	 
	        /* Print the first column from the remaining columns */
	        if (l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	            	System.out.println(a[i][l]);
	            }
	            l++;    
	        }        
	    }
	}
	 
	/* Driver program to test above functions */
	
	
	    
	
}
