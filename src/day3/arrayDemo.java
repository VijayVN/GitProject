package day3;
	import java.io.*;
	import java.util.Scanner;
	public class arrayDemo
{
	static void method() {
	int n, x, count = 0, i = 0;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number of elements you want in array:");
	n = s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter all the elements:");
	for(i = 0; i < n; i++)
{
	a[i] = s.nextInt();
}
	System.out.print("Enter the element of which you want to count the number of occurrences:");
	x = s.nextInt();
	for(i = 0; i < n; i++)
{
	if(a[i] == x)
	{
	count++;
}
}
	System.out.println("Number of Occurrence of the Element:"+count);
}
	public static void main(String[] args)
{
	method();
	}
	}
