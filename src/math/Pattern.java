package math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import databases.ConnectDB;

public class Pattern {

	public static void main(String[] args) {
		/*
		 * Read this numbers, find the pattern then implement the logic from
		 * this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64
		 * ,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data.
		 *
		 */
		int[] array = new int[100];
		for(int i = 1; i <= array.length; i++){
			for(int j = i; j >= 1; j--){
				System.out.print(j + ",");
				j--;
			}
			/*System.out.println();
			ConnectDB connect = new ConnectDB();
			
			List<String> lowestValue = new ArrayList<String>();*/
			
		}
		/*List<Integer> list = new ArrayList<Integer>();
		int num = 0;
		int i;
		for (i = 100; i >= 0; i--) {
			if (100 >= i && i > 80) {
				num = i;
				list.add(num);
			} else if (i <= 80 && i > 70) {
				num = i - 2;
				list.add(num);
			}
		}
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");

		}
	}*/
}}
