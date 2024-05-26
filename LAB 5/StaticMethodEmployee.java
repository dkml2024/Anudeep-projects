package LAB5;

public class StaticMethodEmployee {


		static int id;
		   static String EmpName;
		   static String Company;
		   public static void createEmployee(){
		    System.out.println("Id :"+id);
		    System.out.println("Employee Name :"+EmpName);
		    System.out.println("Company :"+Company);

		   }

			 public static void main (String args[]) {
				 id=23;
		       EmpName="Lakshmi";
		       Company="mnc.com";
				createEmployee();

		
 

	}

}
