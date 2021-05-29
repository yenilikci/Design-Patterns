
public class TelefonBayi {

	public static void main(String[] args) {

		Telefon s8 = TelefonFabrikasi.getTelefon("S8", "2600mah", 4, 7);
		Telefon note8 = TelefonFabrikasi.getTelefon("Note8", "3000mah", 5, 8);
		System.out.println("S8 icin telefon ozellikleri: ");
		System.out.println(s8);
		System.out.println("Note8 icin telefon ozellikleri: ");
		System.out.println(note8);
	}

}
