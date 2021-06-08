public class Emlakci {
	
	public static void main(String[] args) {
	
		Ev ev1 = new Ev();
		ev1.setIl("�stanbul");
		ev1.setIlce("Ata�ehir");
		ev1.setMahalle("Atat�rk");
		ev1.setOdaSayisi(3);
		ev1.setBinaYili(2010);
		ev1.setHasKlima(true);

		Ev ev2 = new Ev("�stanbul", "�mraniye", "Tatl�su", 2008, 2, 3, 2, 0, false, false, true, true, true, false);
		
		printEv(ev1);
		printEv(ev2);
		
	}
	
	
	private static void printEv(Ev ev) {
		System.out.println();
		System.out.println("Ev eklendi -> " + ev);
		System.out.println();
	}
	
}
