import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number=");
int n=scan.nextInt();
int rem1=0;
int rem2=0;
int div1=0;
int div2=0;
int sum=0;
rem1=n%10;
div1=n/10;
rem2=div1%10;
div2=div1/10;
sum=rem1+rem2+div2;
System.out.println("Digit sum of "+n+"  Number is= "+sum);

	}

}
