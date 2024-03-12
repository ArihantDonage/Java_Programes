import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter your Nationality");
String nationality=scan.next();
System.out.println("Enter your age");
int age=scan.nextInt();
VotingCheck.CheckEligibility(nationality,age);
	}

}
