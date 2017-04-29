package datastructure;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import databases.ConnectDB;

public class UseMap {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving
		 * elements. Add List<String> into a Map. Like, Map<String,
		 * List<string>> list = new HashMap<String, List<String>>(); Use For
		 * Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data.
		 */
		List<String> cholesterolDrugs = new ArrayList<String>();
		cholesterolDrugs.add("Atorvastatin");
		cholesterolDrugs.add("Simvastatin");
		
		List<String> bloodPressureDrugs = new ArrayList<String>();
		bloodPressureDrugs.add("Metoprolol");
		bloodPressureDrugs.add("Atenolol");
		
		List<String> scheduleIIDrugs = new ArrayList<String>();
		scheduleIIDrugs.add("Adderall");
		scheduleIIDrugs.add("Percocet");
		
		List<String> heartDrugs = new ArrayList<String>();
		heartDrugs.add("Digoxin");
		heartDrugs.add("Coumadin");
		
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("Drugs for Cholesterol: ", cholesterolDrugs);
		list.put("Drugs for Hypertension: ", bloodPressureDrugs);
		list.put("CII Drugs: ", scheduleIIDrugs);
		list.put("Drugs for Heart Failure: ", heartDrugs);

		for (Map.Entry<String, List<String>> cursor : list.entrySet()) {
			System.out.println(cursor.getKey()+cursor.getValue());

		}
		ConnectDB connect = new ConnectDB();
		connect.connectToMySql();
	}
}