package w7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cw2 {

	public static void main(String[] args) {
		List <String> listaPracownikow = new ArrayList<String>();
		Scanner skan = new Scanner(System.in);
		String imie = skan.nextLine();
		String nazwisko = skan.nextLine();
		int lata = skan.nextInt();
		String lataS = Integer.toString(lata);
		String koncowka;
		if(lata == 1)
		{
			koncowka = " rok";
		}
		else if (lata > 1 && lata < 5)
		{
			koncowka = " lata";
		}
		else koncowka = " lat";
		
		listaPracownikow.add(imie);
		listaPracownikow.add(nazwisko);
		listaPracownikow.add(lataS + koncowka);
		System.out.println("Wprowadzone dane:");
		System.out.println(listaPracownikow);
        skan.close();
	}

}
