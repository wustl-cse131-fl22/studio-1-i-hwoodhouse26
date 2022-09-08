package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year.");
		int num = in.nextInt();
		boolean four = num % 4 == 0;
		boolean hundred = num % 100 == 0;
		boolean fourhundred = num % 400 == 0;
		boolean leap1 = four && !hundred;
		boolean leap2 = leap1 || fourhundred;
		System.out.println(leap2);

	}

}
