import java.util.Scanner;

public class Check_Whether_a_Number_is_Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is Even Number");
		else
			System.out.println(n+" is Odd Number");

	}

}
