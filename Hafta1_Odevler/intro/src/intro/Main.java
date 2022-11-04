package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "vade süresi";

		System.out.println(ortaMetin);

		int vade = 12; // Tam sayý için kullanýlýr
		Double dolarDün = 12.23; // Double ondalýklý için kullanýlýr
		Double dolarBugün = 12.33;

		boolean dolarDüþtüMü = false; // Þartlý döngü ifelse(giriþ yapýnca buton kaybolur gibi)

		String okYönü = "";

		if (dolarBugün < dolarDün) { // true

			okYönü = "down.svg";
			System.out.println(okYönü);

		} else if (dolarBugün > dolarDün) {
			okYönü = "up.svg";
			System.out.println(okYönü);

		}

		else {
			okYönü = "equal.svg";
			System.out.println(okYönü);

		}

		// array (liste yapmak için kullanýlýr)
		String[] krediler = { "hangi kredi", "hýzlý kredi", "emeklilik" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}

	}

}
