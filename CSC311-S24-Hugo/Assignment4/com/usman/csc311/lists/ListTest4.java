package com.usman.csc311.lists;

import java.util.ArrayList;
import java.util.Arrays;

import com.usman.csudh.csc311.adt.impl.LinkedList5;
import com.usman.csudh.csc311.adt.impl.ArrayList5;
import com.usman.csudh.csc311.adt.impl.ArrayStack5;
import com.usman.csudh.csc311.adt.impl.LinkedStack5;
import com.usman.csudh.csc311.adt.impl.ArrayQueue5;
import com.usman.csudh.csc311.adt.impl.LinkedQueue5;

public class ListTest4 {

	public static void main(String[] args) {
		
		
		Listfour a = new Listfour();
		a.add(9);
		a.add(3);
		System.out.println(a);
		
		Stackfour b = new Stackfour();
		b.push(4);
		b.push(6);
		System.out.println(b);
		
		Queuefour c = new Queuefour();
		c.add(5);
		c.add(10);
		System.out.println(c);
		
		ArrayList5 d = new ArrayList5();
		d.add(5);
		d.add(4);
		System.out.println(d);
		
		LinkedList5 e= new LinkedList5();
		e.add(20);
		e.add(30);
		System.out.println(e);
		
		ArrayStack5 f = new ArrayStack5();
		f.push(50);
		f.push(34);
		System.out.println(f);
		
		LinkedStack5 g = new LinkedStack5();
		g.push(28);
		g.push(38);
		System.out.println(g);
		
		ArrayQueue5 h = new ArrayQueue5();
		h.add(78);
		h.add(90);
		System.out.println(h);
		
		LinkedQueue5 i = new LinkedQueue5();
		i.add(99);
		i.add(100);
		System.out.println(i);
		
		
	}
}
