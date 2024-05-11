import java.io.IOException;
import java.io.FileWriter;
import java.util.Random;
import java.util.ArrayList;

public class Nfilewriter5 {
	public static void main(String[] args) throws IOException {
		int[] num = {2000000, 33, 3333, 112, 27, 3, 45, 234};
		
		//Writes 50 data sets ranging from 0 to 10000
		
		String dir = "C:\\Users\\Hugo2\\eclipse-workspace\\csc321\\Assignment4\\Text\\Dataset";
		
		
		Random ran = new Random();
		for (int i = 1; i <=50; i++) {
			int dsize = 1000 * i;
			String l = Integer.toString(i);
			String com = dir + l;
			ArrayList nums = new ArrayList();
			
			for (int x = 0; x < dsize; x++) {
			
				nums.add(ran.nextInt(10000));
			} 
					
			int[] fnums = new int[dsize];
		    for (int n=0; n < fnums.length; n++)
		    {
		        fnums[n] = ((Integer) nums.get(n)).intValue();
		    }
			
			write(fnums ,com);
		}
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
