package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

	static void permutation(String str, int length, StringBuffer output, boolean[] used, int position) {

		if (position == length) {
			System.out.println(output.toString());
			return;
		} else {
			for (int i = 0; i < length; i++) {
				if (used[i])
					continue;

				output.append(str.charAt(i));
				used[i] = true;

				permutation(str, length, output, used, position + 1);

				output.deleteCharAt(output.length() - 1);
				used[i] = false;
			}
		}
	}

	public static void permute(String str) {
		int length = str.length();
		boolean[] used = new boolean[length];

		StringBuffer output = new StringBuffer(length);

		permutation(str, length, output, used, 0);
	}

	public static void main(String[] args) {

		/*
		 * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
		 * Write Java program to compute all Permutation of a String
		 *
		 */
		permute("ABC");
	}
}
