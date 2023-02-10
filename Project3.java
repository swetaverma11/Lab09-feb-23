/*Qn.3.Create an Two arrays.One containing string vlaues:Peter, Amy, Jhon, Boyd and Cathy,
 * and another one containing int values:15,9,14,10 and 12. create an
 *  table showing these value pairs as below.
 *  Name         Value 				
   Amy             15
   Jhon            9
   Boyd            14
   Cathy           10
   Peter           12 
 */

package string.array.project;

public class Project3 {

	public static void main(String[] args) {
		String str[] = {"Amy","Boyd","Cathy","Jhon","Peter",};
		int arr[]= {15,9,14,10 ,12};
		System.out.println("Name\tValue");
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i] +"\t"+arr[i]);
		}

	}

}
