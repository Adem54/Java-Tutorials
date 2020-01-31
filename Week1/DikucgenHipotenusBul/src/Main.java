import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen dik üçgenin birinci dik kenarının değerini giriniz(Tam sayı türünden)");
        int first_leg=scanner.nextInt();
        System.out.println("Lütfen dik üçgenin ikinci dik kenarınız giriniz");
        int second_leg=scanner.nextInt();
        int kareler_toplami=(first_leg*first_leg)+(second_leg*second_leg);
        double hipotenus;
        //Karekök alma math paketi içerisindeki sqrt ile yapılır ve sonucu double olarak döner en son biz kendmizi tür
        // dönüşümü yapacağız çünkü java nın otomatik tür dönüşümünü int dan float a ondan da double a doğru yapıyordu
        //Ondan dolayı Math paketini yüklememiz gerekecek
        System.out.println("81  in karekökü:  "+Math.sqrt(81));
        hipotenus=(Math.sqrt(kareler_toplami));
        System.out.println("hipotenüs: "+ (int)hipotenus);//Math.sqrt ile dönen değer zaten double olarak dönecek ki
        // hipotenus değişkenimiz de double türünden ondan dolayı biz en son double türünü int e çeviriyoruz


    }
}
