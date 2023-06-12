class Sum
	{
	int a,b;
	Sum()
	{
	a=10;
	b=15;
	System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);
	}
	int display()
	{
	return a+b;
	}
}
class Add
	{
	public static void main(String args[])
		{
			Sum s=new Sum(); 
			System.out.println("Successfully Calculated");
			//System.out.println("Value of a="+s.a);
			//System.out.println("Value of b="+s.b);
			System.out.println("Total is "+s.display());
		}	
}
