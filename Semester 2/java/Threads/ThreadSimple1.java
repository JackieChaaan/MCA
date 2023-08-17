class ThreadSimple1{
  
	public static void main(String args[]){
		
		simplethread m=new simplethread();
	
		try{

  			for(int i=1;i<10;i++) {
	
    				for(int j=0;j<i;j++){  
				
					System.out.print("  "+i);

 				}
 			
				Thread.sleep(101);
		
				System.out.print('\n');
		
		
     			}
     		
		}catch(InterruptedException e){System.out.println(e);}

  	}

}


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
	
					Thread.sleep(100);
		
				}

				System.out.print('\n');
		
    			}

		}catch(InterruptedException e){System.out.println(e);}

	}

}
