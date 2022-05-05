package w7;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class cw7 {

	public static void main(String[] args) {
		Set<String> ubior = new HashSet<String>();
		Scanner skan = new Scanner(System.in);
		System.out.println("Podaj 5 nazw ubran: ");
		String a = skan.nextLine();
		ubior.add(a);
		String b = skan.nextLine();
		ubior.add(b);
		String c = skan.nextLine();
		ubior.add(c);
		String d = skan.nextLine();
		ubior.add(d);
		String e = skan.nextLine();
		ubior.add(e);
		
		System.out.println(ubior);
		skan.close();
	}

}
