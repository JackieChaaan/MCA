import java.util.*;

class SortString{
	
	String s[];
	
	int n;
	
	SortString(){};
	
	SortString(int n)
	
	{
	
		this.n=n;
		
		s=new String[n];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<n;i++)
		
		{
		
			System.out.print("Text"+(i=1)+":");
			
			s[i]=sc.nextLine();
		
		}
		
	}
	
	int sort(){
		
		String t=" ";
			
		for(int i=0;i<n;i++){
		
			for(int j=0;j<n;j++){
			
				if(s[j].compareTo(s[j+1])>0){
				
					t=s[j];
					
					s[j]=s[j+1];
					
					s[j+1]=t;
					
				}
			
			}
			
		}
		
		return 0;
	}
	
	int show(){
	
		for(int i=0;i<n;i++){
		
			System.out.println(s[i]);
			
		}
		
		return 0;
	
	}
	
	public static void main(String[] a){
	
		SortString s = new SortString[5];
		
		s.sort();
		
		s.show();
	}

}
			
