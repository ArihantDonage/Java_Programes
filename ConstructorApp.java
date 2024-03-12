package operation;

public class ConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor c1=new Constructor("AMD","HP","win",16,50000);
c1.switchon();
c1.switchoff();
c1.details();
new Constructor("i5","dell","linux",32,80000).details();	}

}
