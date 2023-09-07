import java.util.*;
class Invalid extends Exception{
	public Invalid(String s){
		super(s);
	}
}
class UserLogin{
	public static void main(String[] args){
		String uname,pass;
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter Username: ");
			uname=sc.next();
			System.out.println("Enter Password: " );
			pass=sc.next();
			check(uname,pass);
		}
		catch(Invalid e){
			System.out.println(e);
		}
	}
	static void check(String uname,String pass) throws Invalid{
		if(uname.equals("Abel")&&pass.equals("Abel123"))
			System.out.println("Login success");
		else
			throw new Invalid("Invalid credentials");
	}
}
	
			
			