package model;


public class Student //implements Comparable<Student>
{
	private Integer studentId;
	private String name;
	private String city;
	private String state;
	public Student()
	{
		
	}
	public Student(Integer studentId, String name, String city, String state) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + ", state=" + state + "]";
	}
	public static Student createStudent(String detail)
	{
		String[] arr = detail.split(",");
		Student student=new Student();
		student.setStudentId(Integer.valueOf(arr[0]));
		student.setName(arr[1]);
		student.setCity(arr[2]);
		student.setState(arr[3]);
		return student;
	}
//	@Override
//	public int compareTo(Student arg0) {
////		return this.studentId.compareTo(arg0.getStudentId());
//		return this.studentId-arg0.getStudentId();
//	}
}
