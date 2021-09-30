import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Hindi");
		int hindi = sc.nextInt();
		
		System.out.println("Enter Number of English");
		int english = sc.nextInt();

		System.out.println("Enter Number of Physics");
		int physics = sc.nextInt();
		
		System.out.println("Enter Number of Chemistry");
		int chemistry = sc.nextInt();
		
		System.out.println("Enter Number of Maths");
		int math = sc.nextInt();
		
		float total = hindi + english + physics + chemistry + math;
	}

}
