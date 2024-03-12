import java.util.Scanner;

public class Greater3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a value=");
int a=scan.nextInt();
System.out.println("enter b value=");
int b=scan.nextInt();
System.out.println("enter c value=");
int c=scan.nextInt();
if(a>b&&a>c) {System.out.println("a is greater number");
}
else if(b>a&&b>c) {System.out.println("b is greater number");
}
else {System.out.println("c is greater number");
	}

}}
