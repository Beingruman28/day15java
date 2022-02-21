package day15java;

public class ExceptionDemo {
	 static void func(int a) throws Exception {
		 System.out.println(10/a);
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
   	   func(10);
   	   func(1);
   	   func(0);
   	   func(12);
      }catch (Exception e) {
   	   System.out.println("cant divide by zero");
      }
	}

}
