

	package day3;
	import java.util.Scanner;
	public class RevArray {

		public static void main(String[] args) {
			
			System.out.print(reverseIt(input()));
		}
		
		private static String input() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String s = sc.nextLine();
			sc.close();
			return s;
		}
		
		private static String reverseIt(String s) {
			char[] tempArray = s.toCharArray();
			int start =0;
			int end = s.length()-1;
			for(;start<end;) {
				char temp = tempArray[start];
				tempArray[start] = tempArray[end];
				tempArray[end] = temp;
				start++;
				end--;
			}
			s = String.copyValueOf(tempArray);
			return s;
		}
		
	}