import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Brand and Mobile number");
	int n=scan.nextInt();
	float[][]arr=new  float[n][n];	
	System.out.println("Enter the rate of Brand and Mobile");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=scan.nextFloat();
			System.out.println((i+1)+") Brand  "+(j+1)+") Mobile-"+" Rate is-"+arr[i][j]);
		}
	}
	}

}
