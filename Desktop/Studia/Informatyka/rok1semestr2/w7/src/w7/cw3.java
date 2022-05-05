package w7;

import java.util.LinkedList;
import java.util.Scanner;

public class cw3 {

	public static void main(String[] args) {
		LinkedList <String> zakupy = new LinkedList<String>();
		Scanner skan = new Scanner(System.in);
		String produkt = skan.nextLine();
		int ilosc = skan.nextInt();
		int cena = skan.nextInt();
		String iloscS = Integer.toString(ilosc);
		String cenaS = Integer.toString(cena);
		zakupy.add(produkt);
		zakupy.add(iloscS + "szt");
		zakupy.add(cenaS + "zl");
		System.out.println("Wprowadzone dane:");
		System.out.println(zakupy);
        
        skan.close();

	}

}
