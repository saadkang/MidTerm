package math;

import java.io.IOException;
import java.sql.SQLException;

import databases.ConnectDB;

public class PrimeNumber {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		/*
		 * Find list of Prime numbers from number 2 to 1 million. Try the best
		 * solution as possible.Which will take less CPU life cycle. Out put
		 * number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data.
		 */
		
		int counter = 0;
		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				counter++;
				System.out.println(i);
			}
		}
		System.out.println("Total Prime Number up to this point:  " + counter);
		
		ConnectDB connect = new ConnectDB();
		connect.connectToMySql();
	}

	public static boolean isPrime(int number) {
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= number; i = i + 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}
}
