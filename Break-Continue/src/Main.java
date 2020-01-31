import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 100 e kadar olan sayilardan ilk 10 çift sayı yı bulalım
        int count=1;
        int sayac=0;
        while (count<100){
            if (count % 2 == 0){
                System.out.println("count: "+ count);
                sayac++;
                if (sayac == 10){
                    break; //Break hiçbir koşula bakmadan tüm döngüyü durduruyor break içerisinde bulunduğu döngüyü sonlandırır
                    //Bizden istenden eğer normalde kod çalışmaya devam ediyor ama sen şu şartları sağlarsan tamam
                    // döngüyü bitir şeklinde birşey ise o zaman bu şekilde şartlarımız sağlanıp sağlanmağını
                    // if ile kontrol edip hemen arkasına break ile döngüyü durdurmalıyız
                }

            }
            count++;

        }
        Scanner scanner=new Scanner(System.in);
        while(true){//Döngü koşuluna true yazmak demek bu döngü sonsuza kadar çalışsın demektir ve biz döngüyü
            // sadeece break ile durdurabiliriz sadece 1 şartta döngü durması gerekirse bu şekilde kullanabiliriz
            System.out.println("Bir sayı giriniz");
            int k=scanner.nextInt();
            if (k==0) break;
        }

        System.out.println("--------------------------------------------------------------------------");
        //Continue-1 den 10 a kadar olan sayıları 5 hariç getiren programı yazınız
        //continue ifadesini görünce kodumuz doğru koşul u kontrol ettiği yere döner alt satırdaki işlemlere bakmaz
        for(int i=1;i<=10;i++){
            if (i==5) continue;//Eğer 5 ise bu kod bloğunda hiçbirşey yapmadan devam et demektir ki alttaki
            // sout da çalışmayacaktır eğer i=5 ise
            System.out.println("i: "+i);
        }

        //Continue de while döngüsünde sonsuz döngü tehlikesi

        int a=0;
        while (a<10){
            if (a==3 || a==5){ a++;  continue;}//while döngüsünde sayacın continue den sonra 1 artması gerekir ki
            // continue den sonra doğrudan koşula dönüp koşulu kontrol edecek koşula dönerken değerinin 1 artması
            // gerekiyor ondan dolayı da continue öncesinde sayacı arttırmalıyız yoksa herseferinde koşula döner
            // ve koşuldan da continue ye döner.for döngüsünde ise koşula her dönüldüğünde otomatik olarak arttırıyor

            System.out.println("a: "+a);
            a++;
        }

    }
}
