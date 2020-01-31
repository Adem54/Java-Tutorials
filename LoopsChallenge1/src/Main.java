import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1 e basınca Bakiye öğrenme
        //2 ye basınca Para Çekme
        // 3 e basınca Para Yatırma
        // q ya basınca da hesaptan çıkma şeklinde programımızı yapalım

        System.out.println("ATM den para çekme işlemleri");
        int bakiye=1000;
        String islem="1-BakiyeÖgrenme\n"+
                "2-ParaÇekme\n"+
                "3-ParaYatırma\n"+
                "q-Quit\n";
        System.out.println(islem);
        Scanner scanner=new Scanner(System.in);
        //islem.equals işlemine dikkat edelim

        while (true){
            System.out.println("Döngü başlıyor");
            System.out.println("Yapmak istediğiniz işlem tuşuna basınız");
            islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Hesabınız kapatılıyor");
                break;
            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz: "+bakiye);
            }else if(islem.equals("2")){
                System.out.println("Çekmek istedğiniz para miktarını girin");
                int cekilecek_miktar=scanner.nextInt();
                bakiye-=cekilecek_miktar;
                System.out.println("Kalan bakiye: "+ bakiye);
            }else if(islem.equals("3")){
                System.out.println("Yatırılacak miktarı giriniz");
                int yatirilacak_miktar=scanner.nextInt();
                bakiye+=yatirilacak_miktar;
                System.out.println("Kalan bakiye"+ bakiye);
            }

        }

    }
}
