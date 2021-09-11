import java.util.Scanner;

public class Sum_of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of N :  ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
			System.out.println("sum of Number is : "+sum);
		}
	}

}
