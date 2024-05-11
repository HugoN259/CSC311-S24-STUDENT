//Hugo Noyola hnoyola1@toromail.csudh.edu

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Object;
import java.util.Timer;

import com.usman.csc311.lists.Listfour;
import com.usman.csc311.lists.Queuefour;
import com.usman.csc311.lists.Stackfour;
import com.usman.csudh.csc311.adt.impl.ArrayList5;
import com.usman.csudh.csc311.adt.impl.ArrayQueue5;
import com.usman.csudh.csc311.adt.impl.ArrayStack5;
import com.usman.csudh.csc311.adt.impl.LinkedList5;
import com.usman.csudh.csc311.adt.impl.LinkedQueue5;
import com.usman.csudh.csc311.adt.impl.LinkedStack5;

public class FileSorter {
	
	public static void main(String[] args) throws IOException {
		Reader5 reading = new Reader5();
		Listfour a = new Listfour();
		Stackfour b = new Stackfour();
		Queuefour c = new Queuefour();
		ArrayList5 d = new ArrayList5();
		LinkedList5 e= new LinkedList5();
		ArrayStack5 f = new ArrayStack5();
		LinkedStack5 g = new LinkedStack5();
		ArrayQueue5 h = new ArrayQueue5();
		LinkedQueue5 i = new LinkedQueue5();
	
		int fcounter = 1;
		
		String dir = "C:\\Users\\Hugo2\\eclipse-workspace\\csc321\\Assignment4\\Text\\Dataset";
		
		//List
		/*for (int x = 1; x <=50; x++) {
			Timer timer = new Timer();
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				a.add(nums[z]);
		}
		/*/
		
		//Stack
		/*for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				b.push(nums[z]);
		}
		/*/		

		//Queue
		/*for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				c.add(nums[z]);
		}
		/*/
		
		/*for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				d.add(nums[z]);
		}
		/*/
		/*
		for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int loop = 0;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				e.add(nums[z]);
				loop += e.size();
				System.out.println(loop);
		}
		
		/*
		for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				f.push(nums[z]);
		}
		/*/
		
		/*
		for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				g.push(nums[z]);
		}
		/*/
		
		/*
		for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				h.add(nums[z]);
		}
		/*/
		
		for (int x = 1; x <=50; x++) {
			String l = Integer.toString(x);
			String name = dir + l;
			
			int[] nums = reading.read(name);
			for(int z=0; z < nums.length;z++)
			
				i.add(nums[z]);
		}
		
	}
	
}