package anudeepfound;

class Hillstation {
	 
	 void location() {
	        System.out.println("In Super class location method ");
	    }

	    void famousFor() {
	        System.out.println("In Super class location method");
	    }
	}

	class Manali extends Hillstation {
	   
	    void location() {
	        System.out.println("Location: MANALI");
	    }

	  
	    void famousFor() {
	        System.out.println("Famous for:HILLS");
	    }
	}

	class Mussoorie extends Hillstation {

	    void location() {
	        System.out.println("Location: Mussoorie");
	    }

	  
	    void famousFor() {
	        System.out.println("Famous for: SWEETS");
	    }
	}

	class Gulmarg extends Hillstation {
	   
	    void location() {
	        System.out.println("Location: Gulmarg");
	    }

	    void famousFor() {
	        System.out.println("Famous for: GUNS");
	    }
	}

	public class Hillstations{
	    public static void main(String[] args) {
	    	 
	    	// TODO Auto-generated method stub  
	          
	          Manali manali = new Manali();
	          manali.location();
	          manali.famousFor();

	          Mussoorie mussoorie = new Mussoorie();
	          mussoorie.location();
	          mussoorie.famousFor();

	          Gulmarg gulmarg = new Gulmarg();
	          gulmarg.location();
	          gulmarg.famousFor();
	    }
	}
		
