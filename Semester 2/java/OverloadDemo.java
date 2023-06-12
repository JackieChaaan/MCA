import java.util.*;

public class OverloadDemo{
	public static double area(float r){		// Area of Circle
		return Math.PI * r * r;
	}

	public static int area(int l, int b){		// Area of a Rectangle
		return l * b;
	}

	public static int area(int s){		// Area of a square
		return s * s;
	}

	public static double area(float b, float alt){	// Area of a Triangle
		return 0.5 * b * alt;
	}

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		float a,b;
		int x,y;
		while(true){
			System.out.print("AREA of 2D FIGURES:\n1. Circle\n2. Rectangle\n3. Square\n4. Triangle\nChoice (1-4)?: ");
			int ch = sc.nextInt();
			switch(ch){
				case 1: 	System.out.print("Radius ?: ");
				        	a = sc.nextFloat();
					System.out.println("Area of circle of radius "+a+" is "+area(a));
					break;
				case 2: 	System.out.print("Length ?: ");
				        	x = sc.nextInt();
					System.out.print("Breadth ?: ");
					y = sc.nextInt();
					System.out.println("Area of rectangle with dimensions ("+x+","+y+") is "+area(x,y));
					break;
				case 3: 	System.out.print("Side ?: ");
				        	x = sc.nextInt();
					System.out.println("Area of square with side "+x+" is "+area(x));
					break;
				case 4: 	System.out.print("Base ?: ");
				        	a = sc.nextFloat();
					System.out.print("Altitude ?: ");
					b = sc.nextFloat();
					System.out.println("Area of triangle with dimensions ("+a+","+b+") is "+area(a,b));
					break;
				default:     	System.out.println("Invalid Choice");
					break;
			}
			System.out.print("Continue (1/0) ?: ");
			ch = sc.nextInt();
			if (ch==0) break;
		}
	}
}