package operation;

public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop l1=new Laptop();
l1.processor="AMD Ryzon";
l1.RAM=8;
l1.brand="Lenovo";
l1.Os="Windows 11";
l1.cost=34000;
l1.switchedon();
l1.switchedoff();
l1.details();
new Laptop().details();
	}

}
