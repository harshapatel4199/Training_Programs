
public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("ram",28,999999,"ayodhya",999,"ban-vidhya");
		e.getMemberDetail();
		e.printSalary();
		e.getSpecialization();
	}

}
class Member{
	String name;
	int age;
	int phoneNumber;
	String address;
	int salary;
	public void printSalary() {
		System.out.println("salary is : " + salary);
	}
	Member(String name,int age,int phoneNumber,String address,int salary){
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	void getMemberDetail() {
		System.out.println(name + " " +age + " " +phoneNumber + " " +address + " " +salary);
	}
}
class Employee extends Member{
	Employee(String name, int age, int phoneNumber, String address, int salary,String specialization) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
	}
	String specialization;
	void getSpecialization() {
		System.out.println("specialization is : " + specialization);
	}
}
class Manager extends Member{
	Manager(String name, int age, int phoneNumber, String address, int salary,String department) {
		super(name, age, phoneNumber, address, salary);
		this.department = department;
	}
	String department;
	void getDepartment() {
		System.out.println("department is : " + department);
	}
}
