import java.util.ArrayList;

public class UnlimitedNumberArrayList {
	
	
public static int inx = -1;
private int count;


	public static void main(String[] args) {
		
		ArrayList myList=new ArrayList();
		
		System.out.println(getSmallest(myList));
		System.out.println(getAverage(myList));
		
		System.out.println(add(myList,915));
		System.out.println(add(myList,200));
		System.out.println(add(myList,92));
		System.out.println(add(myList,1));
		System.out.println(add(myList,1));
		System.out.println(add(myList,1));
		System.out.println(add(myList,1));
		
		
		
		
		System.out.println(get(myList,915));
		System.out.println(get(myList,2));
		
		System.out.println(size(myList));
		
		System.out.println(find(myList,1));
		
		System.out.println(getLargest(myList));
		
		System.out.println(getSmallest(myList));
		System.out.println(getAverage(myList));
	}
	
	public static int add(ArrayList myList, int n) {
		
		System.out.println(n);
		inx ++;
		myList.add(n);
		return inx;
	}
		
	public static int get(ArrayList numbers, int n) {
		try {
		return(Integer)numbers.get(n);
		} catch (Exception e) {
			System.out.println("Sorry that index was either out of range of 500 or the element does not exist at the index");
			return -1;
		}
	}
	
	public static int size(ArrayList numbers) {
		return numbers.size();
	}
	
	public static int[] find(ArrayList numbers, int n) {
		
		ArrayList c=new ArrayList(numbers.size());
		
		for (int x = 0; x < numbers.size(); x++) {
			if((Integer)numbers.get(x) == n) {
				c.add(x);
			}
		}
		
		int[] d = new int[c.size()];
		for(int i=0; i < c.size(); i++) d[i] = (Integer)c.get(i);
		
//Uncomment the next line to prove that it returns correct indices otherwise the printed statement of array d is the hash code
//		System.out.println(java.util.Arrays.toString(d));
		
		return d;
	}
	public static int getLargest(ArrayList numbers) {
		int largest = 0;
		for (int l = 0; l < numbers.size(); l++) {
			if((Integer)numbers.get(l) > largest) {
				largest=(Integer)numbers.get(l);
			}
		}
		if (numbers.isEmpty() == true) {
			return -1;
		} else {
		return largest;
		}
	}
	
	public static int getSmallest(ArrayList numbers) {
		int smallest =getLargest(numbers);
		
		for(int k=0; k < numbers.size(); k++) {
			if((Integer)numbers.get(k) < smallest) {
				smallest=(Integer)numbers.get(k);
			}
		}
		if (numbers.isEmpty() == true) {
			return -1;
		} else {
		return smallest;
		}
	}
	
	public static int getAverage(ArrayList numbers) {
		
		int average = 0;
		int tot = 0;
		for (int l = 0; l < numbers.size(); l++) {
				average += (Integer)numbers.get(l);
				tot ++;
		}
		if (numbers.isEmpty() == true) {
			return -1;
		} else {
		return average/tot;
		}
	}
		
}
