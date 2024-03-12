import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new  Scanner(System.in);
System.out.println("Enter the array size");
int n=scan.nextInt();
int []arr1=new int[n];
int []arr2=new int[n];

System.out.println("Enter the array Elements");
for(int i=0;i<arr1.length;i++) {
	arr1[i]=scan.nextInt();
	
}

for(int i=0;i<arr1.length;i++) {
	arr2[i]=arr1[i];
}
System.out.println("array 1");
for(int x:arr1) 
{
	System.out.println(x);
	}
System.out.println("array 2");
for(int x:arr2) {System.out.println(x);
}
}}
