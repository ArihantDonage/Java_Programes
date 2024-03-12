package operation;
import java.util.Scanner;
public class PrimeNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		for(int i=2;i<n;i++) {
			int res=PrimeNumber1.checkprime(n);
			if(res!=-1) {System.out.println(i);
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
