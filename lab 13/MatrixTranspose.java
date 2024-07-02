package lab13;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        
	       
	        System.out.print("Enter the number of rows: ");
	        int rows = input.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = input.nextInt();
	        
	        int[][] matrix = new int[rows][cols];
	        
	 
	        System.out.println("Enter the matrix elements:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = input.nextInt();
	            }
	        }
	        
	     
	        int[][] transpose = new int[cols][rows];
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                transpose[i][j] = matrix[j][i];
	            }
	        }
	        
	  
	        System.out.println("Original Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	      
	        System.out.println("Transpose Matrix:");
	        for (int i = 0; i < cols; i++) {
	            for (int j = 0; j < rows; j++) {
	                System.out.print(transpose[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        input.close();
		

	}

}
