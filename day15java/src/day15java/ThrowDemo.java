package day15java;

public class ThrowDemo {
	  void validate(int income) {
		  try
		  {
		  if (income >5) {
			  throw new ArithmeticException("Not Eligible");
		  }
		  else
		  {
			  System.out.println("Eligible");
		  }
		  }
		  catch (ArithmeticException e)
		  {
		  System.out.println("Sorry");
	  }
	  }		  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo td = new ThrowDemo();
		td.validate(18);
		System.out.println("Welcome");

	}

}
