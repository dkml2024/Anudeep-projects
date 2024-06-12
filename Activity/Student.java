package APJFSA;

public class Student{
		
		   String name;
		    int rollNo;
		    char section;
		    
		    Student(String name, int rollNo ,char section)
		    {
		        this.name = name;
		        this. rollNo = rollNo;
		        this.section= section;
		                
		    }
		    
		    public void studentData()
		    {
		        System.out.println("Name of Student = " + name);
		        System.out.println("Roll no = "+ rollNo);
		        System.out.println("Section = "+ section);
		       
		    }
		    
		    public static void main (String arg[])
		    {
		             // Creating object and providing some values by using parameterized constructor
		        
		        Student s1 = new Student("Lakshmi", 27,'c');
		        s1.studentData();
		        
		        Student s2 = new Student("Maha", 43, 'a');
		        s2.studentData();
		        
	}

}
