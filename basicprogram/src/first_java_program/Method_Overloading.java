package first_java_program;

public class Method_Overloading {
	
public double add(double a, float b )
{
	
	double c = a+b;
	System.out.println(+c);
	return c;
	
}
public int add(int d,int e,int f)
{
	
	int g=d+e+f;
	System.out.println(+g);
	return g;
	

}

	public static void main(String[] args) {
	Method_Overloading obj = new Method_Overloading();
	obj.add(10.5,10);
	obj.add(10,10,10);
	
	
	

	}

}
