import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Number of college");
float[][]arr=new float [scan.nextInt()][];
System.out.println("Enter the Number of student in each college");
for(int i=0;i<arr.length;i++) {
arr[i]=new float[scan.nextInt()];
	}

System.out.println("Enter the marks of students");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
	arr[i][j]=scan.nextFloat();
}
}
System.out.println("Enter the marks of students");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++){
		System.out.println(" college- "+(i+1)+" Student- "+(j+1)+" marks of students "+arr[i][j]);
	}
}
	}}
