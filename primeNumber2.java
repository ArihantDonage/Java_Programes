package operation;
import java.util.*;
public class primeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.print("Enter any Number=");
int n=scan.nextInt();
int count=0;
for(int i=1;i<=n;i++) {
if(n<0 || n%i==0) {
count++;}}
if(count==2) {
System.out.println(n+" "+"Is Prime number");}
else {System.out.println("Not Prime number");}
}}