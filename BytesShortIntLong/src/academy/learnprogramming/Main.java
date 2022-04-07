package academy.learnprogramming;

public class Main {
	public static void main(String[] args) {
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Integer Maximum Value = " + myMaxIntValue);
		System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
		
		int myMaxIntTest = 2_147_483_647;
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		
		long myLongValue = 100L;
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		
		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println("Big Long Literal Value = " + bigLongLiteralValue);
		
//		int myTotal = (myMinIntValue / 2);
//		byte myNewByteValue = (byte)(myMinByteValue / 2);
//		short myNewShortValue = (short)(myMinShortValue / 2);
//		
//		System.out.println(myNewShortValue);
//		
//		byte byteNumber = 124;
//		short shortNumber = 1345;
//		int intNumber = 12;
//		long longTotal = 50000 + 10 * (byteNumber + shortNumber + intNumber);
//		System.out.println(longTotal);
	}
}