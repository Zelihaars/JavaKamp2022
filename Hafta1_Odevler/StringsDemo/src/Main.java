
public class Main {

	public static void main(String[] args) {

		String message = "Bugün hava çok güzel";

		System.out.println(message);

		System.out.println("Eleman sayısı :" + message.length()); // Eleman sayısını göstermek için
		System.out.println("5.eleman:" + message.charAt(4)); // Elemanlardan birini göstermek için
		System.out.println(message.concat(" Yaşasın!")); // Mesaj ile birleştirmek için
		System.out.println(message);
		System.out.println(message.startsWith("B")); // Başlangıcı gösterir
		System.out.println(message.endsWith(".")); // sonu gösterir

		char[] karakterler = new char[5];
		message.getChars(0, 4, karakterler, 0);

		System.out.println(karakterler);
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("e"));

		System.out.println(message.replace(' ', '-')); // Yer değiştirmek spaceyi çıkar tireyi koy
		System.out.println(message.substring(2, 4)); // metnin içinden parça almak

		for (String kelime : message.split(" ")) { // kelime kelime ayırmak için(çok kullanılır!)
			System.out.println(kelime);

		}

		System.out.println(message.toLowerCase()); // hepsini küçük yazmak için
		System.out.println(message.toUpperCase()); // hepsini büyük yazmak için
		System.out.println(message.trim());

	}

}
