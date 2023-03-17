package oops;

import java.util.Scanner;

public class square extends shape{
    float length;
   
    
    void acceptinput()
    {
    System.out.println("enter the length of square");
    Scanner scn = new Scanner(System.in);
    length = scn.nextFloat();
    }
    
    void calculate()
    {
    	area=length*length;
    }
    
    

}
