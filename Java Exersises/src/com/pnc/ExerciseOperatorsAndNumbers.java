package com.pnc;

public class ExerciseOperatorsAndNumbers {

	// binary
	// 1 = 1
	// 8 = 1000
	// 33 = 100001
	// 78 = 0111001
	// 787 = 1100100011
	// 33987 = 1100001100100001

	// decimal
	// 0010 = 2
	// 1001 = 9
	// 0011 0010 = 52
	// 0111 0010 = 114
	// 0010 0001 1111 = 543
	// 0010 1100 0110 0111 = 11367

	public static void main(String[] args) {

		// 3
		int x = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));

		int x1 = 9;
		System.out.println(Integer.toBinaryString(x));
		x1 = x1 << 1;
		System.out.println(x1);
		System.out.println(Integer.toBinaryString(x1));

		int x2 = 17;
		System.out.println(Integer.toBinaryString(x2));
		x2 = x2 << 1;
		System.out.println(x2);
		System.out.println(Integer.toBinaryString(x2));

		int x3 = 88;
		System.out.println(Integer.toBinaryString(x3));
		x3 = x3 << 1;
		System.out.println(x3);
		System.out.println(Integer.toBinaryString(x3));

		// 4
		int y = 150;
		System.out.println(Integer.toBinaryString(y));
		y = y >> 2;
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y));
		
		int y1 = 225;
		System.out.println(Integer.toBinaryString(y1));
		y1 = y1 >> 2;
		System.out.println(y);
		System.out.println(Integer.toBinaryString(y1));
		
		int y2 = 1555;
		System.out.println(Integer.toBinaryString(y2));
		y2 = y2 >> 2;
		System.out.println(y2);
		System.out.println(Integer.toBinaryString(y2));
		
		int y3 = 32456;
		System.out.println(Integer.toBinaryString(y3));
		y3 = y3 >> 2;
		System.out.println(y3);
		System.out.println(Integer.toBinaryString(y3));
		
		//5
		int a = 40;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		//6
		int b = 0;
		System.out.println(b);
		b =+ 1;
		System.out.println(b);
		b++;
		System.out.println(b);
		b = b + 1;
		System.out.println(b);
		
		//7
		
		int c = 5;
		int d = 8;
		int sum = ++c + d;
		System.out.println(c);
		System.out.println(sum);
		
		int c2 = 5;
		int d2 = 8;
		int sum2 = c2++ + d2;
		System.out.println(c2);
		System.out.println(sum2);
		
		

	}
}
