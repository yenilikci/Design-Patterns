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
