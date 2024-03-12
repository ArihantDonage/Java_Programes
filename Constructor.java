package operation;

public class Constructor {
String processor, brand,os;
int ram;
float cost;
void switchon()
{System.out.println("Laptop is switched on");
}
void switchoff()
{System.out.println("Laptop is switched off");
}
void details()
{System.out.println(processor);
System.out.println(brand);
System.out.println(os);
System.out.println(ram);
System.out.println(cost);
}
public Constructor(String a,String b,String c,int d,float e)
{processor=a;
brand=b;
os=c;
ram=d;
cost=e;
}
}