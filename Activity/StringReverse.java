package APJFSA;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String actual= "HAPPY"; 
		 String rev= ""; 
		 for(int h=actual.length()-1;h>=0;h--) 
		 { 
		 rev=rev+actual.charAt(h); 
		 } 
		 System.out.println("reverse of a string is : "+rev);
	}

}
