package recapDemo1;

public class Main {

	public static void main(String[] args) {

		int sayı1 = 266;
		int sayı2 = 25;
		int sayı3 = 26;
		int enBuyuk = sayı1;

		if (enBuyuk < sayı2) {

			enBuyuk = sayı2;

		}

		if (enBuyuk < sayı3) {

			enBuyuk = sayı3;

		}

		System.out.println("en Büyük =" + enBuyuk);

	}

}
