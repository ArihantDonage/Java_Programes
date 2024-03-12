import java.util.*;
public class ImpPattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the n value=");
		int n=scan.nextInt();


		// TODO Auto-generated method stub
		for(int i=0;i<=n;i++) {for(int j=0;j<=n;j++) {
			if(i==0 || i==n || j==0 || j==n || i==n/2 || j==n/2 || i==j || i==n-j || j==n/2-i || j==n/2+i) {
				System.out.print("*");
			}
			else{System.out.print(" ");}}
		System.out.println();
		}
	}
}