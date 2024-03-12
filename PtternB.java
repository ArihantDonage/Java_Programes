import java.util.Scanner;

public class PtternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the n value=");
int n=scan.nextInt();
for(int i=0;i<=n;i++) {
	for(int j=0;j<=n;j++) {
		if(i==0 && j<=n-1 || i==n && j<=n-1 || i==n/2 && j<=n-2  || j==0 || j==n && i>=1 && i<=n/2-1 || j==n && i>=n/2+1 && i<=n-1) {
			System.out.print("*");
		}
		else {System.out.print(" ");
		
	}
	
}
	System.out.println();
	}

}}
