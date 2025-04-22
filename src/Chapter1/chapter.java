package Chapter1;

public class chapter
{
    public static void main(String[] args)
    {
        //1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        //2
        for (int i=1;i<6;i++)
        {
            System.out.println("welcome to java");
        }

        //3
        System.out.println("J     A     V     V     A");
        System.out.println("J    A A     V   V    A A");
        System.out.println("J J  AAAAA    V V    AAAAA");
        System.out.println(" JJ  A   A     V     A   A");


        //4
        for (int i = 1; i <= 4; i++) {
            System.out.println(i +  + (i * i) +  + (i * i * i));
        }

        //5
        double pay = (9.5 * 4.5) - (2.5 * 3);
        double payda = 45.5 - 3.5;
        double sonuc = pay / payda;

        System.out.println("İfadenin sonucu: " + sonuc);

        //6
        int toplam = 0;
        for (int i = 1; i <= 9; i++) {
            toplam += i;
        }
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + toplam);

        //7 Pi sayısını yaklaşık olarak hesaplayan
        // İlk seri (5 terimli)
        double seri1 = 1.0;
        seri1 = seri1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11);
        double pi1 = 4 * seri1;

        // İkinci seri (6 terimli)
        double seri2 = 1.0;
        seri2 = seri2 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13);
        double pi2 = 4 * seri2;

        // Sonuçları yazdıralım
        System.out.println("5 terimli seri ile π yaklaşık değeri: " + pi1);
        System.out.println("6 terimli seri ile π yaklaşık değeri: " + pi2);
        System.out.println("Gerçek π değeri: " + Math.PI);



        //8 Yarıçapı 5.5 olan bir dairenin çevre ve alanını
        double yaricap = 5.5;
        double pi = Math.PI;

        // cevre ve alan
        double cevre = 2 * yaricap * pi;
        double alan = yaricap * yaricap * pi;

        System.out.println("Dairenin özellikleri:");
        System.out.println("Yarıçap: " + yaricap);
        System.out.printf("Çevre: ", cevre);
        System.out.printf("Alan:", alan);

        //9 Genişliği 4.5 ve yüksekliği 7.9 olan bir dikdörtgenin alan ve çevresini
        double genislik = 4.5;
        double yukseklik = 7.9;

        // alan ve cevre
        double alann = genislik * yukseklik;
        double cevree = 2 * (genislik + yukseklik);

        // Sonuçları yazdıralım
        System.out.println("Dikdörtgenin özellikleri:");
        System.out.println("Genişlik: " + genislik);
        System.out.println("Yükseklik: " + yukseklik);
        System.out.printf("Alan: ", alann);
        System.out.printf("Çevre:", cevree);

        //10 Bir koşucunun ortalama hızını hesaplayan
        double kilometre = 14.0;
        double dakika = 45.0;
        double saniye = 30.0;
        double kmToMile = 1.6; // 1 mil = 1.6 km

        // zaman ı saat cınsıne cevrılıyo
        double toplamSaat = (dakika + saniye/60) / 60;

        // km mıl e
        double mil = kilometre / kmToMile;

        // Ortalama hız: (mil/saat)
        double ortalamaHiz = mil / toplamSaat;

        System.out.println("Ortalama Hız: " + String.format("%.2f", ortalamaHiz) + " mil/saat");

        //11
        // Başlangıç nüfusu
        double nüfüs = 312032486;

        // sn cınsınden yıllık degısımmler
        double  saniyeYılIçinde = 365.0 * 24 * 60 * 60;
        double YılBaşınaDoğum = saniyeYılIçinde / 7;
        double  YılBaşınaÖlüm= saniyeYılIçinde / 13;
        double YılBaşınaGöçmen = saniyeYılIçinde / 45;

        // 5 yıl için
        for (int year = 1; year <= 5; year++) {
            nüfüs += YılBaşınaDoğum + YılBaşınaGöçmen -  YılBaşınaÖlüm;
            System.out.printf(" yıl nüfusu:", year, nüfüs);

        }

        //12
        // mesefeyı km cınsıne cevırme
        double miles = 24;
        double kilometers = miles * 1.6;

        //zaman saat e cevırme
        double hours = 1;
        double minutes = 40.0 / 60;    // 40 dakikayı saate çevirme
        double seconds = 35.0 / 3600;  // 35 saniyeyi saate çevirme
        double totalsaat = hours + minutes + seconds;

        // ortalama hız (km/saat)
        double ortalama= kilometers / totalsaat;

        System.out.printf("Ortalama hız:  kilometre/saat",ortalama);

        //13
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;

        // Determinant (ad - bc) hesaplama
        double determinant = a * d - b * c;

        // x ve y değerlerini hesapkama
        double x = (e * d - b * f) / determinant;
        double y = (a * f - e * c) / determinant;

        // Sonuçları yazdırma
        if (determinant == 0) {
            System.out.println("Denklem sisteminin çözümü yok (determinant = 0)");
        } else {
            System.out.printf("x", x);
            System.out.printf("y ", y);

    }}

}
