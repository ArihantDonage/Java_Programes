
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				
	if(count*2<=9) {
			System.out.print("0"+2*count+" ");
			count++;
			}
	else {System.out.print(2*count+" ");
	count++;}}
			System.out.println();
	}
}}