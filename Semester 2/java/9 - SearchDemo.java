import java.util.*;

class Item{
	public String name;
	private float price;
	
	Item(String n, float p){
		name = n;
		price = p;
	}
	
	void display(){
		System.out.println("Name : "+name+"\tPrice : "+price);
	}
}
class SearchDemo{
	static void search(Item[] ob, String name){
		for(int i=0; i<ob.length; i++)
			if (ob[i].name.equals(name)){
				ob[i].display();
				return;
			}
		System.out.println("Item not found");
	}
	public static void main(String[] a){
		int n,i;
		String name;
		float price;
		Scanner sc = new Scanner(System.in);

		System.out.println("No. of items ?: ");
		n = sc.nextInt();
		Item ob[] = new Item[n];

		for(i=0; i<n; i++){
			System.out.print("Item "+ (i+1) +" Name ?: ");
			name = sc.next();
			System.out.print("Item "+ (i+1) + " Price?: ");
			price = sc.nextFloat();
			ob[i] = new Item(name,price);
		}
		
		for(i=0; i<n ; i++)
			ob[i].display();

		System.out.print("Item to search ? : ");
		name = sc.next();
		search(ob, name);
	} // main()
}