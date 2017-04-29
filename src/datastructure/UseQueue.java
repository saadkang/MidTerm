package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool
		 * elements. Use For Each loop and while loop with Iterator to retrieve
		 * data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();
		queue.add("Saad");
		queue.add("Sana");
		queue.add("Ahmed");
		queue.add("Ayesha");
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.offer("Saad");
		queue.offer("Sana");
		
		for(String queue1 : queue){
			System.out.print(queue1);
			System.out.print(" ");
		}

		Iterator<String> it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}
