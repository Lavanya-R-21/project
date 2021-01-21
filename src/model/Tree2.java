package model;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class StudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student arg0, Student arg1) {
		return arg0.getStudentId().compareTo(arg1.getStudentId());
	}
	
}

public class Tree2 {

	public static void main(String[] args) {
		//StudentComparator scom=new StudentComparator();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<Student> studentSet=new TreeSet<Student>((a,b)->a.getStudentId().compareTo(b.getStudentId()));
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
