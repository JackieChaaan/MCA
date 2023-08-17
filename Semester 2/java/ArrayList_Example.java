import java.io.*;

import java.util.*;

class ArrayList_Example{

	public static void main(String[] args){
	
		int n=5;
		
		ArrayList<Integer> ar_list=new ArrayList<Integer>(n);
		
		for(int i=0;i<n;i++)
		
			ar_list.add(i*i+5);
			
		System.out.println(ar_list);
		
		ar_list.remove(3);
		
		System.out.println(ar_list);
		
		ar_list.remove(2);
		
		for(int i=0;i<ar_list.size();i++)
		
			System.out.println(ar_list.get(i) + "");
	}

}
	
			
