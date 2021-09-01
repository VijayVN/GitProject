
public class Add {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		System.out.println("num1- " + num1);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("num2- " + num2);
		int result = sum(num1, num2);
		System.out.println("Sum is: " + result);
		
	}
    public static int sum(int num1, int num2) {
		return num1 + num2;
}
}