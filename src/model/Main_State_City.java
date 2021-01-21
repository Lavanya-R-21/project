package model;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class StateCityComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getState().equals(o2.getState()))
			if(o1.getCity().equals(o2.getCity()))
				return o1.getName().compareTo(o2.getName());
			else
				return o1.getCity().compareTo(o2.getCity());
		return o1.getState().compareTo(o2.getState());
	}
	
}

public class Main_State_City {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Student> studentSet=new TreeSet<Student>(new StateCityComparator());
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			Student student = Student.createStudent(detail);
			studentSet.add(student);
		}
		
		for(Student s : studentSet)
			System.out.println(s);
	}

}
