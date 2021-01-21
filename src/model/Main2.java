package model;

import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		HashSet<Employee> employeeSet=new HashSet<Employee>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			Employee employee = Employee.createEmployee(detail);
			employeeSet.add(employee);
			
		}
		
		for(Employee e : employeeSet)
		{
			System.out.println(e);
			
		}
		System.out.println("-----------------------------");
	}
}
