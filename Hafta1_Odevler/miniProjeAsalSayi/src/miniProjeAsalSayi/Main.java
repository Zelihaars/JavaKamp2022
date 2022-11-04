package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		int number = 2;
		int remainder = number % 2;
		//System.out.println(remainder);

		boolean isPrime = true;

		
		if (number==1) {
			System.out.println("Asal sayý deðildir");
			return;
		}
		
		
		
		if (number<1) {
			System.out.println("geçersiz sayý");
		}
		
		
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				isPrime = false;

			}

		}
		if (isPrime) {

			System.out.println("Asal sayýdýr");

		} else {

			System.out.println("Asal sayý deðildir");
		}
	}

}
