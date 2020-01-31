import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan Vize1,Vize2 ve Final notu olmak üzere 3 tane not gireceğiz
        //Vize1-30% ,Vize2-30%,Final-40%
        /*
        * Toplam Not >=90-->AA
        * Toplam Not >=85-->BA
        * Toplam Not >=80-->BB
        * Toplam Not >=75-->CB
        * Toplam Not >=70-->CC
        * Toplam Not >=65-->DC
        * Toplam Not >=60-->DD
        * Toplam Not >=55-->FD
        * Toplam Not <55 -->FF
        *
        * DD alma ve sınıf ortalamasının 2.5 altında olma koşuluna göre de bir tavsiye yazalım
        * */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vize1 notunu giriniz");
        int vize1=scanner.nextInt();
        System.out.println("Vize2 notunuz giriniz");
        int vize2=scanner.nextInt();
        System.out.println("Final notunu giriniz");
        int finalNotu=scanner.nextInt();
        double notOrtalamasi=vize1*0.3+vize2*0.3+finalNotu*0.4;

        if (notOrtalamasi>=90){
            System.out.println("AA");
        }else if(notOrtalamasi>=85 && notOrtalamasi<90){
            System.out.println("BA");
        }else if(notOrtalamasi>=80 && notOrtalamasi<85){
            System.out.println("BB");
        }else if(notOrtalamasi>=75 && notOrtalamasi<80){
            System.out.println("CB");
        }else if(notOrtalamasi>=70 && notOrtalamasi<75){
            System.out.println("CC");
        }else if(notOrtalamasi>=65 && notOrtalamasi<70){
            System.out.println("DC");
        }else if(notOrtalamasi>=60 && notOrtalamasi<65){
            System.out.println("DD");
            
        }else if(notOrtalamasi>=55 && notOrtalamasi<60){
            System.out.println("FD");
        }else{
            System.out.println("FF");
        }

    }
}
