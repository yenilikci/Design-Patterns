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
