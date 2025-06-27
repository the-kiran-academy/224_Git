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
		 

		 boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    public static void main(String[] args) {
	        isPrime(7);  // Example call
	    }
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
		// Dip Kale
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
