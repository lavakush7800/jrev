import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Maths :");
		float math = sc.nextFloat();
		
		System.out.print("Enter Number of Chemistry :");
		float chemistry = sc.nextFloat();
		
		System.out.print("Enter Number of Physics :");
		float physics = sc.nextFloat();
		
		System.out.print("Enter Number of Hindi :");
		float hindi = sc.nextFloat();
		
		System.out.print("Enter Number of English :");
		float english = sc.nextFloat();
		
		float percentage;
		float total;
	    total = hindi + english + math + physics + chemistry;
	    
	    System.out.println("You are total Number Earned is : "+ total);
	    
	    percentage = (float)((total/500) * 100);
	    System.out.println("Your Percentage is : "+percentage);
	    

	}

}
