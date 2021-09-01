package app;

import java.util.Scanner;

public class PersonTest {
	public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter name ");
	      String name = sc.nextLine();
	      System.out.println("enter age");
	      int age = sc.nextInt();
	      Person p =  new Person(name,age);
	   try {
		   p.isEligibleForVote();
		}catch(InvalidNameException exp){
			System.out.println(exp.getMessage());
			
		}catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}

}
}