package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character, Integer> result=new HashMap<>();
		char[] carr = input.toCharArray();
		for(char c:carr)
		{
			Integer count;
			count=result.get(c);
			if(count==null)
				count=0;
			count++;
			result.put(c, count);
		}
		System.out.println(result);
	}

}
