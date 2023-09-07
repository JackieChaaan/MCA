import java.util.*;

class Avg extends Exception{

	Avg(String s){
	
		super(s);
	
	}
	
}

class UserExceptAvg{

	public static void main(String args[]){
		
		int total=0;
		
		float avg;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter limit: ");
		
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		System.out.println("Enter Positive Integers: ");
		
		for(int i=0;i<n;i++){
			
			int num=sc.nextInt();
			
			try{
				
				if(num<0){
					
					i--;
					
					throw new Avg("Error:Negative Number not allowed");
			
				}
				else{
					
					a[i]=num;
					
					total+=a[i];
					
				}
			
		}catch(Avg o){System.out.println(o);}
		
	}	

		avg=total/n;
		System.out.println("Total is: "+total);
		System.out.println("Average is: "+avg);
		
	}
	
}			
			
		
		