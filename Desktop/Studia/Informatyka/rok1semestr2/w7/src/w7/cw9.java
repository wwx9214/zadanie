package w7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cw9 {

	public static void main(String[] args) {
		Map<String, String> slang = new HashMap<String, String>();
		slang.put("omg", "oh my god / o moj boze");
		slang.put("zw", "zaraz wracam");
		slang.put("tzn", "to znaczy");
		slang.put("nwm", "nie wiem");
		slang.put("sznio", "gniok");
		Scanner skan = new Scanner(System.in);
		System.out.print("Wprowadz skrot: ");
		String input = skan.nextLine();
		System.out.print("\nTlumaczenie skrotu " + input + ": " + slang.get(input));
		
		skan.close();
	}

}