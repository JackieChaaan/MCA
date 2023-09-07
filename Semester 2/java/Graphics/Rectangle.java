package graphics;
class Rectangle implements Properties_fig{
	int l;
	int b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void area(){
		System.out.println("Area is: "+l*b);
	}
	public void perimeter(){
		System.out.println("Perimeter is: "+2*(l*b));
	}
}

	