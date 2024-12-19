# Kütüphane Otomasyon Sistemi

Bu kütüphane otomasyon sistemi, öğrencilerin kütüphane işlemlerini kolaylaştırmak amacıyla tasarlanmış bir web uygulamasıdır.

## Özellikler

### Öğrenci Paneli

- **Kitap Arama ve Filtreleme:** Kullanıcılar kitapları adına, yazarına, konusuna göre arayabilir ve mevcut duruma göre filtreleyebilir.
- **Kitap Ödünç Alma ve İade Etme:** Öğrenciler, istedikleri kitapları ödünç alabilir ve sonra iade edebilirler.
- **Mevcut Durum Kontrolü:** Kitapların mevcut durumunu (rafta, ödünç, alındı, kayıp vb.) kontrol edebilirler.

### Admin Paneli

- **Kütüphane Yönetimi:** Yöneticiler, kütüphane envanterini düzenleyebilir, yeni kitaplar ekleyebilir, mevcut kitapları güncelleyebilir ve gerektiğinde kitapları kaldırabilir.


## Gereksinimler

- [Java SDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- [NetBeans IDE](https://netbeans.apache.org/download/index.html)

## Kurulum ve Çalıştırma

1. Java SDK'yi [buradan](https://www.oracle.com/java/technologies/javase-downloads.html) indirin ve yükleyin.
2. NetBeans IDE'yi [buradan](https://netbeans.apache.org/download/index.html) indirin ve yükleyin.
3. Projeyi [buradan](https://github.com/kullanici/kutuphane-otomasyonu.git) klonlayın.
4. NetBeans IDE'yi açın.
5. "File" menüsünden "Open Project" seçeneğine gidin ve projenizin bulunduğu dizini seçin.
6. Projeyi açtıktan sonra, projenin ana sınıfını (main class) bulun ve çalıştırın.
7. Tarayıcınızda http://localhost:8080 adresine giderek kütüphane otomasyon sistemini kullanmaya başlayın.

## Kullanım

- Kitap adına göre arama yapmak için "Arama" kutusunu kullanın.
- Kitapları aramak için 'Arama' kutusunu kullanabilir ve bu kutu otomatik olarak mevcut duruma göre filtreleme işlemi yapar.

## Kullanıcı Yetkilendirmesi

- Kütüphane sistemi, öğrenci ve admin olarak iki farklı kullanıcı türü içerir. Admin, kütüphane envanterini yönetme yetkisine sahiptir.

