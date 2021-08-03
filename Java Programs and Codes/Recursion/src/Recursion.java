//code practicing recursion

import java.util.Arrays;

public class Recursion {
	public static void afunction(int[] a) {
		int n = a.length;
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			result = 100*a[i];
		}
	}
	public static int recursionFactorial(int n) {
		if (n==0) return 1;
		else return n*recursionFactorial(n-1);
	}
	public static int linearSum(int[] a, int n) {
		if (n ==1) {return a[0];}
		else {
			return linearSum(a,n-1)+a[n-1];
		}
			
	}
	public static void reverse(int []a, int i, int j) {
		if (i<j) {
			int temp = a[i];
			a[i]=a[j];
			a[j] = temp;
			reverse(a, i+1, j-1);
		}
		else
			return;
	}
	public static void reverseString(String s, int i, int j) {
		char [] ch = s.toCharArray();
		if (i >= j) { 
			System.out.println(s);
			return ;
		}
		else {
		char temp = s.charAt(i);
		s.replace(s.charAt(i), s.charAt(j));
		s.replace(s.charAt(j), temp);
		reverseString(s, i+1, j-1);
		}
	}
	public static boolean isPalindrome(String s, int i, int j) {
		if (i >= j) return true;
		if(s.charAt(i) != s.charAt(j))
			return false;
		else
			return isPalindrome(s, i+1, j-1);
	}
	public static void moveArray(int [] a, int i, int j) {
		if (i > j)return;
		if (a[i]%2 != 0 && a[j]%2==0) {
			moveArray(a,i+1,j-1);
		}
		if (a[i]%2 != 0 && a[j]%2!=0) {
			moveArray(a,i+1,j);
		}
		if (a[i]%2==0 && a[j]%2==0) {
			int temp = i;
			while (a[temp]%2==0 && temp < a.length)
				temp++;
			int temp2 = a[i];
			a[i]=a[temp];
			a[temp]= a[temp2];
			moveArray(a, i, j);
		}
		if (a[i]%2==0 && a[j]%2!=0) {
			int temp = a[i];
			a[i]= a[j];
			a[j] = temp;
			moveArray(a,i+1,j-1);
		}
	}
	public static int returnMax(int[] a, int i) {
		if (i==0) return a[0];
		
		return Math.max(returnMax(a, i-1), a[i]);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,66,-1,10,23,33};
		
		//afunction(a);
		System.out.println(recursionFactorial(4));
		System.out.println(linearSum(a, a.length));
		//reverse(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		String s = "laiygaljh";
		reverseString(s, 0, 8);
		String palindrome = "fuckerrekcuf";
		System.out.println(isPalindrome(palindrome, 0, palindrome.length()-1));
		moveArray(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		System.out.println(returnMax(a, 8));
		
	}

}
