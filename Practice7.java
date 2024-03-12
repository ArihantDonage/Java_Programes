import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
System.out.println("Enter the size of the array");
int []arr=new int[scan.nextInt()];
System.out.println("Enter the elements of the array");
int sum=0;
for(int i=0;i<arr.length;i++) {
	arr[i]=scan.nextInt();
	sum=sum+arr[i];
}

	System.out.println("sum of the array"+sum);
	
	}

}
