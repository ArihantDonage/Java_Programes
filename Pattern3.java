package operation;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch=scan.next().charAt(0);

		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.print("s");
		}
	
	}
}
