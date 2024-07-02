package Petrons;

public class PetronC {

	public static void main(String[] args) {
		
		int n=5;
		 for(int r=1; r<=n; r++ )
		 {	
		 for(int c=1; c<=n-r;  c++)
		 {
	 System.out.print( " "); 
		 }
		 for (int p=1; p<=2*r-1; p++) {
			 System.out.print("*"); 
		 }
		 System.out.println();
	}

	}

}
