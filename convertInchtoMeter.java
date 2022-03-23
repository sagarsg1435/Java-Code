import java.util.Scanner;
public class convertInchtoMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Enter Length in");
double inch = in.nextDouble();
double meters = inch* 0.0254;
System.out.println(inch + "inch is" + meters + "meters");
	}

}

