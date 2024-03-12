import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of Employees");
String [] arr=new String [scan.nextInt()];
System.out.println("Enter the names of the Employee");
for(int i=0;i<arr.length;i++) {
	arr[i]=scan.next();
}
System.out.println("Names of the Employee");
for(String x:arr) {
	System.out.println(x);
}
	}

}
