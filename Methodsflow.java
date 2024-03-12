
public class Methodsflow {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int p=20,q=10,r=30;
		float a=5,b=10,c=15;
		System.out.println(add(p,q));
		System.out.println(add(p,r));
		System.out.println(add(p,a));
		System.out.println(add(b,q));
		System.out.println(add(a,b,c));
		System.out.println(add(p,q,r));
	}
public static int add(int x,int y)
{return(x+y);
}

public static float add(int x,float y)
{return(x+y);
}
public static float add(float x,int y)
{return(x+y);
}
public static int add(int x,int y,int z)
{return(x+y+z);}
public static float add(float x,float y,float z)
{return(x+y+z);
}
}