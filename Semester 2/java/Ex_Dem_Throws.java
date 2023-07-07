class ex_demo{ 
  
	static void demo(int a) /*throws ArithmeticException,ArrayIndexOutOfBoundsException*/
{ 
   		int q[]={12};
     
												 try{
	
		 if(a<10){
	
			System.out.println("The value of a="+a);
        
			throw new ArithmeticException("time to reorder");
			}
		else
	
			q[a]=12;
	     
      
		throw new ArrayIndexOutOfBoundsException("Not inserted");
											}catch(Exception qw){
				
					//System.out.println(" Exception occured :"+ qw);
	
				throw qw;
				}  //catch

	  }//method
}//class

class Ex_Dem_Throws
{
   public static void main(String ar[])
    {
     
    						 try{
          int a=Integer.parseInt(ar[0]);
  	ex_demo.demo(a);

     												  }catch(Exception r)
          						{System.out.println("Inside main method :"+r);
	  						}
System.out.println("program terminated");
    }
}
