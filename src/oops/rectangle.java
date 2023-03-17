package oops;

import java.util.Scanner;

public class rectangle  extends shape {
        float length;
        float breadth;
      
        
        void acceptinput()
        {
        	Scanner scn = new Scanner(System.in);
        	System.out.println("enter the length rectangle");
        	length = scn.nextFloat();
        	System.out.println("enter the breadth rectangle");
        	breadth = scn.nextFloat();
        }
        void calculate()
        {
        	area=length*breadth;
        }
       
}
