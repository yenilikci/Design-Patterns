
public class S8Fabrikasi implements TelefonFabrikasi {

	@Override
	public Telefon getTelefon(String model, String batarya, int en, int boy) {
		return new S8(model, batarya, en, boy);
	}

}
