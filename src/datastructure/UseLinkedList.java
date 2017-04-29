package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Mitsubishi");
		cars.add("Ford");
		System.out.println("After adding the items in the list: "+cars);
		System.out.println("This is peeking: "+cars.peek());
		cars.remove();
		System.out.println("After removing this is what we are left with: "+cars);
		System.out.println("Element retrieves the head of the list: "+cars.element());
		
		for(String car : cars){
			System.out.println(car);
		}
		
		Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
	}

}
