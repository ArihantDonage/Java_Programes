import java.util.Scanner;

public class FruitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of fruits");
int n=scan.nextInt();
String [] arr=new String [n];
for(int i=0;i<=arr.length-1;i++) {
	System.out.println("Enter the names of fruits");
	arr[i]=scan.next();
}
System.out.println("number of the fruits = "+n);
for(int i=0;i<=arr.length-1;i++) {
	System.out.println((i+1)+")"+" fruit name = "+arr[i]);
}
	}

}
