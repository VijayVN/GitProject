package day3;

import java.util.*;
public class DigitalSum {
	public int sumOfNumbers(String s){
        if(s.length()==1){
        	int i = Integer.parseInt(s);
            return i ;
        }else{
            int i = Integer.parseInt(s);
            int sum = 0;
            int c = 0;
            while(i>0){
               c= i%10;
               sum = sum+c;
               i = i/10;}
            return sum;
         }
    }
            
    @SuppressWarnings("resource")
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit: ");
        String s = sc.nextLine();
        DigitalSum obj = new DigitalSum();
        System.out.println("Sum of digits is: " + obj.sumOfNumbers(s));
    } 

  }
