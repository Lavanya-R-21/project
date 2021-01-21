package model;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> marks=new TreeSet<>();
		//whenever we add an element to TreeSet,
		//it will be added in such a way, the tree is always sorted
		marks.add(50);
		marks.add(100);
		marks.add(45);
		marks.add(55);
		marks.add(10);
		marks.add(20);
		marks.add(10);
		marks.add(88);
		marks.add(10);
		System.out.println(marks);
	}

}
