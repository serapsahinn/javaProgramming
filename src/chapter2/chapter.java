package chapter2;

import java.util.Scanner;

public class chapter
{
    public static void main(String[] args)
    {
/*
        //daırenın alanı pr2
        double pi=Math.PI;
        System.out.print("Dairenin yarıçapını girin: ");
        Scanner scanner=new Scanner(System.in);
        double r = scanner.nextDouble();
        double alan= pi*Math.pow(r,2);
        System.out.println(alan);

        // 3 sayı ortalama
        System.out.println("1. sayıyı gırınız");
        Scanner scanner1= new Scanner(System.in);
        double sayı1=scanner1.nextDouble();

        System.out.println("2. sayıyı giriniz");
        Scanner scanner2= new Scanner(System.in);
        double sayı2=scanner2.nextDouble();

        System.out.println("3. sayıyı gırnız ");
        Scanner scanner3= new Scanner(System.in);
        double sayı3= scanner3.nextDouble();

        double ortalama= (sayı1+sayı3+sayı2)/3;
        System.out.println("sayıların ortalması: "+ortalama);

//


        double miles=100;
        final double KILOMETERS_PER_MILE =1.6;
        double kilometre=miles*KILOMETERS_PER_MILE;
        System.out.println(kilometre);

        System.out.println("sanıye cınsınden sayı gırınız");
        Scanner sc = new Scanner(System.in);
        int seconds=sc.nextInt();
        int dakika= seconds /60;
        int kalanssecond= seconds % 60;
        System.out.println(seconds+" ve " +dakika+" ve "+ kalanssecond);


       // Eğer bugün Salı ise, 100 gün sonra hangi gün olacak?
        int nb=2;
        int n2=100;
        int sonuc = (nb+n2)%7;
        System.out.println(sonuc);
*/


       /* System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);*/

        /*
        //derece cevırme
        System.out.println("bir değer girin");
        Scanner input= new Scanner(System.in);
        int fahrenheit= input.nextInt();
        int celsius =(5 / 9) * (fahrenheit - 32);
        System.out.println(celsius);
*/

        /* double result =  Math.pow(2, 35);
        System.out.println("2^35: " + result);*/
       // int m= 5;
        //int r=4;
        //double result = Math.pow(r,2);
        //System.out.println("mr^2"+m*result);

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("para miktarını kuruş cinsinden girin ");
        int toplamKurus = input.nextInt();

        int lira = toplamKurus / 100;
        int kalanKurus = toplamKurus % 100;

        int elliKurus = kalanKurus / 50;
        kalanKurus = kalanKurus % 50;

        int yirmiBesKurus = kalanKurus / 25;
        kalanKurus = kalanKurus % 25;

        int onKurus = kalanKurus / 10;
        kalanKurus = kalanKurus % 10;

        int besKurus = kalanKurus / 5;
        kalanKurus = kalanKurus % 5;

        int birKurus = kalanKurus;

        System.out.println("Toplam: " + lira + " TL " + (toplamKurus % 100) + " kuruş");
        System.out.println("Banknot ve bozuk para dağılımı:");
        System.out.println("Lira: " + lira);
        System.out.println("50 kuruş: " + elliKurus);
        System.out.println("25 kuruş: " + yirmiBesKurus);
        System.out.println("10 kuruş: " + onKurus);
        System.out.println("5 kuruş: " + besKurus);
        System.out.println("1 kuruş: " + birKurus);
         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi girin ");
        double mesafe = input.nextDouble();

        System.out.print("Arabanın yakıt tüketimini girin ");
        double kmBasinaTuketim = input.nextDouble();

        System.out.print("Benzin fiyatını girin");
        double litreFiyat = input.nextDouble();

        //toplam maliyet
        double toplamLitre = mesafe * kmBasinaTuketim;
        double toplamMaliyet = toplamLitre * litreFiyat;
        System.out.printf("Yolculuğun toplam maliyeti: %.2f TL", toplamMaliyet);

         */
        /*
//(Finansal uygulama: gelecekteki yatırım değerini hesaplama)
        Scanner input = new Scanner(System.in);
        System.out.print("YATIRIM TUTARI GİRİNİZ ");
        double yatirimTutari = input.nextDouble();

        System.out.print("Yıllık faiz oranını yüzde olarak girin : ");
        double faizoOrani =input.nextDouble();

        System.out.print("Yıl sayısını girin : ");
        double yılSayisi = input.nextDouble();

        double aylikFaizOrani = faizoOrani / 100 / 12;

        double gelecektekiYatirim = yatirimTutari * Math.pow(1 + aylikFaizOrani, yılSayisi * 12);
        System.out.println(gelecektekiYatirim);
         */

        //(Finansal uygulama: faiz hesaplama) Bakiyeyi ve yıllık faizi biliyorsanız
        //yüzde faiz oranını kullanarak, aşağıdaki formülü kullanarak bir sonraki aylık ödemenin faizini hesaplayabilirsiniz:
        //faiz = bakiye * (yıllık faiz oranı/1200)
        //Bakiyeyi ve yıllık faiz oranını okuyan bir program yazın ve
        //bir sonraki ay için faiz oranını gösterir. İşte örnek bir çalışma:
        //Bakiye ve faiz oranını girin (örneğin, %3 için 3): 1000 3.5
        //Faiz oranı 2,91667

        Scanner input= new Scanner(System.in);
        System.out.print("bakiyeyi giriniz : ");
        double bakiye=input.nextDouble();

        System.out.print(" yıllık faiz oranı : ");
        double yillikFaizOranı=input.nextDouble();

        double aylikFaziOranı=yillikFaizOranı/1200;

        double faiz= bakiye*aylikFaziOranı;
        System.out.print("bir sonraki ay faiz hesaplama "+ faiz);




    }

}
