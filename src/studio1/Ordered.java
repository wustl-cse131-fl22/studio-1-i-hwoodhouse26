package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		boolean xAndY = x > y;
		boolean yAndz = y > z;
		boolean ascending = xAndY && yAndz;
		//we find out if the numbers are ascending
		
		boolean xLessY = x < y;
		boolean yLessZ = y < z;
		boolean descending = xLessY && yLessZ;
		// we find out if the numbers are descending
		
		boolean isOrdered = ascending || descending;
		// we find out if either of these are true
		
		System.out.println("Are the numbers ordered? " + isOrdered);

	}

}
