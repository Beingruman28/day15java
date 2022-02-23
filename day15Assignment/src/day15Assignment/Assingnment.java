package day15Assignment;

import java.util.*;
/*
public class Assingnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 class Main {
    public static void main (String[] args) {
        try {
			System.out.println(5/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("End of program!");
	}
}

//Program 2
public class Assingnment  {
	public static void main (String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
		   try{
		     System.out.println(a/i);  
		   }catch(ArithmeticException e){
		       System.out.println(e);
		   }
	}
}

//Program 3
public class Assingnment  {
	
		public static void main (String[] args) {
			int a=10;
			for(int i=3;i>=0;i--)
			{
			     try {
					System.out.println(a/i);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			   }
		}
	}



//Program 4
public class Assingnment {
	public static void main (String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
		   try{
		     System.out.println(a/i);  
		   
		   System.out.println("between try and catch");
		   }catch(ArithmeticException e){
		       System.out.println(e);
		   }
	}
}

//Program 5
public class Assingnment {
	
	public static void main (String[] args) {
         try
       {
             System.out.println(4/0);
	 //will not get printed
             System.out.println("end of try!");
        }
catch(ArithmeticException e)
        {
            System.out.println("cant divide by 0");
        }
    }
}

//Program 6
public class Assingnment {

	public static void main (String[] args) {
        try{
            System.out.println(4/0);
           }
      
        //ArithmeticException 
        catch(ArithmeticException e){
            System.out.println("cant divide by 0");
        }
    }
}

//Program 7
public class Assingnment {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
           }
      
        //superclass of ArithmeticException 
        catch(Exception e){
            System.out.println("cant divide by 0");
        }
     }
}

//Program 8

public class Assingnment {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }finally 
        {
        	System.out.println("Exception : cant divide by 0");
        }
	}
}


//Program 9
public class Assingnment {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException :cant divide by 0");
        }catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }
   }
}

//Program 10
public class Assingnment {
	public static void main (String[] args) {
        try{
                    int[] a={1,2,3};
                    System.out.println(a[3]);
                }
   catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Out of bounds");
                
                      System.out.println(4/0);
        }     
         finally 
        {
            System.out.println("ArithmeticException : cant divide by 0");
        }
	}
    }

//Program 11
public class Assingnment {
	public static void main (String[] args) {
        try{
               System.out.println(4/0);
               
                    int[] a={1,2,3};
                    
                    System.out.println(a[3]);
                
                {
                    System.out.println("Out of bounds");
                }
        }
	    catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArithmeticException : cant divide by 0");
        }
	}
}

//Program 12
public class Assingnment {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
        }catch(Exception e)
        {
            System.out.println(e);       
        }
        finally
        {
            System.out.println("finally executed");
        }
        
       	        System.out.println("end");
	}
}

//Program 13
public class Assingnment {
	public static void main (String[] args) {
        try{
            System.out.println(4/0);
            
        }finally
        {
            System.out.println("cleaning.......");
        }
	}
}

//Program 14
public class Assingnment {
	static void canVote(int age){
		if(age<18)
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println("you are not an adult!");
            }
		else
		   System.out.println("you can vote!");
	}
	public static void main (String[] args) {
		canVote(20);
		canVote(19);
	}
}

//Program 15
public class Assingnment {
	static void func(int a) throws Exception{
		   System.out.println(10/a);  
	}
	public static void main (String[] args) {
		try{
		    func(10);
		    func(0);
		}catch(Exception e){
		   System.out.println("can't divide by zero");
		}
	
	}
}

//Program 16

public class Assingnment {
	static void func(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		   System.out.println(10/a); 
		   int[] arr={1,2,3};
		   System.out.println(arr[b]);
	}
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
		try{
		    func(in.nextInt(),in.nextInt());
    		}catch(ArithmeticException e){
    		   System.out.println("can't divide by zero");
    		}catch(ArrayIndexOutOfBoundsException e){
    		   System.out.println("Out of bounds!");
    		}
		}	in.close();
	}
   }


//Program 17

class WeightLimitExceeded extends Exception{
    WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}

public class Assingnment {
    void validWeight(int weight) throws WeightLimitExceeded{
        if(weight>15)
            throw new WeightLimitExceeded(weight);
        else
            System.out.println("You are ready to fly!");
    }  
      public static void main (String[] args) {
    	  Assingnment ob=new Assingnment();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<2;i++){
            try{
                ob.validWeight(in.nextInt());
            }catch(WeightLimitExceeded e){
                System.out.println(e);
            }
        }
        in.close();
	}
}
*/
