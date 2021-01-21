package model;

import java.util.Scanner;

public class Main_Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total runs scored");
		int total=sc.nextInt();
		System.out.println("Enter the total overs faced");
		int overs=sc.nextInt();
		int runRate=total/overs;
		System.out.println("Current runrate is"+runRate);
		
	}

}
 