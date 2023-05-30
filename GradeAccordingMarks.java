import java.util.Scanner;

public class GradeAccordingMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first subject marks: ");
		int sub1 = sc.nextInt();
		System.out.println("Enter second subject marks: ");
		int sub2 = sc.nextInt();
		System.out.println("Enter third subject marks: ");
		int sub3 = sc.nextInt();
		System.out.println("Enter fourth subject marks: ");
		int sub4 = sc.nextInt();
		
		int average_marks = (sub1+sub2+sub3+sub4)/4;
		
		if(average_marks>90) System.out.println("A grade");
		else if(average_marks>80 && average_marks<=90) System.out.println("B grade");
		else if(average_marks>70 && average_marks<=80) System.out.println("C grade");
		else System.out.println("Fail");
	}

}
