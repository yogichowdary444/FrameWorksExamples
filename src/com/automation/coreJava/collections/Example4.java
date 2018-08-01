package com.automation.coreJava.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.ListIterator;

/* This example shows how to use Stack */
class Example4 {

	public static void main(String args[]) {

		/*Create Stack object */
		Stack<String> languages = new Stack<String>();
		
		System.out.println("isEmpty:" + languages.isEmpty());
		
		/* How to add objects to Stack */
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("JAVA");
		languages.add(".NET");
		languages.add("C#");
		
		System.out.println("Level 1:" +languages);
		
		/* Add null  object to Stack */
		languages.add(null);
		languages.add("PHP");
		System.out.println("Level 2:" +languages);
		
		/*Add objects to Stack based on index */
		languages.add(0, "COBOL");
		System.out.println("Level 3:" + languages);
		System.out.println("Size:" + languages.size());
		
		/* How to get object from Stack */
		System.out.println("Level 4:" + languages.get(0));
		
		/* Remove object from Stack */
		languages.remove("COBOL");
		languages.remove(0);
		System.out.println("Level 5:" + languages);
		
		/* How to update object */
		languages.set(0, "C++");
		System.out.println("Level 5:" + languages);
		
		/* How to use find or search required object */
		System.out.println("Find required object 'C++':" + languages.contains("C++"));
		System.out.println("Find required object 'C++':" + languages.contains("SELENIUM"));
		
		/*Retrieve all objects from  Vector  using iterator*/
		System.out.println("Using Enumerator:");
		Enumeration<String> enumerator =  languages.elements();
		while(enumerator.hasMoreElements()){
			System.out.print(enumerator.nextElement() + "\t");
		}
		
		System.out.println();
		
		/*Retrieve all objects from  Stack  using iterator*/
		System.out.println("Using Iterator:");
		Iterator<String> iterator = languages.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println();
		System.out.println("Retreive topmost element from Stack" + languages.peek());
		System.out.println("Remove topmost element from Stack" + languages.pop());
		
		/*Retrieve all objects from  Stack  using ListIterator*/
		ListIterator<String> listIterator = languages.listIterator();
		
		System.out.println("Forward Direction");
		
		while(listIterator.hasNext()){
			System.out.print(listIterator.next() + "\t");
		}
		
		System.out.println();
		System.out.println("Backward Direction");
		
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous() + "\t");
		}
		
		/*clear all objects from Stack */
		languages.clear();
		System.out.println();
		System.out.println("Size:" + languages.size());
		System.out.println(languages);
		
		languages.removeAll(languages);
		System.out.println("Size:" + languages.size());
		System.out.println(languages);
	}
}
