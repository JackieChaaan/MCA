import java.io.*;

public class NewFileWrite{
	public static void main(String[] args){
		try{
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(r);
			System.out.println("Enter the String: ");
			String str=br.readLine();
			FileWriter w=new FileWriter("sample2.txt");
			BufferedWriter wr=new BufferedWriter(w);
			w.write(str);
			w.append("Existing file use append");
			w.close();
			System.out.println("Success fully write");
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}