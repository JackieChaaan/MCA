import java.io.*;

class Filecreate{
	public static void main(String[] args){
		try{
			File obj=new File("sample.txt");
			if(obj.createNewFile()){
				System.out.println("Succssfully created:- "+obj.getName());
			}
			else{
				System.out.println("Already exists the file "+obj.getName());
			}
		}catch(Exception e){
			System.out.println("Error occured" +e);
		}
	}
}
		