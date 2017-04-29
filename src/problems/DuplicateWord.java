package problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

	public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (String string : "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language".split(" ", ' ')) {
            if(map.get(string) == null)
                map.put(string, 1);
            else 
                map.put(string, map.get(string) + 1);
        }
        String mapString = join(map.keySet(), ", ");
        List<Integer> value = new ArrayList<Integer>(map.values());
        System.out.println("Output = " + mapString);
        System.out.println("Values = " + value);
    }

	public static String join(Collection<String> s, String delimiter) {
		StringBuffer sb = new StringBuffer();
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			sb.append(iter.next());
			if (iter.hasNext()) {
				sb.append(delimiter);
			}
		}
		return sb.toString();
	}
}