import java.util.Scanner;

public class DigitSumL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number");
int n=scan.nextInt();
int rem=0;
int div=0;
int sum=0;
while(n!=0) {
	rem=n%10;
	sum=sum+rem;
	n=n/10;
	System.out.println(n);
}
System.out.println("sum= "+sum);
	}

}