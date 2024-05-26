package LAB6;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 599;
        int b = 260;
        int c = 630;

       int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The largest number is: " + largest);


	}

}
