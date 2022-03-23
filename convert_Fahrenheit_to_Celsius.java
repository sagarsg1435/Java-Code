import java.util.Scanner;
public class convert_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float celsius , fahreheit;
		System.out.println("enter the value in f");
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		celsius = (f -32) *(5/9.0f);
		System.out.println("temperature in celsius" + celsius);
		
		
		
		
		
		
				
	}

}
