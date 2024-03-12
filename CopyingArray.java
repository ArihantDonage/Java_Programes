import java.util.Scanner;

public class CopyingArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of Brands and Mobiles");
		//create a arrays 2d
		double [][] arr=new double[scan.nextInt()][];
		//Creating jagged array
		System.out.println("Creating jagged array");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=new double[scan.nextInt()];
		}
		//Storing the 
		System.out.println("Enter the cost of the mobiles");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=scan.nextDouble();
				
			}
			
			for(int k=0;k<arr.length;k++) {
				for(int j=0;j<arr[i].length;j++) {
				System.out.println("mobile costs are "+" Brand "+(k+1)+" mobile "+(j+1)+"Cost is "+arr[i][j]);
					
				}
			
			}

		}
	}
}
