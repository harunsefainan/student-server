<div align="center">
<h1>Student Server</h1>


![GitHub Issues](https://img.shields.io/github/issues/harunsefainan/student-server)
![GitHub License](https://img.shields.io/github/license/harunsefainan/student-server)
![GitHub Pull Requests](https://img.shields.io/github/issues-pr/harunsefainan/student-server)
![GitHub Forks](https://img.shields.io/github/forks/harunsefainan/student-server)
![GitHub Stars](https://img.shields.io/github/stars/harunsefainan/student-server)

| [İngilizce](../README.md) | [Türkçe](README_TR.md) |

<a href="https://github.com/harunsefainan/student-server/tree/master/docs"><strong> Daha fazla belgeye göz
atın »</strong></a>
</div>

## Proje Genel Bakışı

Bu proje, öğrenci kayıtlarını saklamak, yönetmek ve sunmak için bir web tabanlı bilgi yönetimi uygulamasını kapsar.
Öğrenci adları, soyadları, kimlik numaraları, doğum tarihleri, kayıt tarihleri ve kurs süreleri gibi öğrenci bilgileri
için bir veritabanı yönetim sistemi içerir. Ayrıca, her öğrencinin sisteme kayıt zamanını otomatik olarak takip eder.

Proje, Java teknolojileri olan Spring Boot ve Hibernate kullanılarak geliştirilmiştir. Kod tekrarlarını azaltmak ve daha
okunabilir bir yapı oluşturmak için Lombok kütüphanesi kullanılmıştır. JpaRepository, veritabanı işlemleri için
kullanılmıştır.

Proje, öğrenci verilerini listeleme, öğrenci OID'sine göre arama, yeni öğrenci ekleme, mevcut öğrenci bilgilerini
güncelleme ve öğrenci kayıtlarını silme için API uç noktaları içerir. Her işlemden sonra ilgili günlükler, işlemin
durumunu kaydetmek için oluşturulur ve ihtiyaç duyulduğunda izlenebilir hale gelir.

Bu projenin amacı, öğrenci bilgilerini etkili bir şekilde yöneten modern ve kullanıcı dostu bir web uygulaması
geliştirmektir.

## Başlangıç

### Java 17'yi Yükle

- Bu uygulama Java 17 gerektirir.
- Java-17'yi indirip yüklemek için lütfen yandaki bağlantıya
  tıklayın: [Java-17](https://www.oracle.com/java/technologies/downloads/#java17)

### Gradle 8.7'yi Yükle

- Bu uygulama Gradle-8.7 gerektirir.
- Gradle-8.7'yi indirip yüklemek için lütfen yandaki bağlantıya tıklayın: [Gradle-8.7](https://gradle.org/releases/)

### Veritabanını Yükle ve Ayarla

- Bu uygulama MySQL 8 gerektirir.
- MySQL-8'i indirip yüklemek için lütfen yandaki bağlantıya
  tıklayın: [MySQL-8](https://dev.mysql.com/downloads/installer/)
- Veritabanı oluşturmak için yandaki dosyayı kullanabilirsiniz: [db_setup.sql](./database/db_setup.sql)

### Student-Cronjob Projesini Yükle

- Eğer öğrencilerin kalan kurs sürelerini günlük olarak güncellemek istiyorsanız, Student-Cronjob projesini yandaki
  adresten indirebilirsiniz: [Student-Cronjob](https://github.com/harunsefainan/student-cronjob)

### Uygulamayı Çalıştırma

- Repoyu klonlayın
   ```sh
   git clone https://github.com/harunsefainan/student-server
   ```
- Projeyi IntelliJ IDEA veya tercih ettiğiniz uygun bir IDE'de açın.
- Projeyi çalıştırın.
- Tarayıcıyı açın ve localhost:8080 adresine gidin (Portu değiştirdiyseniz 8080 yerine değiştirilmiş portu kullanın)

## Proje Detayları

![System Context](images/readme/student-tr.png)

### Veritabanı

![Entity Modesl](images/readme/student-entity.png)

### Swagger Dokümantasyonu

API dokümantasyonuna `http://localhost:8080/swagger-ui/index.html` adresinden erişebilirsiniz.
Swagger sayfasına eriştiğinizde uç noktaları göremiyorsanız, arama çubuğuna `/v3/api-docs` yazdığınızdan ve keşfet
düğmesine tıkladığınızdan emin olun.<br>

API'de bir şifreleme mekanizması bulunmaktadır. Uç noktalara erişmek isterseniz aşağıdaki kullanıcı adı ve şifreyi
kullanın:

- <i>Kullanıcı Adı - Şifre</i>
    - User - User

![endpoints](./images/readme/endpoints.png)

#### Tüm öğrencileri görüntülemek için aşağıdaki adımı uygulayın;

- `v1/api/students/getAll` uç noktasına gidin.

#### OID'ye göre öğrencileri görüntülemek için aşağıdaki adımı uygulayın;

- `v1/api/students/getByOID/{oid}` uç noktasına gidin ve gerekli alanları doldurun.

#### Yeni bir öğrenci oluşturmak için aşağıdaki adımı uygulayın;

- `v1/api/students/newStudent` uç noktasına gidin ve gerekli alanları doldurun.

#### Öğrenci bilgilerini güncellemek için aşağıdaki adımı uygulayın;

- `v1/api/students/updateStudent` uç noktasına gidin ve gerekli alanları doldurun.

#### Öğrenci bilgilerini silmek için aşağıdaki adımı uygulayın;

- `v1/api/students/deleteStudent/{oid}`  uç noktasına gidin ve gerekli alanları doldurun.

## Kullanılan Teknolojiler

 <p align="center">
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Spring_Framework_Logo_2018.svg/1200px-Spring_Framework_Logo_2018.svg.png" width="155" height="50" alt="Spring Boot" title="Spring Boot 17" class="img-small">
      <img src="https://raw.githubusercontent.com/docker-library/docs/c3d3ca6beed000f9ba6eabc98f3399158f520256/gradle/logo.png" width="155" height="50" alt="Gradle" title="Gradle" class="img-small">
      <img src="https://cogitech.pl/wp-content/uploads/2023/02/Swagger-logo.png" height="50" alt="Swagger" title="OpenAPI 2.0.4" class="img-small">
      <img src="https://cdn-icons-png.flaticon.com/512/5968/5968282.png" width="50" height="50" alt="Java" title="Java 17" class="img-small">
      <img src="https://cdn-icons-png.flaticon.com/512/5968/5968313.png" width="50" height="50" alt="" title="MySQL Workbench 8.0" class="img-small">
   </p>


  <hr>
<div align="center">
   <a href="mailto: harunsefa.inan@gmail.com" target="blank"><img align="center" src="https://cdn-icons-png.flaticon.com/512/9840/9840614.png" height="40" width="40" /></a>
   <a href="https://www.linkedin.com/in/harun-sefa-inan-761a2324b/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" height="30" width="40" /></a>
</div>
<hr> 





<p align="right">(<a href="#top">back to top</a>)</p>