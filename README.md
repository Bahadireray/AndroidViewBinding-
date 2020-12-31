# AndroidViewBinding-
Bu proje Android View Binding anlatmak için yapılmış basit bir örnektir
Nedir Android View Binding?
Nedir bu View Binding, aslında bir jetpack kütüphanesi peki bu özelliği kullanmadan olur mu, olur ama kullanırsak neler olur;
Özellikle Google play'a yüklemek isteyeceğiniz uygulamalarda daha sonra geliştirmek üzerine eklemeler yapmak istediğiniz gayet faydasını göreceksiniz. 
Android kod tarafında görsel arayüze ulaşıp değişik yapmak istediğimizde buton içerisinde view sınıfın üzerinde işlem yapmak için bazı tanımlamalarla ulaşabiliyoruz. 
Bunu sizlere basit bir örnekle anlatacağım;
Böyle bir kullanımla buton içerisinde tıklanmaları dinleyip işlem yapabiliyoruz lakin asıl olayımız nedir? Görünüm penceresindeki değişiklerini nasıl daha efektif bir kullanımla değiştirebiliriz?
Eski kullanımda fonksiyona textView içerindeki tanımlı bir ID'yi import edince ilgili değişikliğe erişebiliyorduk. Şimdi son güncellemeyle bazı tanımlamalar yaparak eski kalmış bu özelliği kullanabiliyoruz. Öncelikle onu anlatacağım daha sonra ViewBinding kullanımıza geçeceğiz
Son güncellemede mavi olarak işaretli belirtmiş olduğum alan bulunmamaktadır. Eski kalmış özelliği kullanabilmek için bunu yazmanız gerekecektir.
Daha sonra projemizde kod kısmında,
import kotlinx.android.synthetic.main.activity_main.*
Böyle bir sınıf eklenecektir. Eğer sorun yaşarsanız projeyi restart ederek başlatmamızda gerekebilir.
View tarafında daha derine inince kotlin bize sınıf içerisinde görsel öğelere erişim sağlarken aslında java temellerinde neler yapıyorduk biraz anımsayalım;
val textView=findViewById<TextView>(R.id.textView)

textView.text="Merhaba eski düzen"
Id ile bul diye değişken oluşturuyoruz. Sınıf olarak (TextView ) bir eşleşme oluşturunca bunun üzeirnde değişim yapıyorduk.
Şimdi javanın bu karmaşasının üzerine kotlin bir kısa erişimle düzenleme yapmamıza izin veriyordu. Daha sonra Android bize dedi ki ben daha güzel bir yolunu buldum bunu bir deneyin, adıda View Binding şimdi bunun kullanıma geçelim.
Google arama penceresine Android View Binding dediğimizde ilgili açıklamalarına erişebiliriz. Android projemizde iki adet build.gradle dosyamız bulunmaktadır. Biz bunlardan 'app' olanın içerisinde değişiklik yapacağız. İçerisine parantezlere dikkat ederek ekleyelim.
android {
    ...
    buildFeatures {
        viewBinding true
    }
}
Bu eklemeyi yaptığımız zaman sıfırdan projemizi yeniden derleyip hatta yeniden bir başlatmakta yarar var. Çünkü View'lerin içerisinde gerekli değişiklik içeren sınıfları eklemesi gerekiyor. Bazen synNow demek tam anlamıyla kullanmaya izin vermeyebilir. Diğer yeni sınıfların eklenme işlemlerinde de projeyi yeninde bir başlatmak size fayda sağlayacaktır.
Binding diye bir değişken oluşturuyoruz ve o anki güncel aktivitemiz neyse onunla birlikte tamamlıyoruz. Değişkeni tamamlarken otomatik olarak bulunduğunuz aktivitenin isminde binding oluşturuyor. Aktiviteye özel binding oluşturma işlemimizden sonra onCreate altında bir kerelik olarak başlatmamız gerekiyor. Bir nevi sürekli R.id.textView demek yerine bir kere oluşturduğumuz görünüm altından değişkenlerimiz buradan alınıyor. Bizi aslında kod karmaşasından kurtarıyor. Bu sınıf bizim R.id değişkeniyle çalışacağımızı anlıyor temelde bu tanımlamayı yaparak sürekli tanımlamaya ihtiyacımız olmuyor.
Bu tanımlamarı yaptıktan sonra ilgili çağrımlarda kullanacağımız kod;
binding.textView.text="Merhaba Bu yazı View Binding \n kullanımı yapılarak yazıldı"
Bu şekilde tanımlayarak kodumuz içerisinde view görünümle ilgili işlemleri Android View Binding kullarak yapabilir.

