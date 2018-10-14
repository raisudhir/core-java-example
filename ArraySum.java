package com.objective;

public class ArraySum {

	
		
        
    
        static int sum(int arr[]) {
        	//int arr[] = {1,2,3};
        	int sum = 0; // initialize sum
        // Iterate through all elements and add them to sum
        for (int i = 0; i < arr.length; i++) {
        	  sum +=  arr[i];
        	  
        }
        System.out.println(sum);
      
        return sum;
    }
	public static void main(String[] args) {
		sum(new int[] {4, 6, 5,8, 5, 20});
	
	}

}
