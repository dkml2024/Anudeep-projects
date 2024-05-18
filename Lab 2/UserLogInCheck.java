package lab2;

import java.util.Scanner;

public class UserLogInCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="Vaishu";
		
		System.out.print("Enter username : ");
		Scanner sc1 = new Scanner(System.in);
		String uservalue=sc1.nextLine();
		if(uservalue.equals(username)) {
			
		   System.out.println("Username is valid and logged in");
		   
		}
		else {
		
		System.out.println("Username is not valid , unable to login");
		}
	}

}
