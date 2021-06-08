public class EmlakciV2 {

	public static void main(String[] args) {
		
		Ev ev1 = EvBuilder.startNormalEvBuild("�stanbul","�mraniye","Tatl�su",2008,3)
		.setHasCocukParki(true)
		.setHasOtopark(true)
		.build();
		
		Ev ev2 = EvBuilder.startHavuzluEvBuild("�stanbul","Ata�ehir","Atat�rk",2010,4)
		.setHasCocukParki(true)
		.setHasOtopark(true)
		.build();
		
		printEv(ev1);
		
		printEv(ev2);
		
	}
	
	private static void printEv(Ev ev) {
		System.out.println();
		System.out.println("Ev eklendi -> " + ev);
		System.out.println();
	}
	
}
