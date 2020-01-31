public class Main {

    public static void main(String[] args) {
	//String veri tipi ilkel olmayan veritipidir yani normalde gördüğümüz int,byte,short,long gibi sayı veri tipleri
        //veya double,float gibi ondalık sayı veri tipleri ya da char ,boolean gibi karakter ve true false veritipleri
        //ilkel veri tipleridir
        //Ancak String veri tipi ilkel veri tipi değildir ilkel olmayan veri tipidir
        //İlkel veri tipi demek üzerinde hiçbirmethod bulunmayan veri tipi demektir
        //Stringler üzerinde bazı methodlar var ve o methodlarla biz string ler i tanımlarız
        String a="Merhaba";
        System.out.println(a+ " Hoşgeldiniz!");//Bu şekilde stringleri yazabiliyoruz
        String b="Java ";
        String d="Programlama";
        String c=" Dersi";
        String toplam=b+d+c;
        System.out.println(toplam);//Ayrıca bu şekilde de stringleri birleştirebiliyoruz
      //Java Otomatik Brileştirmesi int-->String e doğrudur
        int ab=42;
        String bc="Merhaba";
        System.out.println(ab+bc);//42Merhaba
        //int ve string değerleri alıp stringe çeviriyor java burda
        byte ac=12;
        double ad=3.14;
        float ae=2.4f;
        String af="Hoşgeldin Java";
        //Aşağıda bir atama işlemi var ilk önce sağ taraf hesaplanır daha sonra sol taraf hesaplanıyor
        af=ac+ae+ad+af;//
        //Önce int ve float toplanır float olarak toplar java sonra float ve double toplanır double olarak toplar
        // java ardından da String le toplanır bu sefer de String olarak topluyor java
        System.out.println(af);
        //Aynı şekilde char ile String toplanırsa da String olarak otomatik birleştirme yapacak java
        char ag='?';
        String ah="Merhaba Nasılsın";
        System.out.println(ah+ag);

        //  \t ile ters slaş t ile bir tab kadar boşluk koyabiliriz
        String ai="Java\tProgramlama\tDili";
        System.out.println(ai);
        // \n ile newline bir alt satıra geçer
        String aj="Java\nProgramlama\nDili";
        System.out.println(aj);



    }
}
