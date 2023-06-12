class Outer{

	int x,y;

	void test(){
	
		System.out.println("Iam in outer class");
	}
	
	static class inner{
		
		static void print(){
		
			System.out.println("Iam in inner class");
		
		}
	}

}
class Nest_class{

	public static void main(String args[]){
		
		Outer ob_out=new Outer();
		
		ob_out.test();
		
		//Outer.inner in_ob = ob_out.new inner();
		
		//in_ob.print(); 
		
		Outer.inner.print();
	}
	
}


