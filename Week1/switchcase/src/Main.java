import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı girin");
	    sayi=scanner.nextInt();

	    //Eğer break leri koymazsak o zaman ilkbaşta  koşul sağlanma durumunu arayacak önce ve koşul sağlandığı yerden
        //  sonrasında break yokso zaman kendinden sonra gelen case lerin koşula uyup uymadığına bakmaksızın
        // hepsini çalıştıracaktır diğer case lerin koşula uyup uymasına bakmaksızın çalışıtıracaktır
        //Mesela daha ilk case de koşul sağlanırsa o zaman ilk case den sonra gelen tüm case leri eğer
        // break yoksa çalıştıracaktır
        //Veya hangi case de koşul sağlanmışsa ve koşul sağlanan case den sonra hiç break yoksa o zaman sonrasındaki
        // tüm case leri koşula uyup uymadığına bakılmaksızın çalıştıracaktır
        //break ler doğrudan koşul switch bloğundan çıkılmasını sağlar
	    switch (sayi){
            case(5):
                System.out.println("Bu sayı 5 e eşittir");

            case(10):
                System.out.println("Bu sayi 10 a eşittir");

            case(15):
                System.out.println("Bu sayı 15 e eşittir");

            default://Yukardakilerin hiçbirisi şarta uymazsa burası gelecektir
                System.out.println("Bu sayı 15 ten büyüktür");
                break;
        }

        //Kullanıcıdan alınan üç sayıdan en maks olanı bulalım
        System.out.print("sayi1: ");
        int sayi1=scanner.nextInt();
        System.out.print("sayi2: ");
        int sayi2=scanner.nextInt();
        System.out.print("sayi3: ");
        int sayi3=scanner.nextInt();
        int maks=-1;//Eğer max değer kontrol ediyorsak karşılaştıracağımız max değer eldeki değerlerin hepsinden
        // küçük bir değer olmalı
        if (sayi1>sayi2 && sayi1>sayi3){
            maks=sayi1;
            System.out.println("Maximum sayı "+ sayi1+ " dir");
        }else if(sayi2>sayi1  && sayi2>sayi3){
            maks=sayi2;
            System.out.println("Maximum sayi "+sayi2+" dir");
        }else if(sayi3>sayi1 && sayi3>sayi2){
            maks=sayi3;
            System.out.println("Maximum sayi "+ sayi3 + " tür");
        }

        System.out.println("makx: "+ maks);

        //Beden kitle indeksi hesaplayalım
        //Beden Kitle indeksi=Kilo/Boy*Boy(mcinsinden)
        /*
        * 18.5 altı ise zayıf
        * 18.5-25 arası normal
        * 25-30 arası fazla kilolu
        * 30 üstü ise obez
        * */
        System.out.println("Lütfen kilonuzu giriniz(tam sayi)");
        int weight=scanner.nextInt();
        System.out.println("Lütfen boyunuzu m cinsinden giriniz");
        double length=scanner.nextDouble();
        double beden_kitle_indeksi;
        beden_kitle_indeksi=weight/(length*length);

      if (beden_kitle_indeksi<18.5){
          System.out.println("Zayıf");
      }else if(beden_kitle_indeksi>18.5 && beden_kitle_indeksi<25){
          System.out.println("Normal");
      }else if(beden_kitle_indeksi>=25 && beden_kitle_indeksi<30){
          System.out.println("Fazla kilolu");
      }else if(beden_kitle_indeksi>=30) {
          System.out.println("Obez");
      }


    }
}
