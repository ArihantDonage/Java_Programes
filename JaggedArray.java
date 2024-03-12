import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

int [][][] arr=new int[3][][];
for(int i=0;i<arr.length;i++) {
	arr[i]=new int[scan.nextInt()][];
	for(int j=0;j<arr[i].length;j++) {
		arr[i][j]=new int[scan.nextInt()];}}
System.out.println("Enter the Elements of the array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[i][j].length;k++) {
				arr[i][j][k]=scan.nextInt();
				System.out.println("Array Elements are "+" Block- "+(i+1)+" Row- "+(j+1)+" Col- "+(k+1)+" Element is "+arr[i][j][k]);
			}
		}
	}
}
}