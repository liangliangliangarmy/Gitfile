package com.opensource;
import java.util.Scanner;

public class jmeter {
	static String name;
	static String friend;
	
	 static void setName(String n) 
	 {
		 name=n;
	 }
	 static void setFriend(String f)
	 {
		 friend=f;
	 }
	 static String getName(){
		return name;
	}
	 static String getFriend(){
		return friend;
	}

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in); 
	     System.out.println("Input the name:"); 
	     String inName = sc.nextLine();
	     System.out.println("Input the friend:"); 
	     String inFriend = sc.nextLine(); 
	     
	     setName(inName);
	     setFriend(inFriend);
		
	     System.out.println("name:"+getName()+"\n"+"friend:"+getFriend()); 
	}
	
}