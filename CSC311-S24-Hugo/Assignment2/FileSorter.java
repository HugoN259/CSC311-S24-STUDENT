//Hugo Noyola hnoyola1@toromail.csudh.edu

import java.io.IOException;
import java.util.Scanner;

public class FileSorter {
	
	public static void main(String[] args) throws IOException {
		NumberFileReader reading = new NumberFileReader();
		BubbleSort sort = new BubbleSort();
		NumberFileWriter wrote = new NumberFileWriter();
		
		Scanner fname = new  Scanner(System.in);
		System.out.println("Enter File name to sort");
		String name = fname.nextLine();
		
		int [] num = sort.sortAsc(reading.read(name));
		wrote.write(num,"numberFileOut.txt");
		
		int [] nums = sort.sortDesc(reading.read(name));
		wrote.write(nums,"numberFileOut2.txt");
	}
	
}
