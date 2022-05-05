package w7;

import java.util.LinkedList;
import java.util.Scanner;

public class cw5 {

	public static void main(String[] args) {
		LinkedList <String> muzyka = new LinkedList<String>();
		Scanner skan = new Scanner(System.in);
		String tytul = skan.nextLine();
		String artysta = skan.nextLine();
		String gatunek = skan.nextLine();
		muzyka.add(tytul);
		muzyka.add(artysta);
		muzyka.add(gatunek);
		System.out.println("Wprowadzone dane:");
		System.out.println(muzyka);
        skan.close();

	}

}
