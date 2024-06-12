package APJFSA;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
          int rev = 0;
        for (; n!= 0; n /= 10) {
            rev= rev * 10 + n % 10;
        }
        System.out.println("Reverse int number: " + rev);
    

	}

}
