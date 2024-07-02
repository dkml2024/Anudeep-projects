package Overload;



class UserManage{
	public static void  authenticate(String username, String password) {
		System.out.println(username+" YOUR login successful.");
	}
	public static void authenticate(String email, long phoneno) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public static void  authenticate(long phoneno,int pin) {
		System.out.println(phoneno+" YOUR login successful using phoneNo.  ");
	}
	public static void authenticate(String email, int pin) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public static void authenticate(long phoneno,String password) {
		System.out.println(phoneno+"  YOUR  login successful using Phone No.");
	}
	
}
 class Authentication {

	public static void main(String[] args) {

		UserManage u =  new UserManage();
		UserManage.authenticate(969742686, 234567);
		UserManage.authenticate("dkmlakshmi27@gmail.com",993856060);
		UserManage.authenticate("dkml123", "*************");
		UserManage.authenticate("dkmvi@gmail.com", 1266897);
		UserManage.authenticate(970675986, "***********");

	}

}