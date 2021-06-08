public class Ev {

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

	public Ev() {

	}

	public Ev(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi, int tuvaletSayisi,
			int balkonSayisi, boolean isDubleks, boolean isEsyali, boolean hasOtopark, boolean hasCocukParki,
			boolean hasKlima, boolean hasHavuz) {
		super();
		this.il = il;
		this.ilce = ilce;
		this.mahalle = mahalle;
		this.binaYili = binaYili;
		this.odaSayisi = odaSayisi;
		this.banyoSayisi = banyoSayisi;
		this.tuvaletSayisi = tuvaletSayisi;
		this.balkonSayisi = balkonSayisi;
		this.isDubleks = isDubleks;
		this.isEsyali = isEsyali;
		this.hasOtopark = hasOtopark;
		this.hasCocukParki = hasCocukParki;
		this.hasKlima = hasKlima;
		this.hasHavuz = hasHavuz;
	}

	@Override
	public String toString() {
		return "Ev [il=" + il + ", ilce=" + ilce + ", mahalle=" + mahalle + ", binaYili=" + binaYili + ", odaSayisi="
				+ odaSayisi + ", banyoSayisi=" + banyoSayisi + ", tuvaletSayisi=" + tuvaletSayisi + ", balkonSayisi="
				+ balkonSayisi + ", isDubleks=" + isDubleks + ", isEsyali=" + isEsyali + ", hasOtopark=" + hasOtopark
				+ ", hasCocukParki=" + hasCocukParki + ", hasKlima=" + hasKlima + ", hasHavuz=" + hasHavuz + "]";
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public int getBinaYili() {
		return binaYili;
	}

	public void setBinaYili(int binaYili) {
		this.binaYili = binaYili;
	}

	public int getOdaSayisi() {
		return odaSayisi;
	}

	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}

	public int getBanyoSayisi() {
		return banyoSayisi;
	}

	public void setBanyoSayisi(int banyoSayisi) {
		this.banyoSayisi = banyoSayisi;
	}

	public int getTuvaletSayisi() {
		return tuvaletSayisi;
	}

	public void setTuvaletSayisi(int tuvaletSayisi) {
		this.tuvaletSayisi = tuvaletSayisi;
	}

	public int getBalkonSayisi() {
		return balkonSayisi;
	}

	public void setBalkonSayisi(int balkonSayisi) {
		this.balkonSayisi = balkonSayisi;
	}

	public boolean isDubleks() {
		return isDubleks;
	}

	public void setDubleks(boolean isDubleks) {
		this.isDubleks = isDubleks;
	}

	public boolean isEsyali() {
		return isEsyali;
	}

	public void setEsyali(boolean isEsyali) {
		this.isEsyali = isEsyali;
	}

	public boolean isHasOtopark() {
		return hasOtopark;
	}

	public void setHasOtopark(boolean hasOtopark) {
		this.hasOtopark = hasOtopark;
	}

	public boolean isHasCocukParki() {
		return hasCocukParki;
	}

	public void setHasCocukParki(boolean hasCocukParki) {
		this.hasCocukParki = hasCocukParki;
	}

	public boolean isHasKlima() {
		return hasKlima;
	}

	public void setHasKlima(boolean hasKlima) {
		this.hasKlima = hasKlima;
	}

	public boolean isHasHavuz() {
		return hasHavuz;
	}

	public void setHasHavuz(boolean hasHavuz) {
		this.hasHavuz = hasHavuz;
	}

}
