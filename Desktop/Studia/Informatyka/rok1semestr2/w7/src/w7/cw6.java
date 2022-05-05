package w7;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class cw6 {

	public static void main(String[] args) {
		Set<String> kwiaty = new HashSet<String>();
		kwiaty.add("tulipan");
		kwiaty.add("snieznik");
		kwiaty.add("mleczarz");
		kwiaty.add("roza");
		kwiaty.add("sasanka");
		System.out.println(kwiaty);
		Scanner skan = new Scanner(System.in);
		System.out.print("Wprowadz nazwe kwiatu: ");
		String input = skan.nextLine();
		System.out.println("Czy zbior zawiera nazwe kwiatu: " + input + "? " + kwiaty.contains(input));
		skan.close();
	}

}
