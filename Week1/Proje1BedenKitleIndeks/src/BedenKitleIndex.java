import java.util.Scanner;

public class BedenKitleIndex {

    public static void main(String[] args) {
	//Beden kitle indeksi, vücut ağırlığının (kg olarak),
        // boy uzunluğunun (metre cinsinden) karesine bölünmesiyle hesaplanır
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ağırlığınızı kg cinsinden bir tamsayı olarak giriniz");

            int weight=scanner.nextInt();
            System.out.println("Ağırlığınız "+ weight);



        System.out.println("Lütfen boy değerinizi m cinsinden ve ondalık sayı olarak giriniz");
        double length=scanner.nextDouble();
        System.out.println("Boyunuz: "+ length);
        System.out.println("Beden kitle indeksini hesaplayınız");
        double beden_kitle_indeksi=(weight)/(length*length);
        System.out.println("Beden Kitle indeks: "+ beden_kitle_indeksi);
        //Bu arada biz input ile değer isterken öncesinde ekrana sout ile yazı basınca eğer gireceğimiz input un bir
        // alt satırda oluşmasını istemiyor da aynı satırda oluşmasını istersek o zaman System.out.print yazarız

        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();

    }
}
