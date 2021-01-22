
package com.avi.learning;

/**
 * @author Avinash Prodduturi
 * This is a basic program to print patterns and a standard example of for loop
 */
public class Patterns {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int n = 4;
		Patterns_demo pattern = new Patterns_demo();
		pattern.printLeftStar(i, j, n);
		pattern.printRightStar(i, j, n);
	}

	/**
	 * This method is to print a right triangle of *
	 */
	public void printRightStar(int i, int j, int n) {
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * This method is to print a left triangle of *
	 */
	public void printLeftStar(int i, int j, int n) {
		for (i = 1; i <= n; i++) {
			for (j = n - 1; j >= i; j--) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
