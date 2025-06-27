package com.operation;

import java.util.Arrays;

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
	    int sum = 0;

	    for (int i = 1; i < number; i++) {
	        if (number % i == 0) {
	            sum += i;
	        }
	    }

	    if (sum == number && number != 0) {
	        System.out.println(number + " is a perfect number.");
	    } else {
	        System.out.println(number + " is not a perfect number.");
	    }
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
		int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            
            
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            number = number/10;
        }
        if (sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }
	}

	public static void isHarshad(int number) {
		// Bhad Vaishnavi Gorkhnath
	}

	public static void reverseString(String name) {
		// Sandip Ugile
	}

	public static void isAnagram(String name1, String name2) {
		// Laxman Masale
		 name1 = name1.replaceAll("\\s", "").toLowerCase();
		    name2 = name2.replaceAll("\\s", "").toLowerCase();

		    if (name1.length() != name2.length()) {
		        System.out.println("Not anagrams.");
		        return;
		    }

		    char[] arr1 = name1.toCharArray();
		    char[] arr2 = name2.toCharArray();

		    Arrays.sort(arr1);
		    Arrays.sort(arr2);

		    if (Arrays.equals(arr1, arr2)) {
		        System.out.println("Strings are anagrams.");
		    } else {
		        System.out.println("Not anagrams.");
		    }
		
		
		
	}

	public static void isSubString(String name1, String name2) {
		// Ganesh Jadhav
	}

	public static void isVowel(char ch) {

		// sameer turkar

		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Charater is Vowel: " + ch);

		} else {
			System.out.println("Charater is Not Vowel.");
		}
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
