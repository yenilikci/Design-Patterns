public class Singleton {

	private static Singleton singleton = new Singleton();

	private static int sayi = 0;

	private Singleton() {
		System.out.println("Ben olu�tum");
	}

	public static Singleton getSingleton() {
		sayi++;
		System.out.println(sayi);
		return singleton;
	}

}
