import java.util.Scanner;

public class Company2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter number of the companies = ");
int m=scan.nextInt();
System.out.println("Enter number of the Employs company = ");
int n=scan.nextInt();
String [][]arr=new String [m][n];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("name of employee in company no-"+i+" And employee no- "+j);
		arr[i][j]=scan.next();
		
	}
}

for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println(arr[i][j]+" company no- "+i+"  employee no- "+j);
		
	}
}
	}

}
