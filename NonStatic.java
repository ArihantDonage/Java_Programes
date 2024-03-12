
public class NonStatic {
void display()
{System.out.println("Inside display");
}
public static void main(String[] args) {
	NonStatic s= new NonStatic();
	s.display();
}
}

