package operation;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.print("enter the Charecter=");
char ch=scan.next().charAt(0);
for(int i=1;i<=5;i++) {
	for(int n=1;n<=5-i;n++) {
		System.out.print(ch);
	}
	System.out.println();
	}
	}
}
