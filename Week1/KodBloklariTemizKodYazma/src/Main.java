import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Aritmetik Operatörler
        // == Eşit
        // != Eşit değilse
        // > Büyükse
        // >= Büyük ve eşitse
        // < Küçükse
        // <= Küçük ve eşitse
        // &&--> ile verilen elemanların hepsi şarta uyarsa true gelir bir tanesi bile şarta uymazsa sonuç false gellir
        // ||--> operatörü ile yazılan elemanlardan bir tanesi bile şarta uyarsa true gelir ama hiçbiri şarta
        // uymazsa o zaman false gelir
        // !--> operatörü ile de true olan birşeyin başına not getirirsek tersine çevirir
        // eğer true ise false false ise true ya çevirecektir
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        System.out.println(!a);//false olarak gelir
        System.out.println(!false);
        int yas = 14;

        if (yas > 14) {
            System.out.println("Siz bu ürünü alabilirsiniz");
        } else {
            System.out.println("Siz bu ürünü alamazsınız");
        }
        System.out.println("Bir sayı giriniz");
        int sayi = scanner.nextInt();

        //else if ile herhangi bir koşul sağlandığı anda diğerlerine bakmadan if koşulunu tamamen bitirir
        if (sayi < 5) {
            System.out.println("Bu sayı 5 ten küçüktür");

        } else if (sayi > 10) {
            System.out.println("Bu sayı 10 dan küçüktür");
        } else if (sayi < 15) {
            System.out.println("Bu sayi 15 ten küçüktür");
        } else {
            System.out.println("Bu sayı 15 ten büyüktür");
        }
        //
        System.out.println("Lütfen notunuzu giriniz");
        int not=scanner.nextInt();
        if(not>85){
            System.out.println("AA");
        }else if(not>75){
            System.out.println("BA");
        }else if(not>65){
            System.out.println("BB");
        }else if(not>55) {
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }
//if içerisindeki else if ler eğer kendinden üstte kalan bir koşul sağlanmışsa ondan sonra gelen else if lere bakmaz
// doğrudan sağladğııı yerde  o kodbloğunu çalıştırdıktan sonra sonlanır ancak eğer bizz else if ler yerine direk
// if yazsa idik o zaman iş değişirdi o zaman her bir if bloğu üstteki veya alttaki ile ilgilenmez herharükarda
// koşulunu kontrol eder eğer koşulu sağlıyorsa çalkışır sağlmazsa çalışmaz


    }
}
//Kod blokları demek fonksiyonlar veya koşul durumlarında ya da bir class için oluşturduğmuz da ki süslü parantezler
// içerisinde kalan statementlara yani kod satırlarına biz kod bloğu diyoruz
//Ayrıca kodlarımızı temiz ve düzenli yazmamız çok önemlidir çünkü biz projeleri tekbaşımıza yapmayacağız ondan dolayı
//başkaları bizim kodlarımızı okumak durumunda olacaklardır ondan dolayı bizim nasıl kod yazdğıımız çok önemlidir
//Mesela değişkenleri ingilizce ve yaptığmız işlere uygun değişken isimleri vermemmiz çok önemlidir
//Ayrıca yazdığımız methodlar ya da fonksiyonların başına yaptığı işlevi anlatan ingilizce kısa yorum satırları yazmalıyız
//Aşırı derecede yorum yazmak da çok iyidir


