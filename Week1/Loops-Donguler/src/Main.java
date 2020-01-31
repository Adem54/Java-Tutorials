public class Main {

    public static void main(String[] args) {
        //Her döngüde 2 katını dönderiyoruz
        for (int m=1;m<100;m*=2){
            System.out.println("m: "+m);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int j;
        for (j=1; j<5;j++){
            System.out.println(j);
        }

        int a;
        for (a=10; a>=1;a--){
            System.out.println("a: "+a);
        }

        int b=0; //değişken değerini dışarda vererek de kullanabiliriz...
        for (;b<5;b++){
            System.out.println("b: "+b);
        }

        int k=10;
        int l=0;

        for (;k>0 && l<10;k--,l++){
            System.out.println("k: "+k);
            System.out.println("l: "+l);
        }

    }
}
