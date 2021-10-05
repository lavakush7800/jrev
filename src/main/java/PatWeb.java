import java.util.Scanner;

public class PatWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%n==0) {
				System.out.println(i);
			}
		}
	}

}
