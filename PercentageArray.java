import java.util.*;
public class PercentageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
float [] arr=new float[10];
for(int i=0;i<=9;i++) {
	System.out.println("Enter the Elements to be stored "+(i+1)+" = ");
	arr[i]=scan.nextFloat();
}
for(int i=0;i<=9;i++) {
	System.out.println(" Array Element is"+(i+1)+" ="+arr[i]);
}
	}

}
