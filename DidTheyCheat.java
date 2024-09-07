import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DidTheyCheat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		if (a.length() == b.length() && (a.concat(a).contains(b))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
