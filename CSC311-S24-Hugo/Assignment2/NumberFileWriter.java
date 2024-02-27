//Hugo Noyola hnoyola1@toromail.csudh.edu

import java.io.IOException;
import java.io.FileWriter;

public class NumberFileWriter {
	public static void main(String[] args) throws IOException {
		int[] num = {2, 33, 3333, 112, 27, 3, 45, 234};
		
		write(num,"NumberFileOut.txt");
	}
	
	public static void write (int[] anum, String file) throws IOException{
		  FileWriter write = new FileWriter(file);
		  
		  int len = anum.length;
		  
		  for(int i = 0; i<len; i++) {
			  write.write(anum[i]+"\n");
		  }
		  write.close();
		}
}
