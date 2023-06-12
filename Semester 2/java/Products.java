class Product{
	
	int pcode,price;
	
	String pname;
	
	Product(int code,String name,int cost){
	
	pcode=code;
	
	pname=name;
	
	price=cost;
	
	System.out.println("pcode: "+pcode);
	
	System.out.println("pname: "+pname);
	
	System.out.println("price: "+price);
	
	}
	int display()
	{
	return(price);
	}
	
}

class Products{

	public static void main(String args[]){
	
			Product  p1=new Product(101,"Pen",2000); 
			
			Product  p2=new Product(1002,"Bag",200); 
			
			Product  p3=new Product(1013,"Umperlla",250);
			
			
			
			if(p1.price<p2.price){
			
				if(p1.price<p3.price){
			
				System.out.println("Lowest price item is: "+p1.pname+","+p1.price);
			
				}
			
				else{
				
				System.out.println("Lowest price item is: "+p3.pname+","+p3.price);
				
				}
			}
			else{
			
				System.out.println("Lowest price item is: "+p2.pname+","+p2.price);
				
			}
			
			
			
		}	
}
