package com.LineComparisionOOPs;

import java.util.Scanner;

class LineComparision {

	public void comparision() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Welcome to Line Comparison Computation !!");

		System.out.print("plese Enter line co-ordinates x1=");
		int x1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int x2=sc.nextInt();
		System.out.print("plese Enter line co-ordinates y1=");
		int y1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int y2=sc.nextInt();
		double length_of_line1=Math.sqrt((x2-x1)^2+(y2-y1)^2);

		System.out.println("Length of The line is="+length_of_line1);

		System.out.print("plese Enter line co-ordinates x3=");
		int x3=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x4=");
		int x4=sc.nextInt();
		System.out.print("plese Enter line co-ordinates y3=");
		int y3=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x4=");
		int y4=sc.nextInt();
		double length_of_line2=Math.sqrt((x4-x3)^2+(y4-y3)^2);
		System.out.println("Length of The line is="+length_of_line2);
		sc.close();

		Integer L1=new Integer((int) length_of_line1);
		Integer L2=new Integer((int) length_of_line2);

		if(L1.equals(L2))
		{
			System.out.println("both lines are equal");
		}
		else
		{
			System.out.println("both lines are not equal");
		}

		int eq=L1.compareTo(L2);
		System.out.println(eq);
		if(eq==0)
		{
			System.out.println("both lines are equal");
		}
		else if(eq>0)
		{
			System.out.println("Line1 is greater than line2");
		}
		else
		{
			System.out.println("Line2 is greater than Line1");
		}
	}
	public static void main (String []args) {
		LineComparision compare=new LineComparision();
		compare.comparision();
}
}

