        package WriteOperations;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("MonuFile.txt"))) {
			
			bw.write("Hello every on, how are u all??");
			bw.write("\nMy name is monu bhati");
			bw.write("\nWhat is your name ????");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
