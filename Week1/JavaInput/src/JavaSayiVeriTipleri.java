public class JavaSayiVeriTipleri {

    public static void main(String[] args) {
	// Java da herşey bir class olduğu için input u da bir bir class içerisinden alacağız
        int a=5;//Tanımladığmız zaman bilgisayarın belleğinde bir yer kaplıyor
        int b; //Bu şekilde önce tanımlayıp daha sonra aşağıda değer de verebiliriz
        b=12;
        int toplam=a+b;
        //Değişkenlerin tiplerine göre tutabileceği max ve min değerleri bu şekilde görebiliriz...
        System.out.println("IntMaxVAlue: "+Integer.MAX_VALUE);
        System.out.println("IntMinValue "+Integer.MIN_VALUE);
        System.out.println("ByteMaxValue:"+Byte.MAX_VALUE);
        System.out.println("ByteMinValue: "+Byte.MIN_VALUE);

       //Java nın Sayısal Veri Tiplerini Otomatik Dönüştürme Sırası Bu şekildedir byte-->short-->int-->long

        short c;
        c=1000;
        int d=(c/2);//c short veri tipinde 2 yi ise java int veritipinde alacaktır burda java önce c yi otomatik olarak
        //int veri tipinde çevirir ondan sonra 2 ye bölme işlemini yapar
        int k=c;//Burda da yine önce j yi int veri tipine çevirir ondan sonra k ya eşitler
        //Ancak java nın bazen dönüştüremediği yerler olabilir
        //java küçük veri tipinden büyük veri tipine dönüştürmeyi kendisi yaparken büyük veri tipinden küçük veri tipine
        //dönüştürme işini kendisi otomatik yapmıyor onu bizim yapmamız gerekiyor ki eğer sayımız çok büyük olursa sayı
        //mızda küçük kayıplar olabilir ondan dolayı
        /*
        * Yani byte ve short tan veriyi int e java kendisi otomatik çeviriyor ama int ten veriyi short a veya byte kendisi
        * çevirmiyor belli bir kayıp olabilir diye.Unutmayalım normal doğrudan yazdığımız bir sayıyı java int olarak kabul eder
        *
        * */
        int x=100;
       // byte y=(x/2);//Altını çizerek başta uyarı verir
        //Kendimiz dönüşürme yapmak istersek
        byte y=(byte)(x/2);
        System.out.println("y nin değeri: "+ y);
        //OTOMATİK DÖNÜŞTÜRMEYE BİR ÖRNEK
        byte e=14;
        short f=26;
        int g=39;
        long h= f + e+g;//Burda önce f ve e ye bakar java birisi byte birisi short veri tipi bunları toplar ve
        // short a çevirir sonra short a çevirdği değer ile g değerini tooplar ve int e çevirir ve en sonda longa çevirir
        // byte-->short-->int-->long  otomatik çevirmeyi bu sıraya göre yapar
        System.out.println("h nin değeri : "+ h);
        //int-4byte lık 32 bitlik yer kaplar
        //byte ise 1byte lık 8bitlik yer kaplar
        //short ise 2byte lık 16 bitlik yer kaplar
        //long ise 8 byte lık 64 bit lik yer kaplar
    /*
    * Eğer ortamda hem byte hem short hem de int veri tipinden farklı değişkenlerimiz varsa o zaman java otomatikmen
    * küçükten büyüğe doğru çevirmeye çalışıyor otomatik yani hepsini int veri tipi haline getirmeye çalışıyor
    * Çünkü byte ve short veri tipinde saklanabilen her değer int veri tipinde de saklanabilir ama int veritipinde saklanan
    * değer byte veya short ile saklanamaz
    * */
//Sonuç olarak biz hemen hemen her zaman int veri tipini kullanacağız
    }
}
//Dikkat edelim system out print.line içerisinde string ile beraber int veri tiplerini de aralarına + koyarak
// kullanabiliyoruz
// System.out.println(a + " sayısı" + b+ " sayısından küçüktür"+ " toplam: "+ toplam);
//Değişken isimleri kullanırken belli kurallar vardır.Java da normalde türkçe karakter ler de hata vermez
// ama yine de biz türkçe karakter kullanmamalıyız bu önemlidir
//Değişken isim başına sayı gelmez ve java nın kullandığı keywordleri değişken olarak koymamalıyız
/*
* Değişkenler verilerimizi sakladığmız yer dir aslında java programında kullanırlıken onun için bellkte yer
*  ayrılır daha sonra program bittikten sonra bellekten silinirler
* Java da değişken tanımlarken değişkenlerin türünü de belirlememiz gerekiyor
*Bilgisayar belleğinde ram imiz var ve ram ler herbiri bir adrese karşılık gelen kutulardan oluşuyorlar ve her bir kutu
* 8 tane bölmeye ayrılıyor ve her bir kutu yu biz byte olarak düşünebilirz ve her bir byte da 8 e ayrıldığı için 8 bit oluyor
* Ve bu bitlerimiz de 0 ya da 1 değerine sahip oluyor ve böylece bizim hertürlü objelerimiz sayılarımız aslında 0 ya da
* 1 lerden oluşuyor tabi biz bunları görmüyoruz ancak bizim burda yaptığımız herbir işlem makine koduna çevriliyor gibi
* düşünebiliriz.Örneğin int bellkte 4byte lık yer kaplıyor yani 32 bitlik yer kaplıyor
* */