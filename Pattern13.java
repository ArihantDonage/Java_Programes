import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the end number=");
		int n=scan.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){if(i%j==0){count++;}}
			if(count==2) {System.out.println(i);}} 
			}
		}
