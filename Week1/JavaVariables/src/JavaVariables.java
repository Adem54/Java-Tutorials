public class JavaVariables {

    public static void main(String[] args) {
	// Java da Değişken Tipleri
        /*
        * byte---> sayı ,1 byte lık
        * short--->sayı ,2 byte lık
        * int---->sayı, 4 byte lık
        * long ---->sayı ,8 byte lık
        * float --->ondalıklı sayı , 4 byte
        * double --->ondalıklı sayı 8 byte
        * char ----->karakter ,2 byte
        * boolean -----> true yada false , 1 byte
        * String--->text tipi veriler için kullanılır ama tam değişken denmeyebilir
        * */
        int a=45;
        short b=32;
        double pi=3.14;
        char c='C';//Çift tırnak olursa String ile kullan diyor tek tırnak
        // olursa chaar ile kullanmaya ok diyor
        String myChar="Ahmet";
        boolean d=true;
        System.out.println(a + " sayısı "+ b + " sayısından büyüktür");

    }
}
