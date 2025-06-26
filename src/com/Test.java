package com;

import com.operation.Operation;

public class Test {

	public static void main(String[] args) {
		
		Operation.isEven(10);
		Operation.isOdd(11);
		Operation.isPrime(13);
		Operation.isPerfect(28);
		Operation.isArmstrong(153);
		Operation.isPalindrome(121);
		Operation.isFibonacci(21);
		Operation.isStrong(145);
		Operation.isHarshad(18);
		Operation.reverseString("hello");
		Operation.isAnagram("listen", "silent");
		Operation.isSubString("hello", "lo");
		Operation.isVowel('a');
		Operation.isConsonant('b');
		Operation.isLeapYear(2014);
		Operation.sumOfArray(new int[]{1, 2, 3, 4, 5});
		Operation.isSorted(new int[]{1, 2, 3, 4, 5});
		Operation.decendingArray(new int[]{5, 4, 3, 2, 1});
		Operation.ascendingArray(new int[]{5, 4, 3, 2, 1});
		Operation.smallestElement(new int[]{5, 4, 3, 2, 1});
		Operation.largestElement(new int[]{5, 4, 3, 2, 1});
	
	}

}
