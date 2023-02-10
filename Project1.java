/*Qn.1.Write a method that takes a string and returns a string of the same length
 * containing the 'x'character in all position except the last 4 positions.
 * The characters in last 4 positions must be the same as in the original
 * string.for example,if the argument is "12345678",the return value should be"xxxx5678".
 * 
 */

package string.array.project;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Contct number");
		String num = sc.nextLine();
		String ret = myString(num);
		System.out.println("your number is :"+ ret);
		sc.close();
	}
	static String myString(String Pass) {
		char[] ch = Pass.toCharArray();
		for(int i=0; i<Pass.length()-4;i++) {
			ch[i] = 'x';
			
		}
		Pass = String.valueOf(ch);
		return Pass;
		
		
	}
}
