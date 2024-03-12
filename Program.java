import java.util.*;
public class Program {

public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter a=");
double a=scan.nextDouble();
System.out.println("enter b=");
double b=scan.nextDouble();
double res=div(a,b);
System.out.println();
	}
public static double div(double a,double b)
{
return a/b;
}
}
