package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import databases.ConnectDB;

public class DataReader {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		/*
		 * User API to read the below textFile and print to console. Use
		 * BufferedReader class. Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data.
		 *
		 */
		String textFile = "C:\\Users\\saadi\\ExamMarch2017\\src\\data\\self-driving-car";
		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
			String text = "";
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		ConnectDB connect = new ConnectDB();
		connect.connectToMySql();
		connect.insertProfileToMySql("datareader", "reader", textFile);
	}

}
