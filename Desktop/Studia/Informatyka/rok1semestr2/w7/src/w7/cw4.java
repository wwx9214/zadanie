package w7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cw4 {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		List <String> Filmy = new ArrayList<String>();
		String tytul = skan.nextLine();
		int rok = skan.nextInt();
		String rokS = Integer.toString(rok);
		
		Filmy.add(tytul);
		Filmy.add(rokS + "r");
		System.out.println("Wprowadzone dane:");
		System.out.println(Filmy);
        skan.close();
	}

}

