import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Initial value");
int a=scan.nextInt();
System.out.println("Enter the second value");
int b=scan.nextInt();
for(int i=a;i<=b;i++)
{
	if(i%2==0)
		
	{
      System.out.println(i+" is a odd number");
	}
	else 
	{
		System.out.println(i+" is a even number");
	}
	
}
	}

}
