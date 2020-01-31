import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi1 değerini giriniz: ");
        int sayi1=scanner.nextInt();
        System.out.println("sayi2 değerini giriniz: ");
        int sayi2=scanner.nextInt();
        System.out.println("Yapılacak işlemi giriniz(+-/*) şeklinde");
        String islem=scanner.next();
        double sonuc;

        switch(islem){
            case("+"):
                sonuc=sayi1+ sayi2;
                break;
            case("-"):
                sonuc=sayi1-sayi2;
                break;
            case("/"):
                sonuc=sayi1/sayi2;
                break;
            case("*"):
                sonuc=sayi1*sayi2;
                break;
            default:
                sonuc=sayi1+sayi2;
                break;
        }
        System.out.println("Sonuc: "+ (int)sonuc);//Eğer sonucu int şeklinde tam sayı almak istersek o zaman int a
        // çevririz bu şekilde yok ondalık sayı olarak almak istersek o zaman da zaten tipi double idi o şekilde kalabilir

    }
}
