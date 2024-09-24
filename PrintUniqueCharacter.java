package week1.day1;

public class PrintUniqueCharacter {
		public static void main(String[] args) {
			String text = "babu";

			char arr[] = text.toCharArray();

			for (int i = 0; i < arr.length; i++) {

				int count = 1;

				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == (arr[j])) {
						arr[j] = ' ';
						count++;
					}
				}
				if (count > 1) {
					arr[i] = ' ';
				}

			}

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != ' ') {
					System.out.print(arr[i] + " ");
				}
			}

		}

	

	}


