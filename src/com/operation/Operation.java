package com.operation;

public class Operation {
	
	public static void isEven(int number) {
		// sayali dhanvij 
		
	}

	public static void isOdd(int number) {
		 // Swati Belokar
	}

	public static void isPrime(int number) {
		// Ashvini Ingle 
	}

	public static void isPerfect(int number) {
		// Yash Mandle
	}

	 public static void isArmstrong(int number) {
	        int originalNumber = number;
	        int result = 0;
	        int n = 0;

	        // Count number of digits
	        int temp = number;
	        while (temp != 0) {
	            temp /= 10;
	            n++;
	        }

	        // Calculate sum of nth powers of digits
	        temp = number;
	        while (temp != 0) {
	            int digit = temp % 10;
	            result += Math.pow(digit, n);
	            temp /= 10;
	        }

	        // Check if it is an Armstrong number
	        if (result == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	    }

	 public static void isPalindrome(int number) {
			// kailas jare
		}
		
		 public static void isFibonacci(int number) {
		        if (number < 0) {
		            System.out.println(number + " is not a Fibonacci number (negative numbers are not in the sequence).");
		            return;
		        }

		        // Formula to check Fibonacci: A number is Fibonacci if one or both of (5*n^2 + 4) or (5*n^2 - 4) is a perfect square
		        if (isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4)) {
		            System.out.println(number + " is a Fibonacci number.");
		        } else {
		            System.out.println(number + " is not a Fibonacci number.");
		        }
		    }

		    // Helper method to check if a number is a perfect square
		    private static boolean isPerfectSquare(int n) {
		        int sqrt = (int) Math.sqrt(n);
		        return (sqrt * sqrt == n);
		    }

		    // Main method for testing
		    public static void main(String[] args) {
		        isFibonacci(21);  // Fibonacci number
		        isFibonacci(22);  // Not a Fibonacci number
		        isFibonacci(0);   // Fibonacci number
		        isFibonacci(-5);  // Negative number, not Fibonacci
		    }
	
	public static void isStrong(int number) {
		// Dhanashree Kadawale
	}
	
	public static void isHarshad(int number) {
		// Bhad Vaishnavi Gorkhnath 
	}
	
	public static void reverseString(String name) {
		// Sandip Ugile 
	}

	public static void isAnagram(String name1, String name2) {
		// Laxman Masale
	}

	public static void isSubString(String name1, String name2) {
		// Ganesh Jadhav
	}

	public static void isVowel(char ch) {
		// sameer turkar
	}
	
	public static void isConsonant(char ch) {
		// Shruti Gaikwad
	}
	
	public static void isLeapYear(int year) {
		// Rushikesh Kharode
	}
	
	public static void sumOfArray(int[] arr) {
		// Abhishek Kokitkar 
	}
	
	public static void isSorted(int[] arr) {
		// Ganesh Chougule
	}
	
	public static void decendingArray(int[] arr) {
		// Tejas Bagad 
	}
	
	public static void ascendingArray(int[] arr) {
		// Likhita Bhangale
	}
	
	public static void smallestElement(int[] arr) {

	}
	
	public static void largestElement(int[] arr) {

	}
	
}
