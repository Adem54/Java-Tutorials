public class JavaWeek1//class ismi ile dosya ismi aynı olmalı
{

    public static void main(String[] args) {//public static main kısmı çalıştırılabilir olması için
        // executıbıl olması için gereklidir
        System.out.println("Java dersine hoşgeldiniz..");
    }
}
//JAVA NOTLARI
//İlk önce javac JavaWeek1.java diyerek compile etmiş oluruz ve class dosyası oluşur
//Compile işlemini yapan Javacompiler ise JDK java Develpment kit içerisindedir
//compile ederken syntax hatası varsa compile etmeyecektir ve hata verir bu hatalara compiletimeerror deriz ve
//Bu hatalar syntax tan kaynaklanan hatalardır(javac ı çalıştırırken)
//Sonra ise java JavaWeek1 dersek kod çalışmış olur işte burda ise sanal makine virtual machine kütüphanesi devreye girmiş olur
//virtual machine ise Java Runtime Environment içerisindedir.Şuna dikkat edelim sanal makine yani java diye komut
// yazarken terminalde java byte code u çalıştırıyor yani uzatnısı
//java sanal makinesi byte code lar ı çalıştırarak işletim sistemine uygun kodlar haline getiriyor ve çıktı alıyoruz
//Ayrıca bu virtual machine hangi platformlarda hangi sistemlerde varsa hepsinde java çalıştırılabilir demekir ki bu
// windows,linux,mac,android gibi bir çok platformda var olması neden ile javanın burda bir farkı ortaya çıkıyor
//.java olan kodu değilde oluşan byte code yi(.class olan kod) çalıştırıyor ki bu şekilde tüm ortamlarda windows,linux,mac gibi çalışılabilir
//Birde bizim byte codlarımız .java compile edildiken sonra oluşan .class uzantılı dosyanın içindedir ve
// biz sanal makine ile virtual machin ile java JavaWeek1 dediğimizde JavaWeek1 adlı class dosyasını arayacaktır
//Ayrıca sanal makine çalışırken de hata olabilir bu da runtimeerror yani sanal makine çalışırken kaynaklanan hata
//1-Mantık hataası olabiir sizin bekledğiniz gibi çalışmayabilir bir de çalışma esnasında hatalar olabilir
//Bazı terminal kodları
// del yazar dosya adı yazarsak o yazdığımız dosya adını siler
// dir yazar tıkarsak o klasör altındaki dosyaları listeler
// . bulunduğun dosya .. bir üst dosya demektir
//mkdir klasör adı ile yeni bir klasör oluşturulur
// cp kopyala demektir cp ../javaWeek1.jar .  bir üst dosyadan javaWeek1.jar dosyasını al bu klasöre kopyala demktir

/*
//BYTE CODE
//byte kodlar .class uzantılı kodlardır ve bunlar genelde jar uzantılı sıkıştırılmış dosya olarak tutuluyor bildiğimiz
//zip dosyası gibi.Genel de geliştiriciler uygulama geliştirme bittikten sonra bu uygulamayı biryere yükleyecekse
//genelde .jar dosyası halinde tutar
//path dedğimiz çevresel değişken işletim sistemi consolunun executable çalıştırılabilir dosyaları nerelerde araması gerektiğini söyler
//Java da da classpath java sanal makinesinin yükleyeceği class ları nerelerde araması gerekitğini söyler
//classpath in varsayılan davranışı şudur ki bulunduğun dizin classpath dir yani bulunduğun dizinde class dosyası varsa bulur
//Aynı zamanda java nın kendi kütüphanesinden gelenlerde varsayılan olarak bulunur ama internetten başka kütüphaneler
// kullanmak istersek bunları  bu classpath lere eklmememiz gerekir
//Sanal makine java ile başlayan kod satırı bu class ları bulabilmek için verdiğiniz classpath değişkeninin işaret
//ettiği dizinler içinde arıyor
//Verdiğmiz dosyaları jar dosyası içerisine atmak için kullanılan komut: jar cf archive.jar<files>
//JAR DOSYASI NASIL OLUŞTURULUR
//ÇOK ÖNEMLİ...UYARI.....
//Biz jar dosyası oluştururken şuna çok dikkat edelim ki eğer komut satırından .jar dosyası oluşturuyorsak o zaman eğer .class dosyamızın başharfi büyük ise .jar a vereceğimiz harfin başharfi de büyük olmalıdır ya da şöyle düşünelim .class dosyamızın baş harfi büyükse .jar a büyük başharfli isim .class dosyamızın başharfi küçükse o zamannnda .jar a küçük başharfli isim vermeliyiz ki çünkü .jar içerisinde oluşan .class dosyası isim olarak normalde var olan .class dosyası ile aynı oluyor ancak .jar başharfi nasılsa içeisiinde oluşan .class ismi de .jar başharfine uyum sağlıyor yani .jar dosya ismi başharfi büyükse içinde oluşan .class isminin başharfi de büyük oluyor eğer .jar dosya ismi küçük harf ise içindeki class ismi başharfide küçük oluyor ve eğer biz en başta var olan .class ismi ile .jar içerisinde oluşan .class ismi birbiri ile aynı isimde değilse büyük harf küçük harf uyumunda da dikkat ederek işte o zmaan biz java -cp javaWeek1.jar JavaWeek1 şeklinde .jar dosyasını classpath olarak belirtsek bile hata alırız ve çıktı alamayız bundan dolayı  bu kısma dikkat edelim çok  önemli bir konudur ki .jar dosya ismi farklı olabilir sadece şuna dikkat .jar ismi baş harfi class isminin başharfine göre yapmalıyız
İki şekilde birisi doğrudan komut satırından
1)
//jar cf test.jar(bu isim bize bağlı) Test.class
//jar dosyası aslında sadece bir zip dosyası ve içerisinde de class dosyası mevcuttur
2) InteljıIdea üzerinden
//Intelji id de jar oluşturma nasıl olur
//File=>Project Structure=>Artifacts=>Sol üstteki + ikonuna tıklanır ve Jara tıklanınca gelen seçeneklerden
//from modules with dependencies seçilir=>karşımıza açılır pencere gelir orada main class ımızın adını gireriz ve ok deriz
//Sonra ise üstte Built menüsünden build artifacts ı seçeriz ve bu şekilde jar dosyamız klasörler
// arasında biryere oluşturulmuş olacaktır
 Sonuç olarak jar dosyasını
// zip dosyalarını açabilen programlarla açabiliriz
//jar dosyasınızı uygulamanıza classpath olarak da verebiliriz farkı bu

//java -cp devamına nerde class dosyası varsa onları söyleyebiliriz bu dizinde olabilir bir jar dosyası da olabilir

//Mesela -cp Test.jar dosyası ise o zaman biz Main class ismimiz ne ise sonrasında onu yazarız yani eğer o class
main dosyamız yani .java dosyamız onunla aynı klasörde değil bir üst klasörde ise bile çalışmasını bekleriz çünkü
önemli olan classpath java -cp sonrasında .jar dosyasını yazdıktan sonra cp yolu doğru vermiş oluyoruz ya da .jar dosyası yerine
doğrudan class dosyasını olduğu dosya yı adres olarak veririrz
(Mesela java -cp ..(class dosyası bir üstte) JavaWeek1(mainclass adı)  bu şekilde de çıktıyı alırız)
//Yani biz java -cp class path olarak ya direk bir .jar dosyası(ki içerisinde class dosyası vardır .jar  ın) ve main class adımız ı veririrz
// java -cp javaWeek1.jar JavaWeek1 şeklinde ki burda şuna dikkat biz şu an javaWeek1.jar doyası ile aynı yerdeyiz ancak
// class ve .java dosyamız birüst klasörde ama main class ismini .jar dan sonra yazarız ve çıktıyı ekranda görmeyi bekleriz
Çünkü -cp javaWeek1.jar JavaWeek1 de javaWeek1.jar deyince classpath i doğru vermiş oluyoruz
Çünkü bir .jar dosyası nı işaret ediyoruz doğrudan -cp ye ki .jar içerisinde de class dosyası var
yani class dosyasını işaret etmemiz gerekiyordu ondan dollayı da .jar ı işaret etmemeiz doğru olmuş oluyor
Ya da onun yerine doğrudna .class ve .java uzantılı dosyalarımızın olduğu klasörü -cp ye işaret ederiz
java -cp ..(class dosyası bir üstte) JavaWeek1(mainclass adı)
 */
// java -cp javaWeek1.jar JavaWeek1(Benim çalıştırılabilir main classımın ismi bu demiş oluyoruz )
//yazdığımız dizinde eğer JavaWeek1.class yoksa o zaman o dizinde  doğrudan java JavaWeek1 çalışmaz
//Eğer java dosyasının yanında class dosyası varsa ve biz bir alt dizinden  -cp classpath olark class ın olduğu dosyayı
// veriyorsak o zamaanda kodumuz çalışacaktır
//java -cp .. JavaWeek1 dersek yani bir üst klasörde class dosyamız varsa ve biz classpath olark orayı işaret etmişsek
// eğer o zaman da sorunsuz çalışacaktır
//Ya da bizim jar dosyamızı cp olarak verdikten sonra .java dosyasının aıdıjnı yazarak da çalıştırabiliri
// java -cp javaWeek1.jar JavaWeek1 deyip enter yaparak da çalıştırabiliriz

//Intelji idea ile yeni bir proje açtığımız zaman o kendisi otomatik olarak JDK mızı buluyor ama
// biz istersek eğer farklı bir JDK da seçebiliriz
//Biz projeyi açınca altta bir progressbar ilerliyor ve index leri güncelliyor JDK nın içindeki tüm kütüphanelerle
// ilgili bilgileri indexliyor ve o indexleme olduktan sonra bize birtakım kolaylıklar sağlayacak
//Ide nin hazır şablonları var onları da kullanabilriz istedğimiz bir string i hazır yazmak için sout yazarsak
// doğrudan sout yazarsak system.out.println() ı otomatik getirecektir
//Üstte built dersem compile eder ama run dersem hem compile eder ve sonrasında da çalıştıracaktır
//Ayrıca eğer class ismi değiştirmek istersek o ismi seçeriz sağa tıklayarak refactor ve rename dersek o zaman
// hem class ismini hem de dosya ismini aynı anda değiştirecektir
//CTR+ALT+I indent leri ayarlar ve düzenli sırada yerleştirir kodları
//Intelji id de short cutlar a bakabiliriz kısa yollar ı kullanma
//Intelji id de jar oluşturma nasıl olur
//File=>Project Structure=>Artifacts=>Sol üstteki + ikonuna tıklanır ve Jara tıklanınca gelen seçeneklerden
//from modules with dependencies seçilir=>karşımıza açılır pencere gelir orada main class ımızın adını gireriz ve ok deriz
//Sonra ise üstte Built menüsünden build artifacts ı seçeriz ve bu şekilde jar dosyamız klasörler
// arasında biryere oluşturulmuş olacaktır