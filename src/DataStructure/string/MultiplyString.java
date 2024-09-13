package DataStructure.string;

public class MultiplyString {

	public static void main(String[] args) {
		
		String num1 = "2";
		String num2 = "3";
		
		//convert string to integer
		int i = Integer.parseInt(num1);
		int j = Integer.parseInt(num2);
		
		int k = i * j;
		  //convert integer to string
		System.out.println(String.valueOf(k));

		
	}

}
//Given two non-negative integers num1 and num2 represented as strings, return the
//product of num1 and num2, also represented as a string.
//
//Note: You must not use any built-in BigInteger library or convert the inputs to 
//integer directly.
//
// 
//
//Example 1:
//
//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//
//Input: num1 = "123", num2 = "456"
//Output: "56088"