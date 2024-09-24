package week1.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("HCL");
		a.add("Wipro");
		a.add("Aspire System");
		a.add("CTS");
		Collections.sort(a);
		Collections.reverse(a);

		System.out.println(a);

	}
}