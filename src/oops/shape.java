package oops;

abstract public class shape {
   float area;
	abstract void acceptinput();
	abstract void calculate();
	
      void display()
      {
    	  System.out.println(area);
      }
	
}
