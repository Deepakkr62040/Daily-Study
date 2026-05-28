package Java.basic;

public class TypeConversion {
    public static void main(String args[]){
		System.out.println("------- Type Conversion -------");
		
		//byte data range
		System.out.print("\n");
		System.out.println("Byte data range ");
		byte byteRangeInNegative=Byte.MIN_VALUE;
		byte byteRangeInPositive=Byte.MAX_VALUE;
		
		System.out.print(byteRangeInNegative + " To ");
		System.out.println(byteRangeInPositive);
		
		//short data range
		System.out.print("\n");
		System.out.println("Short data range");
		short ShortRangeInNegative=Short.MIN_VALUE;
		short ShortRangeInPositive=Short.MAX_VALUE;
		
		
		System.out.print(ShortRangeInNegative + " To ");
		System.out.println(ShortRangeInPositive);
		
		//char data range
		System.out.print("\n");
		System.out.println("Char data range");
		char CharRangeInNegative=Character.MIN_VALUE;
		char CharRangeInPositive=Character.MAX_VALUE;
		
		System.out.print((int) CharRangeInNegative + " To ");
		System.out.println((int) CharRangeInPositive);
		
		//int data range
		System.out.print("\n");
		System.out.println("Int data range");
		int intRangeNegative=Integer.MIN_VALUE;
		int intRangePositive=Integer.MAX_VALUE;
		
		System.out.print(intRangeNegative + " To ");
		System.out.println(intRangePositive);

		//long data range
		System.out.print("\n");
		System.out.println("long date range");
		long longRangeNegative = Long.MIN_VALUE;
		long longRangePositive = Long.MAX_VALUE;

		System.out.print(longRangeNegative + " To ");
		System.out.println(longRangePositive);

		//float date range
		System.out.print("\n");
		System.out.println("float data range");
		float floatRangeNegative=Float.MIN_VALUE;
		float floatRangePositive=Float.MAX_VALUE;

		System.out.print(floatRangeNegative + " To ");
		System.out.println(floatRangePositive);

		//double data range
		System.out.print("\n");
		System.out.println("double data range");
		double doubleRangeNegative=Double.MIN_VALUE;
		double doubleRangePositive=Double.MAX_VALUE;

		System.out.print(doubleRangeNegative + " To ");
		System.out.println(doubleRangePositive);
	}
}
