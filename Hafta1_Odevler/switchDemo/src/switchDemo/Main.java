package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'C';

		switch (grade) {

		case 'A':

			System.out.println("Mükemmel: gectiniz"); // oto düzen için Ctrl+shift+F
			break;

		case 'B':

		case 'C':

			System.out.println("iyi : gectiniz");
			break;

		case 'D':
			System.out.println("fena degil: gectiniz");
			break;

		case 'F':

			System.out.println("Maalesef Kaldýnýz");
			break;

		default:

			System.out.println("Gecersiz not girdiniz");

		}

	}

}
