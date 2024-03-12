import java.util.Scanner;
public class Takeinput {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the byte value");
byte x=scan.nextByte();
System.out.println("value in the x="+x);
System.out.println("Enter the int value");
int y=scan.nextInt();
System.out.println("value in the x="+y);
System.out.println("Enter the short value");
short z=scan.nextShort();
System.out.println("value in the x="+z);
System.out.println("Enter the long value");
long a=scan.nextLong();
System.out.println("value in the x="+a);
System.out.println("enter the double value");
double b=scan.nextDouble();
System.out.println("double value is"+b);
System.out.println("enter the float value");
float c=scan.nextFloat();
System.out.println("float value is"+c);
System.out.println("enter the your name");
String d=scan.nextLine();
System.out.println(d);
System.out.println("Enter your place");
String e=scan.nextLine();
System.out.println(e);
System.out.println("Enter your place");
String f=scan.nextLine();
System.out.println(f);



	}

}