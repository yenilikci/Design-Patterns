# Design-Patterns (Tasarım Kalıpları)

Birçok farklı durumda kullanılabilecek bir sorunun nasıl çözüleceğine dair açıklamalar ve şablonlardır yani genel sorunların çözümüdür.

## Creational Design Patterns (Oluşturucu Tasarım Kalıpları)

Nesnenin oluşturulması ile ilgili tasarım kalıplarıdır.

### Singleton Design Pattern
- Singleton Desing Pattern bir Creational Design Patterndır. 
- Singleton'ın kelime anlamı tekil demektir.
- İlgili nesneden bir tane oluşturulmak isteniyorsa Singleton Design Pattern kullanılabilir.
- Sınıf nesnesinin somutlaştırılmasına gerek yoktur, bu static keyword ile sağlanır.

#### Singleton Uygulama
```java
for (int i = 0; i < 10; i++) {
    Singleton singleton = Singleton.getSingleton();
}
```
Sayı artmaya devam etse dahi kurucu bir kere oluşturulur.

Kullanılmasını beklemeden, sınıflar oluşturulurken yapılan bu yükleme işlemine **Eager Loading** denir.
Fakat bu kullanım tarzı daha sonrasında bazı problemlerin oluşmasına neden olabilir.

Eğer nesneyi ihtiyaç duyduğumuz anda oluşturursak ve o ilk nesneyi kullanmaya devam edersek buna **Lazy Loading** denir.
Nesneyi ihtiyaç duyulmasından kastımız yazdığımız getSingleton() metodunun çağırılması.

Burada ilk önce tanımlanan nesnenin null olup olmadığı kontrol edilmeli eğer null ise nesne oluşturma işlemi gerçekleştirilmeli.

```java
public class Singleton {

	private static Singleton singleton;

	private static int sayi = 0;

	private Singleton() {
		System.out.println("Ben oluştum");
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
		    singleton = new Singleton();
		}
		sayi++;
		System.out.println(sayi);
		return singleton;
	}
}
```
Tek threadli ortam için bu işimizi görse de multi-threaded bir ortamda çalışılıyorsa ve aynı anda getSingleton() metodu çağırılıyorsa bir açığa sebebiyet vermiş oluruz.
Lazy Loading ile ortaya çıkabilecek bu açığı kapatalım.

```java
synchronized (Singleton.class) {
	if (singleton == null) {
		singleton = new Singleton();
	}	
}
```
Şu anda synchronized ile bu açığın önüne geçsekte metodun çalışmasını yavaşlattık. synchronized anahtar kelimesi ile karşılaşan yerlerde threadler kuyruğa girerler.
Bizler synchronized'a nesnenin ilk oluşumu esnasında ihtiyaç duyuyoruz. Bir if kontrolü daha ekleyerek singleton boş mu? (daha önce oluşturulmuş mu) kontrolünü sağlarsak synchronized'ın programı yorma sorununu da minimalize etmiş oluruz.

```java
if (singleton == null) {
	synchronized (Singleton.class) {
		if (singleton == null) {
			singleton = new Singleton();
		}
	}
}
```
Bu iki kere null kontrolünün sağlandığı tasarım kalıbına **Double Checked Locking** denir. Böylelikle hem **Lazy Loading** yapmış olduk hem de **Thread Safe** çalışmış olduk. 

### Factory Design Pattern
Birbirine benzeyen sınıflar ile bir fabrika sınıf içerisinde nesne oluşturma çağrılarını gerçekleştirme mantığını esas alır.

Bir arayüz ile kullanacağımız sınıfları kümeleriz örn: **Telefon** arayüzü. Telefonlarımız da **S8** ve **Note8** olsun bunlar için birer sınıf oluşturacak olursak (benzerliği sağlamak için ve her ikiside birer telefon olduğu için) **Telefon** arayüzünü implemente ederiz. 

Program içerisinde herhangi bir yerde new'lemek yerine ise **TelefonFabrikasi** sınıfında dönüş tipi arayüz ile aynı olan static bir fonksiyon içerisinde gelecek olan telefon tipine göre nesne çağrılarını gerçekleştiririz.

```java
public class TelefonFabrikasi {

	public static Telefon getTelefon(String model, String batarya, int en, int boy) {

		Telefon telefon;
		if ("S8".equalsIgnoreCase(model)) {
			telefon = new S8(model, batarya, en, boy);
		} else if ("Note8".contentEquals(model)) {
			telefon = new Note8(model, batarya, en, boy);
		} else {
			throw new RuntimeException("Gecerli bir model degildir");
		}
		return telefon;

	}

}
```

Burada telefon tiplerine göre ayrı nesne çağrılarını gerçekleştirebilmek için if else yapılarından yararlandık, bu da ileride yeni sınıflar (telefonlar/telefon modelleri) eklendiğinde bir bağımlılık durumu ve karmaşaya sebep olacaktır.

###  Abstract Factory Design Pattern

Factory deseninde TelefonFabrikasi adında bir sınıf oluşturmuştuk. Model bilgisine göre S8 veya Note8 telefonlarını üretiyorduk. Fakat yüzlerce model olabileceği için yüzlerce if else yazıldığında kodun karmaşık bir hale geleceğinden bahsetmiştik.

Biz bu tasarım deseninde telefon fabrikasını arayüz olarak tanımlayıp S8Fabrikasi ve Note8Fabrikası olmak üzere ayrı fabrikalara ayırırız. S8Fabrikası sadece S8, Note8Fabrikasi ise sadece Note8 üretir. Bayiler ise S8 istediğinde S8  fabrikasından, Note8 istediklerinde Note8 fabrikasından istek yaparlar. Böylelikle karmaşıklıktan arındırılmış olur.


```java
public class TelefonBayi {

	public static void main(String[] args) {

		S8Fabrikasi s8Fabrikasi = new S8Fabrikasi();
		Telefon s8 = s8Fabrikasi.getTelefon("S8", "2600mah", 4, 7);

		Note8Fabrikasi note8Fabrikasi = new Note8Fabrikasi();
		Telefon note8 = note8Fabrikasi.getTelefon("Note8", "3000mah", 5, 8);

		System.out.println(s8);
		System.out.println(note8);

	}
}
```
