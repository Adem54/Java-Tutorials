import java.util.Scanner;

public class DegiskenDegerDegistirme {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi: ");
        int sayi=scanner.nextInt();
        System.out.println("sayi: "+sayi);
        System.out.print("Bir kelime giriniz: ");
        scanner.nextLine();
        String kelime=scanner.nextLine();
        System.out.println("kelime: "+kelime);
        System.out.print("Sayi1");
        int sayi1=scanner.nextInt();
        System.out.println("sayi1: "+ sayi1);
        //Biz burda sayi1 ve sayi değerini değiitirmemiz için arada bir tane geçici bir değer olmalı
        //Geçici değer ile biz sayılardan birini geçici bir değere atayalım ki o sayi değişkenini diğer sayıya
        // eşitleyince eski değerini biryerde tutmuş olalım ki  eski değeri de bize lazım olacak
        int temporarly_value;
        temporarly_value=sayi;
        sayi=sayi1;
        sayi1=temporarly_value;
        System.out.println("newSayi: "+ sayi);
        System.out.println("newSayi1: "+sayi1);

    }
}
