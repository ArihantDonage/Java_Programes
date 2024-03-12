import java.util.*;
public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of branch");
		int b=scan.nextInt();
		boolean [][][]arr=new boolean[b][][];
		System.out.println("Enter the number of teams and Employees");
		int r=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			arr[i]=new boolean[r][];
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=new boolean[scan.nextInt()];	
			}
		}
		System.out.println("Enter the Attendence Status");
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					arr[i][j][k]=scan.nextBoolean();
				}
			}

			System.out.println("Attendence Status Didplay");

			for(int i1=0;i1<arr.length;i1++) {

				for(int j=0;j<arr[i1].length;j++){
					for(int k=0;k<arr[i1][j].length;k++){
						if(arr[i][j][k]==true)
						{
							System.out.println("Branch-"+(i+1)+" Team- "+(j+1)+" Employee-"+(k+1)+" is Present");
						}
						else
						{System.out.println("Branch-"+(i+1)+" Team-"+(j+1)+" Employee-"+(k+1)+" is Absent");
						}
					}

				}
			}}}}
