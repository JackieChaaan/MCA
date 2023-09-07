import java.io.*;
import java.util.*;

public class FileRead{
	public static void main(String[] args){
		try{
			File obj=new File("sample.txt");
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()){
				String data=sc.nextLine();
				System.out.println(data);
			}
		}catch(Exception e){
			System.out.println("An error occured "+e);
		}
	}
}