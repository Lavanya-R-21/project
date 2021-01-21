package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Task1 {
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> input)
	{
		//which Set?	HashSet?	no because order is based on hashCode
		//TreeSet?	no it will maintain elements in sorted order
		//LinkedHashSet?		YES. this is maintain the order of elements
		LinkedHashSet<Integer> temp=new LinkedHashSet<>(input);
		ArrayList<Integer> result=new ArrayList<Integer>(temp);
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,15,7,5,4,14,15,16,7));
		ArrayList<Integer> result = removeDuplicates(input);
		System.out.println(result);
	}
}
