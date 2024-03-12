import java.util.*;
public class PatternA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the n value=");
		int n=scan.nextInt();
		
for (int i=0;i<=n;i++) {
	for(int j=0;j<=n;j++) {
		if(i==0 || i==n/2 || j==0 || j==n && i<=n/2 ) 
		{
		System.out.print("*");
		}
		else {System.out.print(" ");}
		
		
		
	}
	System.out.println();
}
	}

}
