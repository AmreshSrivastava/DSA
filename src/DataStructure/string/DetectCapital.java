package DataStructure.string;

import java.util.Scanner;

public class DetectCapital {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Word");
			
			String cn = sc.next();
			System.out.println(cn);
			
			if(cn == cn.toUpperCase()) {
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}

}
