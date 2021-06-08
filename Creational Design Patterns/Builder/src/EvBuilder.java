public class EvBuilder {

	// Ev sýnýfý ile ayný alanlara sahip
	private String il;
	private String ilce;
	private String mahalle;

	private int binaYili;
	private int odaSayisi;
	private int banyoSayisi;
	private int tuvaletSayisi;
	private int balkonSayisi;

	private boolean isDubleks;
	private boolean isEsyali;
	private boolean hasOtopark;
	private boolean hasCocukParki;
	private boolean hasKlima;
	private boolean hasHavuz;

	//geçilen parametreler zorunlu alanlar
	public static EvBuilder startNormalEvBuild(String il,String ilce,String mahalle,int binaYili,int odaSayisi) {
		EvBuilder evBuilder = new EvBuilder();
		evBuilder.il = il;
		evBuilder.ilce = ilce;
		evBuilder.mahalle = mahalle;
		evBuilder.binaYili = binaYili;
		evBuilder.odaSayisi = odaSayisi;
		return evBuilder;
	}
	
	public static EvBuilder startHavuzluEvBuild(String il,String ilce,String mahalle,int binaYili,int odaSayisi) {
		EvBuilder evBuilder = new EvBuilder();
		evBuilder.il = il;
		evBuilder.ilce = ilce;
		evBuilder.mahalle = mahalle;
		evBuilder.binaYili = binaYili;
		evBuilder.hasHavuz = true;
		return evBuilder;
	}

	public Ev build() {
		Ev ev = new Ev();
		ev.setIl(il);
		ev.setIlce(ilce);
		ev.setMahalle(mahalle);
		ev.setBinaYili(binaYili);
		ev.setBalkonSayisi(balkonSayisi);
		ev.setOdaSayisi(odaSayisi);
		ev.setBanyoSayisi(banyoSayisi);
		ev.setTuvaletSayisi(tuvaletSayisi);
		ev.setDubleks(isDubleks);
		ev.setEsyali(isEsyali);
		ev.setHasOtopark(hasOtopark);
		ev.setHasCocukParki(hasCocukParki);
		ev.setHasKlima(hasKlima);
		ev.setHasHavuz(hasHavuz);

		return ev;
	}

	public int getBanyoSayisi() {
		return banyoSayisi;
	}

	public EvBuilder setBanyoSayisi(int banyoSayisi) {
		this.banyoSayisi = banyoSayisi;
		return this;
	}

	public int getTuvaletSayisi() {
		return tuvaletSayisi;
	}

	public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
		this.tuvaletSayisi = tuvaletSayisi;
		return this;
	}

	public int getBalkonSayisi() {
		return balkonSayisi;
	}

	public EvBuilder setBalkonSayisi(int balkonSayisi) {
		this.balkonSayisi = balkonSayisi;
		return this;
	}

	public boolean isDubleks() {
		return isDubleks;
	}

	public EvBuilder setDubleks(boolean isDubleks) {
		this.isDubleks = isDubleks;
		return this;
	}

	public boolean isEsyali() {
		return isEsyali;
	}

	public EvBuilder setEsyali(boolean isEsyali) {
		this.isEsyali = isEsyali;
		return this;
	}

	public boolean isHasOtopark() {
		return hasOtopark;
	}

	public EvBuilder setHasOtopark(boolean hasOtopark) {
		this.hasOtopark = hasOtopark;
		return this;
	}

	public boolean isHasCocukParki() {
		return hasCocukParki;
	}

	public EvBuilder setHasCocukParki(boolean hasCocukParki) {
		this.hasCocukParki = hasCocukParki;
		return this;
	}

	public boolean isHasKlima() {
		return hasKlima;
	}

	public EvBuilder setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
		return this;
	}

	public boolean isHasHavuz() {
		return hasHavuz;
	}

	public EvBuilder setHasHavuz(boolean hasHavuz) {
		this.hasHavuz = hasHavuz;
		return this;
	}

}
