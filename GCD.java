package operation;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter two Numbers");
System.out.print("Enter m=");
int m=scan.nextInt();
System.out.print("Enter n=");
int n=scan.nextInt();
int rem;
for(int i=1;i<=n;i++) {
rem=m%n;
m=n;
n=rem;
if(n==0) {System.out.println(m+"is gdc");}
}
	int count=0;
	for(int i=1;i<=m;i++) {
	if(m<0 || m%i==0) {
	count++;}}
	if(count==2) {
	System.out.println(m+" "+"Is Prime number");}
	else {System.out.println("Not Prime number");}
}}
