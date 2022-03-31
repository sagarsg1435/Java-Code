import java.util.Scanner;
public class cbsePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter subject1 marks");
		float subject1 = sc.nextFloat();
		System.out.println("enter subjecct2 marks");
		float subject2 = sc.nextFloat();
		System.out.println("enter subject3 marks");
		float subject3 = sc.nextFloat();
		System.out.println("enter subject4 marks");
		float subject4 = sc.nextFloat();
		System.out.println("enter subject5 marks");
		float subject5 = sc.nextFloat();
		float percentage = (subject1 + subject2 + subject3 + subject4 + subject5) * 100/500.0f;
		System.out.println(percentage);
		
	}
	
}
