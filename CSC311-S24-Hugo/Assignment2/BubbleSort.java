//Hugo Noyola hnoyola1@toromail.csudh.edu

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	public static int count;

	
	public static void main(String[] args) {
		
		int[] arr = {0,2,8,1,9,3,4};
		sortAsc(arr);	
		
		System.out.println(Arrays.toString(arr));
		System.out.println(LoopCycles());	
		
		sortDesc(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(LoopCycles());

	}
		
	public static int[] sortAsc(int[] nums) {
		int len = nums.length;
		count = 0;
		
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					count++;
				}
			}
		}
		return nums;
	}
	
	public static int[] sortDesc(int[] nums) {
		int len = nums.length;
		count = 0;
		
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - i - 1; j++) {
				if(nums[j] < nums[j + 1]) {
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					count++;
				}
			}
		}
		return nums;
	}
	
	public static int LoopCycles() {
		return count;
	}
	
	
	public static void swap(int[] array, int a,int b) {
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	
	}
}
