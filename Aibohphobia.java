import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Aibohphobia {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);

		String q = sc.nextLine();
		int l = 0;
		int r = q.length() - 1;
		int ans = 0;
		while (l < r) {
			if (q.charAt(l) != q.charAt(r)) {
				ans++;
			}
			l++;
			r--;
		}
		System.out.println(ans);
	}
}
