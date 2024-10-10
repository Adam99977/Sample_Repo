package first_java_program;

public class Conditional_Statement02 {

	public static void main(String[] args) {
		int X = 39;
		if (X>40 && X>60)
		{
			System.out.println("Grade D");
		}
		else if(X>61 && X>70)
		{
			System.out.println("Grade C");
		}
		else if(X>71 && X>80)
		{
			System.out.println("Grade B");
		}
		else if(X>81 && X>100)
		{
			System.out.println("Grade A");
		}
		else
		{
			System.out.println("NE");
		}

	}

}
