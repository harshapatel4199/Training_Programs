package d_16_05_2023;

public class Employee_Access {

	public static void main(String[] args) {
		Employee e = new Employee("Robert",1994,"64-c Wall Street");
		Employee e1 = new Employee("Sam",2000,"68-D Wall Street");
		Employee e2= new Employee("John",1999,"26-B Wall Street");
		
		e.display();
		e1.display();
		e2.display();

	}

}

class Employee {
	String name;
	int year;
	String address;
	
	public Employee(String k,int m,String l)
	{
		name=k;
		year=m;
		address=l;
	}
	public void display()
	{
		System.out.println(name+" "+year+" "+" "+address);
	}
}