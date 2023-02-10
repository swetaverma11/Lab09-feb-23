package string.array.project;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		getString();
		
		static void getString() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String:");
			String str = sc.nextLine();
			int count=0;
			for(int i=0; i<str.length();i++) 
			{
				count =0;
				for(int c=0; c<str.length();c++) 
				{
					count++;	
				}
				
			}if(count == 2) {
				System.out.println("Duplicate Charcter:"+ str.charAt(i));
			}
		}
	}
}


