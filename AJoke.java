import java.io.*;
import java.util.*;

public class AJoke {

	public static void main(String[] args) {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> map = new HashMap<>();

		String in = sc.next();

		int count = 0;
		for (int i = 0; i < 6; i++) {
			char ch = in.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}

		for (int v : map.values())
			if (v > 1)
				count++;

		if (count >= 2)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
