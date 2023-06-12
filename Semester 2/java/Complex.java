import java.util.Scanner;

class Add{

	int re,im;
	
	Add(int r,int i){
		
		re=r;
		
		im= i;
		
		System.out.println(re+"+"+im+"i");
	}
}

class Complex{
	
	public static void main(String[] args){
			
			int real,imaginary,i;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter 2 complex number: ");
			
			for(i=0;i<2;i++){
			
			System.out.println("Enter real part: ");
			
			real = s.nextInt();
			
			System.out.println("Enter imaginary part: ");
			
			imaginary = s.nextInt();
			
			Add c = new Add(real,imaginary);
			
			}
		
			
			
		}
		
}
