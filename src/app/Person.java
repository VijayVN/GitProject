package app;

import java.util.*;
public class Person {
		   private String name;
		   private int age;
		   Person(String name, int age){
		      this.name=name;
		      this.age=age;
		   }
		   public String toString(){
		      return "name " + name + "age " + age;
		   }
		   public String getName(){
		      return name;
		   }
		   public int getAge(){
		      return age;
		   }
		   public void setName(String name){
		      this.name=name;
		   }
		   public void setAge(int age){
		      this.age=age;
		   }
		   public boolean isEligibleForVote(){
		      if (name.isEmpty() || name.length()<3){
		         throw new  InvalidNameException("Person name is invalid");}
		      else if (age<18){
		         throw new  InvalidAgeException("Age is invalid");}
		      else{
		         System.out.println("Eligible to vote");
		         return true;}
		   }
		   
		}