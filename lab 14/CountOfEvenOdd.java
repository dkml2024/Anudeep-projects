package lab14;

public class CountOfEvenOdd {

	public static void main(String[] args) {
		
		int arr[] = {10,54,71,39,41, 20, 60, 31, 88,75, 45, 83,99,33,11};
		
	     int n = arr.length;
	     int countEven = 0, countOdd = 0;

	     for(int i=0; i<n; i++){
	         if((arr[i] & 1 )== 0)
	           countEven += 1;

	         else
	           countOdd += 1;
	         
	     }
	     System.out.println("Even Elements count : "+ countEven);
	     System.out.println("Odd Elements count : "+ countOdd);
		
	}

}
