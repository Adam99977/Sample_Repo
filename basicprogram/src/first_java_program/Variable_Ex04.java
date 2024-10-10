package first_java_program;

public class Variable_Ex04 {
	
	static int studentcount = 0;
	
	int roll_no;
	String name;
	
	public Variable_Ex04(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
		studentcount++;	
	}
	
	public void display()
	{
		System.out.println(roll_no +" "+name);
	}
	public static void studentcounts()
	{
		System.out.println(+studentcount);
	}
	
	public static void main(String[] args) {
		
		Variable_Ex04 obj1 = new Variable_Ex04(123,"adam");
		Variable_Ex04 obj2 = new Variable_Ex04(123,"adam");
		Variable_Ex04 obj3 = new Variable_Ex04(123,"adam");
		
		obj1.display();
		obj2.display();
		obj3.display();
		
		
		Variable_Ex04.studentcounts();
		
		
	}

}

