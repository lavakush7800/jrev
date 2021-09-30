import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Hieght : ");
		float hieght = sc.nextFloat();
		
		System.out.println("Enter Width : ");
		float width = sc.nextFloat();
		
		float area;
		area  = hieght * width;
		System.out.println("Area of Rectangles is : "+area);

	}

}
