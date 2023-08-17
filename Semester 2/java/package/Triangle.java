package graphics;

import java.properties.*;

import java.util.*;

class Triangle implements properties{
	
	public double b;	
	
	public double h;
	

	public Triangle(double b,double h){

		this.b = b;
	
		this.h = h;
	
	}

	public double calculateArea(){
	
		return 0.5*b*h;
	
	}
	
}
	
	
