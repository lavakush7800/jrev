import java.util.Scanner;

public class Patt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Want to print : ");
		int n = sc.nextInt();
		
		for(int j=n; j>=1; j--) {
			for(int i=1; i<=j; i++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
