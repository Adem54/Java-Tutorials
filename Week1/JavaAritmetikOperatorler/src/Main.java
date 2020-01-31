public class Main {

    public static void main(String[] args) {
        System.out.println(4+3.5);//int ve double sonuç double olarak verir double a çevirir 7.5
        System.out.println(2-4f);//int ve float ile sonucu float verecektir -2.0
        System.out.println(10/4);//Burda da her ikisi de int olduğu için sonucu int verecektir ondan dolayı
        // sadece bölüm kısmını alırız
        //Ancak biz 10/4 ten 2.5 sonucunu almak istersek eğer o zaman
        System.out.println(10/4.0);
        System.out.println(10d/4);//dersek 10.0/4 demiş oluruz aslında ve double ve int sonucu double verecektir
        System.out.println(4.5*3);
        //= atama operatörüdür
        int a=4;
        // a ya yeniden bir atama yapıyoruz  ve a nın değerini güncellemiş oluyoruz
        a=a+2;
        System.out.println(a);
        a+=6;//a ya 6 eklemiş oluyoruz
        System.out.println(a);
        a*=4;  //a yı 4 ile çarpmış oluyoruz
        System.out.println(a);
        a/=2;// a yı 2 böl ve sonucu ver diyoruz
        System.out.println(a);
        a-=10;
        System.out.println(a);
        //Arttırma azaltma operatörlerini şu şekilde de yapabiliriz java da
        int b=12;
        //POSTFIX GÖSTERİM-ARTTIRMA OPERATÖRÜ
        //Bir arttırmk için kullanıılır-Postfix gösterim denilir
        b++;
        System.out.println(b);
        int c=15;
        c--;//Bir azaltmak için kullanırız
        System.out.println(c);
        //PREFIX GÖSTERİM-ARTTIRMA OPERATÖRÜ
        int d=20;
        ++d;//Bir arttırır
        System.out.println("d: "+d);
        int e=30;
        --e;//Bir azaltır
        System.out.println("e: "+e);
        //POSTFIX-PREFIX FARKI
        int f=10;
        System.out.println("f: "+f++);//Burda(postfix) hemen artmaz bir alt satır da f ile işlem yapmaya başladığımız anda
        //arttığnı görebiliriz ancak doğrudan arttırma yaptığımız satırda artmayacaktır
        int g;
        g=f;
        System.out.println("g: "+g);
        System.out.println("Newg: "+  ++g);//(prefix)Doğrudan gösterddiğmiz satırda değeri artıyor
        int h=15;
        //Dikkat
        System.out.println("h: "+  h+1);//String ve int değerleri birleştirdiimizden dolayı hepsini String e çevirecektir
        // String birleştirmesi ile işlem yapacaktır

        //İŞLEM SIRASI
        //Normal matematikteki gibi ilk sıra da herzaman parantez işlemler yapılırıd daha sonra ise çarpma ve bölme
        // toplama ve çıkarmaya göre önceliği vardır.Bu mantığımız aynen devam etmeli hatta kafamızın karıştırdğı yerde
        //işlemlerimizi paranteze almalıyız.Hangisinin önce yapılmasını istersek onu paranteze alırız

        System.out.println(3f/4+3*5);//Burda da float türünde veri ile int arasında işlemlerimiz yapıldığı için
        // işlemlerimizin sonucu da bize float türünde gelecektir otomatik dönüştürmeyi java yapacaktır nitekim
        // int ve float ya da double olduğu zaman java önce int den float a sonra da float dan double a çevirme
        // işlemini kendisi yapıyordu zaten

    }
}
