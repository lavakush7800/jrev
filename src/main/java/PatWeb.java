import java.util.Scanner;

public class PatWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}

}
