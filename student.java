package d_29_05_2023;

import d_15_05_2023.Student_Info;

public class student {

	public static void main(String[] args) {
		student_info ram = new student_info();
	    ram.set_student("Ram",01,25,1234567890) ;
	    ram.display_student_info();
	    
	    student_info lakshaman = new student_info();
	    lakshaman.set_student("Lakshaman",02,26,1234567891) ;
	    lakshaman.display_student_info();
	}

}

 class student_info{
	 private String name;
	 private int id;
	 private int age;
	 private int mobile_no;

	  public void display_student_info() {
	    System.out.println("name : "+this.name);
	    System.out.println("id : "+this.id);
	    System.out.println("age : "+this.age);
	    System.out.println("mobile_no : "+this.mobile_no);
	  }

	  public void set_student(String name, int id, int age, int mobile_no) {
	    this.name = name;
	    this.id = id;
	    this.age = age;
	    this.mobile_no = mobile_no;
	  }
}
