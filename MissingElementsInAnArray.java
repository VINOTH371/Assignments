package week1.day1;

import java.util.Arrays;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i+1!=arr[i]+1) {
				System.out.println(i+1);
			}
		}

	}

}
