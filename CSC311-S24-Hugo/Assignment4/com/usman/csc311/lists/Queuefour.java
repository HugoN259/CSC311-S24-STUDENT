package com.usman.csc311.lists;
import java.lang.Exception;

import com.usman.csc311.lists.ListInvalidIndexException;

public class Queuefour {
	
	static final int INITIAL_CAPACITY = 50;
	
	static final int GROW_BY = 25;
	
	private int[] data;
	
	int arrayPointer = 0;

	
	public void add(int item) {
		if (arrayPointer == data.length) {
			resizeArray();
		}
		data[arrayPointer++] = item;
	}
	
	
	public void remove() {
		if (arrayPointer == data.length) {
			resizeArray();
		}
		data[arrayPointer--] = data[0];
	}
	
	
	
	private void resizeArray() {
		int loopCount = 0;
		int[] newData = new int[data.length + GROW_BY];
		for (int i = 0; i < data.length; i++) {
			newData[i] = data[i];
			loopCount++;
		}
		data = newData;
		System.out.println("Resize: " + loopCount);
	}
	
	public Queuefour() {
		data = new int[INITIAL_CAPACITY];
	}
	
	private void throwInvalidIndexException() throws ListInvalidIndexException{
		throw new ListInvalidIndexException("Invalid index");
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < arrayPointer; i++) {
			result += data[i] + " ";
		}
		return result;
	}
}
