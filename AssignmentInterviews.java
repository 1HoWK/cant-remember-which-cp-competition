import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AssignmentInterviews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// number of students
		int n = scan.nextInt();
		// number of buses
		int b = scan.nextInt();
		// can hold how many students
		int m = scan.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		//[1, 1, 3, 4, 10, 14]
				
		int biggest = 0;
		int difference = 0;
		for(int i = 0; i < (array.length+1);i++) {
			difference = array[i+1]-array[i];
			if (difference > biggest) {
				biggest = difference;
			}
			
		}
		
		//What is the smallest possible value of the largest wait time for an student?
		System.out.println(biggest);

	}

}
