package graphics;
import java.lang.Math;
class Triangle implements Properties_fig{
	int a,b,c;
	Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void area(){
		double s;
		s=(a+b+c)/2;
		System.out.println("Area: "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	public void perimeter(){
		System.out.println("Perimeter: "+(a+b+c));
	}
}