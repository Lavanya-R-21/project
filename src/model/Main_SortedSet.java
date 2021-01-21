package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main_SortedSet {

	public static void main(String[] args) throws ParseException {
//		SortedSet<Integer> marks=new TreeSet<>();		//TreeSet implements SortedSet
//		marks=new HashSet();			HashSet does not implement SortedSet
		NavigableSet<Integer> marks=new TreeSet<>();
		marks.add(20);
		marks.add(100);
		marks.add(10);
		marks.add(90);
		System.out.println(marks);
		marks=marks.descendingSet();		//returns descending order set
		System.out.println(marks);
		LocalDate dob=LocalDate.of(1998, 11, 1);
		LocalDate today=LocalDate.now();
		Period diff = Period.between(dob, today);
		System.out.printf("You are %d years, %d months and %d days old\n",diff.getYears(),diff.getMonths(),diff.getDays());
		GregorianCalendar cal=new GregorianCalendar();
		System.out.println(cal.isLeapYear(2008));
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the date of registration:(dd-MM-yyyy)");
		String input=sc.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);		//it was true by default
		Date dt=new Date();
		dt=sdf.parse(input);
		System.out.println(sdf.format(dt));
		SimpleDateFormat sdf1=new SimpleDateFormat("z");
		System.out.println(sdf1.format(dt));
	}

}
