import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader5 {
	public static void main(String[] args)throws IOException{
		System.out.println(java.util.Arrays.toString(read("C:\\Users\\Hugo2\\eclipse-workspace\\csc321\\Assignment3\\Text\\Dataset")));
	       
	}
	public static int[] read(String file) throws IOException {
		 List<String> listOfStrings = new ArrayList<String>();
	    
	     BufferedReader bf = new BufferedReader(new FileReader(file));
	       
	     String line = bf.readLine();
	       
	     while (line != null) {
    	  listOfStrings.add(line);
	      line = bf.readLine();
	     }
	       
	     bf.close();
	       
	     String[] array = listOfStrings.toArray(new String[0]);
	  
	     int[] nums = new int[array.length];
	     for(int i = 0; i<array.length; i++) {
	    	 nums[i] = Integer.parseInt(array[i]);
	     }
	     
	     return nums;
	}
}
