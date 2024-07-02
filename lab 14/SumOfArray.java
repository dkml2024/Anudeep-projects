package lab14;

public class SumOfArray {

	public static void main(String[] args) {
		
		int [] arr = new int [] {1, 2, 3, 4, 5,6,7,8,9,};  
        int sum = 0;  
        
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        } 
        
        System.out.println("Sum of all the elements of an array: " + sum);  
		
	}

}
