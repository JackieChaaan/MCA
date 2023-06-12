class Add
	{
	int a,b;
	Add(int x,int y)
	{
	a=x;
	b=y;
	System.out.println("Value of a="+a);
	System.out.println("Value of b="+b);
	}
	int display()
	{
	return a+b;
	}
}
class Sum
	{
	public static void main(String args[])
		{
			Add a=new Add(15,15); 
			System.out.println("Successfully Calculated");
			System.out.println("Total is "+a.display());
		}	
}
