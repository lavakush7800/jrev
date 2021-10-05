import java.util.Scanner;

public class PatWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count;
		for(int i=0; i<=n; i++) {
			count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0)
				count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	}

}
