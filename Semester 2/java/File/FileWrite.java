import java.io.*;

public class FileWrite{
	public static void main(String[] args){
		try{
			FileWriter obj=new FileWriter("sample.txt");
			obj.write("Hello,its me abel c varghese");
			obj.close();
			System.out.println("Successfully wroted to file");
		}
		catch(Exception e){
			System.out.println("An error occured "+e);
		}
	}
}