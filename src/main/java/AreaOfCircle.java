import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number");
		double r = sc.nextDouble();
		
		double area = (22*r*r)/7;
		
		System.out.println("Area of Circle is : "+area);
	}

}
