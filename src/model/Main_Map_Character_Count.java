package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_Map_Character_Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character, Integer> result=new HashMap<>();
		//loop the characters in the string
		//how to convert a String into character array
		//(or) access each character in a String using charAt() method
		
		char[] carr = input.toCharArray();
		for(char c : carr)
		{
			//check if c is found in map or not
			Integer count;
//			if(result.containsKey(c))
//			{
//				count=result.get(c);
//			}
			count=result.get(c);
			if(count==null)
				count=0;
			count++;
			result.put(c, count);
		}
		System.out.println(result);
	}

}
