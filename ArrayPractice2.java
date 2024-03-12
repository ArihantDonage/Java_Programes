import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the country and Team");
		int n=scan.nextInt();
		System.out.println("Enter the number of Players");
		float [][][]arr=new float [n][n][scan.nextInt()];

	
		System.out.println("Enter the Hieght of the Players");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=scan.nextFloat ();		
				}
			}}

		System.out.println("Hieght of the Players");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Hieght of the Player "+arr[i][j][k]+"Feet"+" country "+(i+1)+" Team "+(j+1)+" Player "+(k+1));		
				}
			}
		}




	}}


