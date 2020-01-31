public class JavaOndalikVeriTipi {

    public static void main(String[] args) {
        //Java Otomatik Çevirme Sırası Küçükten Büyüğe tam sayıdan Ondalık sayıyadır
        // int-->float-->double
        //double-8byte-64bit
        //float:4byte-32bit
	double a =4.25;
	double d=3.0;
	double b=3.14d ;// burda d double ı simgeliyor bu şekilde de yazılabilir
    double c=5d;//5.0 gelir
        System.out.println("a "+a);
        System.out.println("d: "+ d);
        System.out.println("b: "+ b);
        System.out.println("C nin değeri "+ c);
    //double ile yukardaki gibi ondalık sayıları tanımlayabiliriz
        //Ancak float ta double daki gibi tanımlayamıyoruz doğrudan
        float x=(float)(5.0);//Doğrudan 5.0 yazınca bunu java double olarak algılıyor veya yazdğığımız herhangi bir
        // Ondalıklı ifadeyi double olarak algılıyor ondan dolayı biz float a çevirmezsek o zaman hata alırız
        float y=(float)(8.2);
        //Ya da şu şekilde tanımlarız
        float z=4.7f;
        float m=2.45f;
        System.out.println("z: "+z);
        System.out.println("m: "+m);
//double ile biz doğrudan kullanabildiğimiz için daha çok double kullanmayı tercih edebiliriz
        int ab=22/7;
        float ac=22f/ 7f;
        double ad=22d/7d;
        System.out.println("ab: "+ab);//ab: 3 ab integer veri tipi olduğu için ondalık kısmı atacaktır
        System.out.println("ac: "+ac);//ac: 3.142857
        System.out.println("ad: "+ad);//ad: 3.142857142857143
//En uzun ve detaylı ve sağlıklı sonucu double da alırız çünkü kapladığı alan daha büyük olduğu için sonucu
// uzun olacak şekilde verecektir
        //Peki int i float veya double a otomatik dönüştürme nasıl olur ona bakalım
        //Java nın Otomatik Dönüştürme Sırası int-->float-->double şeklinde ise zaten java dönüşümü yapacaktır ancak
        // tersi durumlarda dönüşümü biz yapmalıyız
        int i=5;
        float j=i; //Dersek
        double k=i;//Yine 5.0 sonucunu alırız kendisi otomatik dönüştürecektir
        System.out.println("j: "+j);//5.0 sonucunu alırız
        double bc=3.12;
        float bd=(float)(bc);//Burda double ı float a çevirmeye çalışacak java ama bunu yapmayacak
        //Neden java bunu kendisi çevirmiyor çünkü double dan float a çevirince belli bir kayıp olabilir çünkü
        // bazen ondalık kısmı çok uzun olabilir bu da float yetersiz gelebilir ve veri kaybı yaşanabilr ondan dolayı
        // otomatik çevirme ye ters bir mantık çünkü ondan dolayı bizim çevirmemiz gerekecek
        System.out.println("bd:"+bd);
        //Java Otomatik Çevirme Sırası Küçükten Büyüğe tam sayıdan Ondalık sayıyadır
        // int-->float-->double
         double a1=70.4;
         double a2=65d;
         double a3=80.3;
        System.out.println("Ortalama1: "+(a1+a2+a3)/3);//Ortalama1: 71.89999999999999
        //Burdaki işlem de de double ile int işlemi vardır
        // ve işlemi yapıp sonucu double a java kendisi çevirecektir
        float a4=70.4f;
        float a5=65f;
        float a6=80.3f;
        System.out.println("Ortalama2: "+ (a4+a5+a6)/3);//Ortalama2: 71.9
        //Burda da float ve int ile işlem yapıyoruz ondan dolayı int ile float ta
        // java float a çevirir sonucu float tipinde alırız

    }
}
