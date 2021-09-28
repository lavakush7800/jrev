import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Maths :");
		int math = sc.nextInt();
		
		System.out.print("Enter Number of Chemistry :");
		int chemistry = sc.nextInt();
		
		System.out.print("Enter Number of Physics :");
		int physics = sc.nextInt();
		
		System.out.print("Enter Number of Hindi :");
		int hindi = sc.nextInt();
		
		System.out.print("Enter Number of English :");
		int english = sc.nextInt();
		
		float percentage;
		int total;
	    total = hindi + english + math + physics + chemistry;
	    
	    System.out.println("You are total Number od Earned is : "+ total);
	    
	    percentage = total/500 * 100;
	    System.out.println("Your Percentage is : "+percentage);
	    

	}

}
