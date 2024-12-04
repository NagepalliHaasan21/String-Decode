//package com.tap.project;
//
//import java.util.Scanner;
//
//public class Calculator 
//{
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Welcome to Simple Calculator!");
//		System.out.println("Select a Specific Operation to perform Calculation : ");
//		System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Modulus\n 6.Exit");
//		int n=scan.nextInt();
//		System.out.print("The result after performing the operation is : "+calculatorOperations(n));
//
//	}
//	public static int calculatorOperations(int n) {
//		Scanner scan=new Scanner(System.in);
//		switch(n) {
//		case 1:
//			System.out.println("Enter the 1st Number : ");
//			int n1=scan.nextInt();
//			System.out.println("Enter the 2nd Number : ");
//			int n2=scan.nextInt();
//			return n1+n2;
//		case 2:
//			System.out.println("Enter the 1st Number : ");
//			int n3=scan.nextInt();
//			System.out.println("Enter the 2nd Number : ");
//			int n4=scan.nextInt();
//			return n3-n4;
//		case 3:
//			System.out.println("Enter the 1st Number : ");
//			int n5=scan.nextInt();
//			System.out.println("Enter the 2nd Number : ");
//			int n6=scan.nextInt();
//			return n5*n6;
//		case 4:
//			System.out.println("Enter the 1st Number : ");
//			int n7=scan.nextInt();
//			System.out.println("Enter the 2nd Number : ");
//			int n8=scan.nextInt();
//			return n7/n8;
//		case 5:
//			System.out.println("Enter the 1st Number : ");
//			int n9=scan.nextInt();
//			System.out.println("Enter the 2nd Number : ");
//			int n10=scan.nextInt();
//			return n9%n10;
//		case 6:
//			break;
//		default:
//			System.out.println("Invalid Input");
//			return 0;
//		}
//		scan.close();
//		return 0;
//	}
//}

//
//package com.tap.project;
//
//import java.util.Scanner;
//
//public class PatternProgram {
//
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		patternProgram(n);
//		scan.close();
//	}
//	public static void patternProgram(int n) {
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				if(j==1 || (i==1 && j<=n) || (i==(n/2) + 1 && j<=n) || (j==n && i>1 && i<=(n/2) + 1)) {
//				System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//
//	}
//	
//}

//package com.tap.project;
//
//import java.util.Scanner;
//
//public class ValidationParenthesis {
//
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		String s=scan.next();
//		System.out.print(validParenthesis(s));
//		}
//	public static String validParenthesis(String s) {
//		if(s.length()<2) {
//			return "Invalid Parenthesis";
//		}
//		int i=0,j=s.length()-1;
//		while(i<j) {
//			if(s.charAt(i)=='[' && s.charAt(j)==']') {
//				i++;
//				j--;
//			}
//			else if(s.charAt(i)=='{' && s.charAt(j)=='}') {
//				i++;
//				j--;
//			}
//			else if(s.charAt(i)=='(' && s.charAt(j)==')') {
//				i++;
//				j--;
//			}
//			else {
//				return "Invalid Parenthesis";
//			}
//		}
//		return "Valid Parenthesis";
//	}
//
//}


package com.tap.project;

import java.util.Scanner;

public class DecodeString2 {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		String s=scan.next();
//		String[] arr=s.split("");
//		System.out.print(decodeString(arr));
//		scan.close();
//	}
//	public static String decodeString(String[] arr) {
//		StringBuilder sb=new StringBuilder();
//		
//		int count=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			count++;
//			if(count==2 && i>0) {
//				sb.append(arr[i]+",");
//				count=0;
//			}
//			else {
//				sb.append(arr[i]);
//			}
//			
//		}
//		return sb.reverse().toString();
//	}
//		
//		Scanner scan=new Scanner(System.in);
//		String s=scan.next();
//		System.out.print(decodeString(s));
//		scan.close();
//	}
//	public static String decodeString(String s) {
//		String t="";
//		int i=0;
//		while(i<s.length()) {
//			int count=0;
//			while(i<s.length() && s.charAt(i)=='1') {
//				count++;
//				i++;
//			}
//			if(i<s.length() && s.charAt(i)=='0') {
//					i++;
//			}
//			if(count>=1 && count<=26) {
//				char ch=(char)(65+count-1);
//				t=t+ch;
//			}
//		}
//		return t;
//		
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		for(int i=0;i<n;i++) {
//			System.out.print(fib(i)+" ");
//		}
//	}
//	
//	public static int fib(int n) {
//		if(n<=1) {
//			return n;
//		}
//		return fib(n-1)+fib(n-2);
	}

}