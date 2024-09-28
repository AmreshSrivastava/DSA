package DataStructure.string.easy;

import java.util.Scanner;

public class ColumnNumber {

	public static void main(String[] args) {
		
		String s = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			
			int cn = sc.nextInt();
			 System.out.println(cn);
			 
			for(int i=0;i<=s.length()-1;i++) {
			  if(cn == s.indexOf(cn)) {
				  System.out.println(s.charAt(cn));
			  }
			  else
			  {
				  System.out.println("Not Found");
			  }
			
			}
		}

  }
}

//it return alphabetical chain.
//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//
//For example: input 1 return A
//
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28 
