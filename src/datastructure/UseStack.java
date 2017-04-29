package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop
		 * elements. Use For Each loop and while loop with Iterator to retrieve
		 * data.
		 * 
		 */
		Stack<String> countries = new Stack<String>();
		countries.push("PAK");
		countries.push("UK");
		countries.push("USA");
		System.out.println("After the stacking, this is what we have: "+countries);
		countries.pop();
		System.out.println("After popping once we are left with: "+countries);
		System.out.println("This is peeking: "+countries.peek());
		System.out.println("I'm seaching for the place of item PAK: "+countries.search("PAK"));
		
		for(String countries1 : countries){
			System.out.println(countries1);
		}
		
		Iterator<String> it = countries.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
