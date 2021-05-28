public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getSingleton() {
		return singleton;
	}

}
