import java.util.Scanner;

public class YakitHesabi {

    public static void main(String[] args) {
	//Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve
        // sürücünün toplam ne kadar ödemesi gerektiğini bulunuz?
        Scanner scanner=new Scanner(System.in);
        System.out.print("Aracın 1 km deki yakıt tutarını giriniz(kron cinsinden giriniz)");
        int cost_per_kilometer=scanner.nextInt();
        System.out.print("Aracn günlük yaptığı km miktarını giriniz ondalıklı sayı olarak giriniz detaylı bir şekilde)");
        double daily_running_kilometer=scanner.nextDouble();
        System.out.println("Sürücünün 1 aylık ödemesi gereken tutarı hesaplayınız");
        double monthly_cost;
        monthly_cost=(daily_running_kilometer*30)*cost_per_kilometer;
        System.out.println("Bir aylık maliyet: "+ monthly_cost);

    }
}
