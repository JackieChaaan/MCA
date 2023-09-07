package graphics;
import java.lang.Math;
class Circle implements Properties_fig{
	int r;
	Circle(int r){
		this.r=r;
	}
	public void area(){
		System.out.println("Area: "+Math.PI*r*r);
	}
	public void perimeter(){
		System.out.println("Perimeter: "+2*Math.PI*r);
	}
}