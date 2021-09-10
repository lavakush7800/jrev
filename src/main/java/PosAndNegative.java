import java.util.Scanner;

public class PosAndNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		
		if(number > 0)
			System.out.println(number+" is Positive Number");
		else if(number < 0)
			System.out.println(number+" is Negative Number");
		else
			System.out.println("You are Entered zero");

	}

}
