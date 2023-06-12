class Compobj{

	int real,imaginary;
	
	Compobj(int r,int i){
		
		real = r;
		
		imaginary = i;
		
		System.out.println("Complex number is: "+real+"+"+imaginary+"i");
		
		
	}
	
	int display(){
	
		System.out.println("Sum: "+real+"+"+imaginary+"i");
		
		return 0;
	}
	
}

class CompMain{
	
	public static void main(String[] args){
		
		Compobj c1= new Compobj(12,23);

		Compobj c2 = new Compobj(5,10);
		
		int re= c1.real+c2.real;
		
		int im=c1.imaginary+c2.imaginary;
		
		Compobj c3 = new Compobj(re,im);
		
		c3.display();
	}
		
}
	
