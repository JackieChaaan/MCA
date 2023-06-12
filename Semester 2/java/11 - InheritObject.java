import java.util.*;
class Base{
	int id;
	String name;

	Base(){ 			// Default Constructor
		id = 0; 	
		name = null; 
	}			
		
	Base(int id, String name){	// Parameterized Constructor
		this.id = id;
		this.name = name;

	}
	
	public void display(){
		System.out.print(id+ "\t "+name+"\t");
	}
}

class Derived extends Base{
	int stock;
	float rate;

	Derived(){			// Default Constructor
		stock = 0;
		rate = 0; 
	 }
		
	Derived(int id, String name, int stock, float rate){
		super(id, name);		// Parameterized Constructor
		this.stock = stock;
		this.rate = rate;
	}
	public void display(){
		super.display();	
		System.out.print(stock + "\t"+ rate+"\n");
	}
}

class InheritObject{
	static void readItem(Derived[] d){
		int id, stock;
		String name;
		float rate;
		Scanner sc = new Scanner(System.in);

		for (int i=0; i<d.length; i++){
			System.out.print("Id ?: ");
			id = sc.nextInt();    
			System.out.print("Name ?: ");
			name = sc.next();
			System.out.print("Stock ?: ");
			stock = sc.nextInt();
			System.out.print("Rate ?: ");
			rate = sc.nextFloat();
			d[i] = new Derived(id, name, stock, rate);
		}
	}

	static void displayItem(Derived[] d){
		for (int i=0; i<d.length; i++){
			System.out.print("Item "+ (i+1) +":");
			d[i].display();
		}
	}
	public static void main(String a[]){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of items ?: ");
		n = sc.nextInt();
		Derived d[] = new Derived[n];
		readItem(d);
		displayItem(d);
	}
}
	
	
	