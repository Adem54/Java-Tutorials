public class Main {

    public static void main(String[] args) {
        //char veri tipi bellekte 2byte lık yer ve 16 bitlik yer kaplıyor yani 2^16 tane karakter
        // direk olarak char veritipi ile gösterilebiliyor
        //boolean ise true ve false ile koşul durumlarında kullanırız
        //char veri tipinde sadece tek karakter tanımlayabiliriz birden fazla karakter tanımlamak istersek
        // o zaman hata alırız
        //Ayrıca char veritipinde tek tırnak ile kullanırız
        char a='A';//
        char b='B';
        //char c='12';//yanlış çünkü birden fazka karakter var
        //2^16 tane karakter char veri tipi ile simgelenebiliyor.Yani 0 dan başlayarak 2^16 ya kadar giden
        // her bir sayımız  char karakterimize denk geliyor
        //Bunu hemen örnek ile görelim
        char c=1999;//2^16 ya kadar giden sayılardan 1999 sayılı char karakterini getirir
        char d=1000;//2^16 ya kadar giden sayılardan 1000 sayılı char karakterini getirir
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        //Dünya üzerindeki tüm karakterler bu char veri tipi ile simgelenebilir

        //Peki kendimize özel karakterler bulmak istersek onları nasıl buluruz
        //https://unicode-table.com/ sitesinde ki karakterlerin üzerine tıklayıp unicode u kopyalayıp aşağıdaki gibi kullanabiliriz
        char e='\u071B';//U+071B burayı kopyalayıp harfi ters slaş yaptıktan sonra yazarsak o zaman o karakteri alabiliriz
        System.out.println("e: "+e);
        //Boolean veri tipi
        boolean abc=true;
        boolean bcd=false;
        System.out.println(abc);
        System.out.println(bcd);
    }
}
