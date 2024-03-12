 
public class Createobject {
String name;
int age;
String gender;
void study()
{
	System.out.println("Study hard");
	}
void introduction()
{
	System.out.println("Happy Birthday");
	}
	
public static void main(String[] args) 
{
	Createobject S1= new Createobject();
S1.name="Arihant";
S1.age=25;
S1.gender="male";
S1.study();
S1.introduction();

Createobject S2=new Createobject();
S2.name="pooja";
S2.age=23;
S2.gender="female";
S2.study();
S2.introduction();
}
}