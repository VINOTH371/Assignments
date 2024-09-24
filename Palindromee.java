package week1.day1;

public class Palindromee {

	public static void main(String[] args) {
		String a = "madam";
		String rev="";
		for (int i = 0; i < a.length(); i++) {
			rev=a.charAt(i)+rev;
			if(rev.equals(a)) {
				System.out.println("palindrome");
			
				}
			}
			
			
		}

	}


