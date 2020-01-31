import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Normal while döngüsünden ve for döngüsünden farklı koşul sağlanmasa bile do kısmı bir kez garanti çalışacak
        //do while döngüsünde önce artırma yapılıyor kesin olarak bir kez çalışıyor ardından koşul geliyor
        //do while döngüsünün bu yönünü kullanmak isteyeceğimiz yerler mutlaka olabilir burası önemli...
       int i=0;
        do {
            System.out.println("i: "+i);
            i++;
        }while(i<10);

        //Bir sayının rakamları toplamını nasıl buluruz


        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int toplam=0,rakam=0,sayi;
        sayi=scanner.nextInt();

        do{
            rakam=sayi%10;
            toplam+=rakam;
            //Birler basamağını saydık o zaman artık birler basamağını atabiliriz
            sayi=sayi/10;//Sayı burda tek haneye düşünce 10 ile bölünmesi ile 0. küsür olacağı için ondan
            // sonra da döngü koşulumaz göre zaten sayi 1 den küçük olunca dur demiş oluyoruz döngü koşulumuza

        }while(sayi>=1);

        System.out.println("rakamlar toplamı: "+ toplam);


    }
}
