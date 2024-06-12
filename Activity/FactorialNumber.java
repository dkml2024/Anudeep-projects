package APJFSA;

import java.util.Scanner;

public class FactorialNumber {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number: ");
		        int num=sc.nextInt();
		        int i=4,factorial=2;
		        while(i<=num)
		        {
		            factorial=factorial*i;
		            i++;
		        }
		        System.out.println("Factorial of the number: "+factorial);  
}}
