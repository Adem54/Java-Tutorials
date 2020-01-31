import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
	// Burda kullanıcıdan input almak için alacğaıımız verinin tipine göre farklı fonksiyonlar kullanılır ki java da
        // herşey class demekti
        //Bu arada biz Scanner objesi oluşturmak istediğmiz zaman dosyamıza scanner objesini aldığmız paketi
        // import etmemiz gerekecektir neyse ki intelji bunu kendisi otomatik yapıyor biz Scanner yazdğımız zaman
        // zaten doğrudan yukarda bu import u gerçekleştirecektir
        //Önce bir scanner objesi oluştururuz ve o obje içerisinde System.in adında bir method kullanırız
        //ve bu statement ı tüm input veri tiplerinde ortak alırız
        Scanner scanner=new Scanner(System.in);

        //String tipinde veri almak
        System.out.println("Lütfen bir text giriniz");
        String word=scanner.nextLine();
        System.out.println(word);
        //Bu arada dikkat edelim biz string tipinde input u int ve double dan sonraya koydğumuz zaman biz daha string
        // verisini girmeden java işlemi sonlandırdı bizde ondan dolayı string işleinin başa aldık bunun sebebine bakalım
        //int veri tpinde input almak
        System.out.println("Lütfen yaşınızı giriniz: ");
        int age=scanner.nextInt(); //İnput burda doğrudan sizden bir int değeri girmenizi bekler ondan dolayı siz
        // önesinde hangi değer girilecek belirtmek istiyorsanız onu sout ile girmelisiniz mesela yaşınızı giriniz gibi
        System.out.println("Yaşınız: "+ age);
        //Ondalıklı sayı almak
        System.out.println("Lütfen ondalıklı sayi giriniz");
        double sayi=scanner.nextDouble();
        System.out.println("Girdiğiniz sayi: "+sayi);
        //INT BEKLENEN INPUT A STRING GİRERSEK NE OLUR
        //JAVA HATA VERECEKTİR AMA ÇÖZÜMÜ VAR 1-KOŞUL YAZMA 2.EXCEPTIONS
        System.out.println("Lütfen yaşınızı giriniz");
        if (scanner.hasNextInt()) {//Eğer kullanıcı integer girerse bu koşul true olacak
            int yas=scanner.nextInt();
            System.out.println("yas: "+ yas);
        }else{
            System.out.println("Lütfen bir sayı giriniz");

        }
        //TAM TERSİ DURUMDA STRING BEKLEYİP INT GİRERSEK HERHANGİ BİR SIKINIT ÇIKMAZ SADECE GİRDĞİMİZ
        // SAYI DEĞERİNİ STRİNG OLARAK ALACAKTIR

        //Ayrıca Scanner da Int veya double dan Sonra String veri alınca karşılaşacağımız hata durumu...
        System.out.println("Bir ondalık sayı giriniz");
        double ondalik_sayi=scanner.nextDouble();
        System.out.println("Ondalık sayı: "+ ondalik_sayi);
        System.out.println("Bir yazı giriniz");
        scanner.nextLine();//DEfault bir string input tanımlarız ki aşağıda biz string verisini almak istedğimiz
        // zaman ddoğrudan java programı bitirmemesi için--Bunun adına Dummy deniliyor
        String yazi=scanner.nextLine();
        System.out.println("yazı: "+ yazi);
        //Burda beklenmeyen olay şudur bir ondalık sayi girip de enter a basında enter ı \n mantığı vardı ya string de
        //o mantığa göre biz enter a basında o enter ı \n olarak algılıyor ve onu bir string değer olarak görüyor
        // ondan dolayı da biz sanki string değeri girmiş gibi biz string değeri girmeden kodu bitiryor bunun çözümü
        // String input tan önce bir tane default input atayabiliriz ya da String input u int veya double dan
        // önce kullanırsak bu sorunla karşılaşmayız

        //Son Olarak Biz int input alırken arka arkaya herbirisine enter ile geçebilirken space tuşu ile de bir
        // diğer input isteğine geçiş yapabiliriz
        System.out.println("Lütfen yas1 gir");
        int yas1=scanner.nextInt();
        System.out.println("Lütfen yas2 yi giriniz");
        int yas2=scanner.nextInt();
        System.out.println("Lütfen yas3 ü giriniz");
        int yas3=scanner.nextInt();
        System.out.println("Yas1: "+ yas1 + " |  Yas2: "+ yas2 + " |  Yas3: "+ yas3);

    }
}
