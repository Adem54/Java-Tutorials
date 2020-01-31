import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("Bir sayi gir");
            int k=scanner.nextInt();
            int total=1;
            while(k>=1){
                total*=k;
                k--;
            }
            System.out.println("Total:  "+ total);



        int a=10;
        while(a>=1){
            System.out.println("a: "+a);
            a--;
        }

        //Kullanıcıdan alınan sayının faktöriyelini bulalım

        System.out.print("Bir sayı girin: ");
        int x=scanner.nextInt();
        int toplam=1;
        int counter=1;

        while (counter<=x){
            toplam*=counter;
            counter++;
        }
        System.out.println("Counter: "+ toplam);

        int m=100;
        int sayac=0;

        while(sayac<100){
            System.out.println("Sayac: "+sayac);
            sayac+=3;
        }

    }
}
