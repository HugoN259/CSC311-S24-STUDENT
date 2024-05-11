package com.usman.csudh.csc311.adt.impl;
import com.usman.csudh.csc311.adt.List5;
import com.usman.csudh.csc311.adt.ListInvalidIndexException;
import com.usman.csudh.csc311.adt.Queue5;
import com.usman.csudh.csc311.adt.QueueEmptyException;

/**
 * A linked list implementation of a queue. This implementation uses forward linking nodes
 * to provide the queue functionality.
 */
public class LinkedQueue5 implements Queue5{
	
	Node head;

	
	
	public LinkedQueue5() {
		head = null;
	}
	
	
	@Override
	public void add(int data) {
		Node new_node = new Node(data);

		// Find the tail of the list
		new_node.next = head;

		/*If the list is empty, then this node will become the first item (HEAD)
		 else this node will be added to the end of the current TAIL, effectively
		 becoming the new TAIL 
		 */
		head = new_node;

	}

	@Override
	public int remove() throws QueueEmptyException {
		if (head == null) {
			throwQueueEmptyException();
		}
		
		Node itemNode=head;		
		head=head.next;
		return itemNode.data;
		
	}

	@Override
	public int peek() throws QueueEmptyException {
		
		if (head == null) {
			throwQueueEmptyException();
		}
        return head.data;
	}

	@Override
	public int size() {
		
		Node current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head==null;
	}

	@Override
	public void clear() {
		head=null;
		
	}
	
	// Returns the tail of the list
	private Node findTail() {
		if (head == null) {
			return null;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current;
	}

	
	private void throwQueueEmptyException() throws QueueEmptyException {
		throw new QueueEmptyException("Queue is empty");
	}
	
	public String toString() {
		Node current = head;
		String result = "";
		while (current != null) {
			result += current.data + " ";
			current = current.next;
		}
		return result;
	}
}
