/* 
 * Armstrong Class to pick a random number and verify if it is a Armstrong number or not.
 * ARMSTRONG NUMBER: 153 = 1^3 + 5^3 + 3^3
 * @Author: Avinash Prodduturi
 * 
 */
package com.avi.learning;

import java.util.Random;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(99);
		int rem = 0;
		int result = 0;
		int temp = n;
		
		while(temp>0){
			rem = temp%10;
			result = result + (rem*rem*rem);
			temp = temp/10;
		}
		
		if(result==n){
			System.out.println(n+" is an Armstrong number");
		}else{
			System.out.println(n+" is not an Armstrong number");
		}

	}

}
