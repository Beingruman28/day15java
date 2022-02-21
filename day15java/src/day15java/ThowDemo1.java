package day15java;

public class ThowDemo1 {
	
	void validate(int income) {
		  if (income >5) {
			  throw new ArithmeticException("Not Eligible");
		  }
		  else
		  {
			  System.out.println("Eligible");
		  }
		  
	{
		  System.out.println("Sorry");
	}	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo td = new ThrowDemo();
		td.validate(9);
		System.out.println("Welcome");

	}
}