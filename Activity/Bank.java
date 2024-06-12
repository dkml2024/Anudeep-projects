package APJFSA;

public class Bank{

	 int acno;
	    String atype;
	    double amount;
	    
	   public Bank(String atype, int acno)
	    {
	        this.atype = atype;
	        this. acno = acno;
	    }
	    
	    public Bank(int acno, String atype ,long m)
	    {
	        this.acno = acno;
	        this. atype = atype;
	        this.amount = m;
	             
	    }
	    
	    public void Bank ()
	    {
	        System.out.println("Account Number= " + acno);
	        System.out.println("Account Type= "+ atype);
	        System.out.println("Amount = "+ amount);
	        
	    }
	    
	    public static void main (String arg[])
	    {
	        Bank Bank1 = new Bank("Savings",98497311);
	        Bank1.Bank();
	        
	        Bank Bank2= new Bank( 98497311, "Current",5624 );
	        Bank2.Bank();

	}

}
