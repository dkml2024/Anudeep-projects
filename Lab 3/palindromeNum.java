package apjsfa;

public class palindromeNum {

	public static void main(String[] args) {
		
			    int num = Integer.parseInt(args[0]);
			    int reversedNum = 0;
			    int remainder;
			    
			    
			    int originalNum = num;
			    
			    // get the reverse of originalNum
			    // store it in variable
			    while (num != 0) {
			      remainder = num % 10;
			      reversedNum = reversedNum * 10 + remainder;
			      num/= 10;
			    }
			    
			    // check if reversedNum and originalNum are equal
			    if (originalNum == reversedNum) {
			      System.out.println(originalNum + " is Palindrome.");
			    }
			    else {
			      System.out.println(originalNum + " is not Palindrome.");
			    }
			  }
			

	}


