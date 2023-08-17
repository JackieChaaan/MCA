class ThreadSimple{
  
	public static void main(String args[]){
	
 //throws InterruptedException{
   
		simplethread m=new simplethread();
	
	//m.run();will work without the effect of Thread
  		
		// m.start(); 
		
      /* When the class extends Thread*/
      
try{

  		for(int i=1;i<10;i++) {
	
    			 for(int j=0;j<i;j++){  
				
				System.out.print("  "+i);

 			}//inner for
 			
		Thread.sleep(10);/* Sleep can be used with throws /trycatch Interrupted Exception*/
		
		System.out.print('\n');
		
		
     		}//outer for
     		
}catch(InterruptedException e){System.out.println(e);}

  	}//main

}//class ThreadSimple




/*simplethread(){

  Thread u=new Thread(this,"Fib");
  
u.start();

}*/


//class simplethread extends Thread{

class simplethread implements Runnable{

	simplethread(){

 	  Thread u=new Thread(this,"Pattern");

	System.out.println("The name of the Thread is="+u.getName());

	u.start();
	
	}
 	
	public void run() {

      	System.out.println("\nRun method is invoked by m.start--->  ");
	
	try{

     		for(int count=1;count<10;count++){
	
			for(int j=0;j<count;j++){
  	   
				System.out.print(" *  ");
	
					Thread.sleep(2);
		
	
			}//for inner

				System.out.print('\n');
		
    		}//for outer


	}catch(InterruptedException e){System.out.println(e);}

 	}//run

}//simplethread
