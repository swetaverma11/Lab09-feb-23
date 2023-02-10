package string.array.project;

public class Project2 {

	public static void main(String[] args) {
		/*write a method takes a String[] as argument and return a string containing 
		 * the concatenation of all the strings in the input array.Invoke your method 
		 * 3 times with different arguments.Make sure that your code handles
		 *  the cases where the arguments is null.
		 */
		String str[]= {"sweta","kumari","verma"};
		System.out.println("Before concatenation: ");
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("\nAfter concatenation:");
		String mystr = concatenation(str);
		System.out.println(mystr);

	}

	static String concatenation(String arr[] ) {
		String str = arr[0].concat(arr[1].concat(arr[2]));
		return str;
	}

}
