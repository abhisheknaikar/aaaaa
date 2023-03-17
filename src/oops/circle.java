package oops;

import java.util.Scanner;

public class circle extends shape{

	float radious;
		
	void acceptinput()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the radious");
		radious= scn.nextFloat();
	}
	void calculate()
	{
		area= 3.14F*radious*radious;
	}
	}
