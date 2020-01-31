public class JavaCode {

    public static void main(String[] args) {
        System.out.println("JavaCode is very beautiful");
    }
}
//1-Öncelikle .java dosyamızı oluştururuz daha sonra class oluşması için derlememiz gerekir javac
// ile ki byte code lara dönüşttürülebilmesi için compile edilmesi gerekir ve hayali class larımız oluştutktan sonra da
// virtual machine de bu byte code ları okunabilir ve artık kodu yourmlanacak hale gelmiş oluyor kodumuzu
// byte code lar sayesinde de her ortam da çalıştırabilme imkanına sahip oluyoruz windows,mac,linux gibi
/*
* Her zaman class ile anahtar söcüğü kullanılacak ki class ile başlamalı nesne tabanlı programlarda class ile başlar
*  ve içerisine nesne objeler oluşturarak o class ları somut hale getiriyoruz
* public demek o class ın erişim düzeyini gösterir yani herkes tarafından görünebileceğini anlatır
* Java sınıfları dinamik olarak yüklüyor normalde ama biz bir java kodu yazarken sınıf tanımlaması yapmışsak onu
* bir daha çağırmasına gerek kalmıyor ondan dolayı static oluşturuyor
* Normalde java da class lar dinamiktir yani kullanılırken çağırılı ama biz kendimiz bir class tanımlıyorsak biz
* bunun sürekli olmasını istiyoruz dinamik olmaması için static deniyor
* main kendisini çağıran kısma birşey göndermeyecek bunu ifade ediyor
* String[] args ile de programa girdiler verme imkanı sunuyor bize
* JDK-javac,debugging,jar dosyaları vardır içinde program geliştirme sürecinde gerekli olan bileşenleri barındırır içinde
* ve compile işlemi JDK sayesinde normal string şeklinde yazdğığmız kodlar byte codlara dönüşerek JAVA RUNTIME içerisinde
* bulunan ve Java Sanal Machine sinin byte code ları her platforma çalıştırılmasını sağlayan bir bileşendir
*  Java Run Time içeririnde JVM VE java kütüphanesini barındırır
* 2 aşamadan geçiyor önce compile ile sanal sınıflar oluşturarak o sanal sınıflar içerisine yerleştitirilen
* nesne veya objelerle somut hale geliyor yani byte code lara dönüşüyor ve artık sanal makine ile her platforma
* çalışabilme durumuna geliyor
*
* */