//Hugo Noyola hnoyola1@toromail.csudh.edu
//Full disclosure I don't know why but this file works on my pc at home
//but does not seem to work on my laptop I think it has something to do
//with how I connected the txt files because the same issue I keep running into


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberFileReader {
	public static void main(String[] args)throws IOException{
		System.out.println(java.util.Arrays.toString(read("nfile.txt")));
	       
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
