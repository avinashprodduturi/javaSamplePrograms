package com.avi.learning;

public class Palindrome_Demo {
	static final int originlNum = 156561;
	public static void main(String[] args) {
		int n = originlNum;
		int reverseNum = 0;
		int remainder = 0;
		while(n>0){
			remainder = n%10;
			reverseNum = (reverseNum*10)+remainder;
			n=n/10;
		}
		if(reverseNum==originlNum){
			System.out.println(originlNum+" is a PALINDROME");
		}else{
			System.out.println(originlNum+" is not a PALINDROME");
		}
	}
}
