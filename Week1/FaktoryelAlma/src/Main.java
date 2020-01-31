import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Kullanıcının girmiş olduğu sayının faktöriyelini alan programı yazalım
        Scanner scanner=new Scanner(System.in);
        System.out.print("Faktöriyelini alınmasını istediğniz sayıyı girin");
        int sayi=scanner.nextInt();

        int toplam=1;
        for(int i=1; i <=sayi;i++){
            toplam=toplam*i;
        }
        System.out.println("Toplam: "+toplam );

    }
}
