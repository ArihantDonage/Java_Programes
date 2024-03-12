import java.util.Scanner;

public class Percentage2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the m value and n value");
		
int [][]arr=new int[scan.nextInt()][scan.nextInt()];
	 for(int i=0;i<=arr.length;i++) {
		 
	 int a;
		 if(i==0){a=3;}
		 else if(i==2) {a=4;}else {a=2;} 
		 
		 for(int j=0;j<=a;j++) {
			 arr[i][j]=scan.nextInt();
		 }
	 }
	
	 for(int i=0;i<=arr.length;i++) {
		 
		 int a;
			 if(i==0){a=3;}
			 else if(i==2) {a=4;}else {a=2;} 
			 
			 for(int j=0;j<=a;j++) {System.out.println("arr[i][j]");
				
			 }
		 }
		
	 
	}

}
