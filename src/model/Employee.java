package model;


public class Employee {
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Integer salary;
	public Employee() {}
	public Employee(Integer employeeId, String firstName, String lastName, Integer salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}
	public static Employee createEmployee(String detail)
	{
			String[] arr = detail.split(",");
			Employee employee=new Employee();
			employee.setEmployeeId(Integer.parseInt(arr[0]));
			employee.setFirstName(arr[1]);
			employee.setLastName(arr[2]);
			employee.setSalary(Integer.valueOf(arr[3]));
			return employee;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Employee arg=(Employee) obj;
		return this.getSalary().equals(arg.getSalary());
	}
	@Override
	public int hashCode() {
		return this.getSalary();
		}
	
}
