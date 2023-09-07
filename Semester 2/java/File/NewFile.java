import java.io.*;

public class NewFile{
	public static void main(String[] args){
		try{
			File ob= new File("newfile.txt");
			if(ob.createNewFile()){
				System.out.println("File created successfully: "+ob.getName());
			}
			else{
				System.out.println(ob.getName()+" Already exist");
			}
		}catch(Exception e){
			System.out.println("An error occured: "+e);
		}
	}
}