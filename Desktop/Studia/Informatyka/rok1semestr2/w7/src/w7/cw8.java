package w7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cw8 {

	public static void main(String[] args) {
		Map<String, String> slownik = new HashMap<String, String>();
		slownik.put("bed", "lozko");
		slownik.put("fork", "widelec");
		slownik.put("car", "samochod");
		slownik.put("sword", "miecz");
		slownik.put("house", "dom");
		Scanner skan = new Scanner(System.in);
		System.out.print("Wprowadz slowo, ktore ma zostac przetlumaczone: ");
		String input = skan.nextLine();
		System.out.print("\nPolski odpowiednik slowa " + input + ": " + slownik.get(input));
		
		skan.close();
	}

}
