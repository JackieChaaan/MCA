/*class Sample extends Thread{

	public static void main(String args[]){
	
		Sample s=new Sample();
		
		s.start();
		
		System.out.println("From Outside Thread");
		
	}
		
	public void run(){
		
			System.out.println("From inside the Thread");
			
	}
	
}*/




//Runnable 


class Sample implements Runnable{

	public static void main(String args[]){
	
		Sample s=new Sample();
		
		Thread t=new Thread(s);
		
		t.start();
		
		System.out.println("From Outside Thread");
		
	}
		
	public void run(){
		
			System.out.println("From inside the Thread");
			
	}
	
}
