package week1.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";

		char arr[] = str.toCharArray();

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != ' ') {

				set.add(arr[i]);
			}

		}

		System.out.println(set);

	}

}
