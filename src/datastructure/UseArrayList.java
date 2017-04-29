package datastructure;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import databases.ConnectDB;

public class UseArrayList {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		/*
		 * Demonstrate how to use ArrayList that includes
		 * add,peek,remove,retrieve elements. Use For Each loop and while loop
		 * with Iterator to retrieve data. Store all the sorted data into one of
		 * the databases.
		 * 
		 */
		ArrayList<String> bikes = new ArrayList<String>();
		bikes.add("Sports");
		bikes.add("Cruiser");
		bikes.add("Dual-Sport");
		bikes.add("Sports Touring");
		bikes.add("Touring");
		System.out.println("After adding the items in the list: "+bikes);
		bikes.remove(0);
		System.out.println("After removing index 0: "+bikes);
		System.out.println("This returns the size of the list: "+bikes.size());
		
		for(String bike : bikes){
			System.out.println(bike);
		}
		
		Iterator<String> it = bikes.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		ConnectDB connect = new ConnectDB();
		connect.connectToMySql();

	}

}