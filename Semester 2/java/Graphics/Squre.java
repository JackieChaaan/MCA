package graphics;
class Squre implements Properties_fig{
	int a;
	Squre(int a){
		this.a=a;
	}
	public void area(){
		System.out.println("Area: "+a*a);
	}
	public void perimeter(){
		System.out.println("Perimeter: "+4*a);
	}
}