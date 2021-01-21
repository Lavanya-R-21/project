package model;

import java.util.Comparator;
import java.util.TreeSet;

//class IntegerComparator implements Comparator<Integer>
//{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		return o2-o1;
//	}
//	
//}

public class IntegerComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Integer> marks=new TreeSet<Integer>((o1,o2)->o2-o1);
		marks.add(11);
		marks.add(10);
		marks.add(70);
		marks.add(100);
		marks.add(50);
		marks.add(90);
		marks.add(10);
		marks.add(80);
		marks.add(12);
		System.out.println(marks);
	}

}
