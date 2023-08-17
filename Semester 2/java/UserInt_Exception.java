import java.util.Scanner;

class Positive_Integer extends Exception{

	Positive_Integer(String s){
		
		super(s);
		
	}
	
}
class UserInt_Exception{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Positive Number: ");
			
		int n= sc.nextInt();
		
		try{
		
			if(n<0){
				
				throw new Positive_Integer("It is not a positive number,it is a Negative number");
			}
			
			else{
			 	System.out.println("Positive number");
			
			}
		}
		catch(Positive_Integer a){
		
			System.out.println(a);
		}
	}
	
}
