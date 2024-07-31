package ReadOperations;

import java.io.*;

public class ReadtheFile {

	public static void main(String[] args) {
		
		try(BufferedReader br=new BufferedReader(new FileReader("MonuFile.txt"))) {
			String line;
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(Exception e) { 
			e.printStackTrace();
		}
		
		
	}

}
