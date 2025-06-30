package chapter3;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class chapter
{
    public static void main(String[] args)
    {
             /*   int number1 = (int)(System.currentTimeMillis() % 10);
                int number2 = (int)(System.currentTimeMillis() / 7 % 10);
                Scanner input = new Scanner(System.in);
                System.out.print( number1 + " + " + number2 + "? ");
                int answer = input.nextInt();
                System.out.println( (number1 + number2));

                Scanner ınput = new Scanner(System.in);
                System.out.print("Bir tam sayı girin: ");
                int number = ınput.nextInt();
                if (number % 5 == 0) {
                    System.out.println("HiFive");
                }
                if (number % 2 == 0) {
                    System.out.println("HiEven");
                }

              */
/*
        System.out.println("sayı gırınız ");
        Scanner input= new Scanner(System.in);
        int num =input.nextInt();

        if (num % 2 ==0)
        {
            System.out.println("hıEven");
        } else if (num% 5==0) {
            System.out.println("hıFive");
        }

 */
        /*
        int piyango= (int) (Math.random()*100);
        Scanner input = new Scanner(System.in);
        System.out.println("2 basamaklı bır sayı gırınız ");
        int num= input.nextInt();

        if (num == piyango)
        {
            System.out.println("kazandınız odul 100000");
        }
         */

        /*
        Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println((x < y && y < z) ? "sorted" : "not sorted");

         */
        //rastgele sayı uretme ogrencının cevabı kontrol etme
      /*  int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("" + number1 + " - " + number2 + " kaçtır? ");
        int cevap = input.nextInt();

        int dogruCevap = number1 - number2;
        if (cevap == dogruCevap) {
            System.out.println("Tebrikler! Doğru cevap.");
        } else {
            System.out.println("Üzgünüm, yanlış cevap. Doğru cevap: " + dogruCevap);
        }

       */

/*
// artan yıl
        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl girin: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }

 */

        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        switch (year % 12) {
             case 0: System.out.println("monkey"); break;
             case 1: System.out.println("rooster"); break;
             case 2: System.out.println("dog"); break;
             case 3: System.out.println("pig"); break;
             case 4: System.out.println("rat"); break;
             case 5: System.out.println("ox"); break;
             case 6: System.out.println("tiger"); break;
             case 7: System.out.println("rabbit"); break;
             case 8: System.out.println("dragon"); break;
             case 9: System.out.println("snake"); break;
             case 10: System.out.println("horse"); break;
             case 11: System.out.println("sheep");
        }

         */
        /*
        // 2x2 doğrusal denklemleri Cramer kuralına gore
        Scanner input = new Scanner(System.in);
        System.out.print("a değerini girin: ");
        double a = input.nextDouble();
        System.out.print("b değerini girin: ");
        double b = input.nextDouble();
        System.out.print("c değerini girin: ");
        double c = input.nextDouble();
        System.out.print("d değerini girin: ");
        double d = input.nextDouble();
        System.out.print("e değerini girin: ");
        double e = input.nextDouble();
        System.out.print("f değerini girin: ");
        double f = input.nextDouble();
        double determinant = a * d - b * c;
        if (determinant == 0) {
            System.out.println("Denklemin çözümü yok.");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("Çözüm: x = " + x + ", y = " + y);
        }
         */

       /*
        int width = 100;
        int height = 200;
        // Rastgele x ve y koordinatları üretme
        int x = (int)(Math.random() * width) - width / 2;
        int y = (int)(Math.random() * height) - height / 2;
        System.out.println("Rastgele nokta: (" + x + ", " + y + ")");
        */
        // ucgenın cevresı
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı girin: ");
        double side1 = input.nextDouble();
        System.out.print("İkinci kenarı girin: ");
        double side2 = input.nextDouble();
        System.out.print("Üçüncü kenarı girin: ");
        double side3 = input.nextDouble();

        // Üçgen olma koşulunu kontrol etme
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            double perimeter = side1 + side2 + side3;
            System.out.println("Üçgenin çevresi: " + perimeter);
        } else {
            System.out.println("Geçersiz giriş: Bu kenarlarla üçgen oluşturulamaz.");
        }
         */

        //(Rastgele ay) 1 ile 12 arasında rastgele bir tamsayı üreten ve buna göre 1, 2, ..., 12 sayıları için
        //Ocak, Şubat, ..., Aralık İngilizce ay adlarını görüntüleyen bir program yazın.
        /*
        int num = (int)(Math.random() * 12);
        switch (num)
        {case 1:
            System.out.println("ocak");
            break;
            case 2: System.out.println("subat");break;
            case 3: System.out.println("mart");break;
            case 4: System.out.println("nısan");break;
            case 5: System.out.println("mayıs");break;
            case 6: System.out.println("hazıran");break;
            case 7: System.out.println("temmuz");break;
            case 8: System.out.println("agustos");break;
            case 9: System.out.println("eylül");break;
            case 10 : System.out.println("ekim");break;
            case 11: System.out.println("kasım");break;
            default: System.out.println("aralık");
        }

         */
        /*

        System.out.println("bir sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("sonrakı gun için bir sayı gırınız");
        int num2= input.nextInt();
        int  gun = (num + num2) % 7;
        switch (num)
        {
            case 0:
                System.out.println("pazar"); break;
            case 1:
                System.out.println("pazartesi"); break;
            case 2:
                System.out.println("salı"); break;
            case 3:
                System.out.println("carsamba"); break;
            case 4:
                System.out.println("perşembe"); break;
            case 5:
                System.out.println("cuma"); break;
            default:
                System.out.println("cumartesi");
        }
        switch (gun)
        {
            case 0:
                System.out.println("pazar"); break;
            case 1:
                System.out.println("pazartesi"); break;
            case 2:
                System.out.println("salı"); break;
            case 3:
                System.out.println("carsamba"); break;
            case 4:
                System.out.println("perşembe"); break;
            case 5:
                System.out.println("cuma"); break;
            default:
                System.out.println("cumartesi");
        }

         */

/*
        System.out.println("sayı gırınız ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3)
                System.out.println(num1 + " " + num2 + " " + num3);
            else
                System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3)
                System.out.println(num2 + " " + num1 + " " + num3);
            else
                System.out.println(num2 + " " + num3 + " " + num1);
        } else {
            if (num1 >= num2)
                System.out.println(num3 + " " + num1 + " " + num2);
            else
                System.out.println(num3 + " " + num2 + " " + num1);
        }

 */

        /*
        //  1 = As, 11 = Vale, 12 = Kız, 13 = Papaz
        String[] degerler = {
                "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kız", "Papaz"
        };

        // Kart türleri: Maça, Karo, Kupa, Sinek
        String[] turler = {
                "Maça", "Karo", "Kupa", "Sinek"
        };
        //ragele bır sayı
        Random rastgele = new Random();
        int kartNumarasi = rastgele.nextInt(52);

        // kart deger ve turu
        int degerIndex = kartNumarasi % 13;
        int turIndex = kartNumarasi / 13;

        String kartDegeri = degerler[degerIndex];
        String kartTuru = turler[turIndex];
        System.out.println("Çektiğiniz kart: " + kartDegeri + " - " + kartTuru);
         */

        /*
        //Denkelemın kokunu bulma
        Scanner scanner= new Scanner(System.in);
        System.out.print("a değerini giriniz : ");
        double a = scanner.nextDouble();

        System.out.print("b degerini girinzi : ");
        double b= scanner.nextDouble();
        System.out.print(" c degeriini giriniz : ");
        double c =scanner.nextDouble();

        double discriminant=Math.pow(b,2)-4*a*c;
        if (discriminant > 0)
        {
            double r1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            double r2 =-(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
            System.out.println("denklemın iki kökü var : " +"r1  "+ r1 + "  r2  "+ r2);
        } else if (discriminant == 0)
        {
            double r = -b / (2 * a);
            System.out.println("denklemın cıft katlı koku vardır : "+ r);
        }else
        {
            System.out.println("denklemın koku yok ");
        }
        scanner.close();

         */
        /*
        // rastgele sayı üretme ve dogru yanlıs kontrol
        int num1= (int)(Math.random() * 10);
        int num2 =(int)(Math.random() * 10);
        int num3 =(int)(Math.random() *10);

        int snc= num1+ num2+num3;
        System.out.print("Sayıların toplamı giriniz : ");
         Scanner scanner= new Scanner(System.in);
        int k1=scanner.nextInt();
        if (k1==snc)
        {
            System.out.println("toplam dogru : ");
        }else
        {
            System.out.println("yanlış gerçek toplam : "+ snc );
        }
         */
        //cramer kuralına gore cozum
        Scanner scanner= new Scanner(System.in);
        System.out.print("sayı giriniz :");
        int a= scanner.nextInt();
        System.out.print("sayı giriniz :");
        int b= scanner.nextInt();
        System.out.print("sayı giriniz :");
        int c= scanner.nextInt();
        System.out.print("sayı giriniz :");
        int d= scanner.nextInt();
        System.out.print("sayı giriniz :");
        int e= scanner.nextInt();
        System.out.print("sayı giriniz :");
        int f= scanner.nextInt();

        int snc=  (a*d - b*c);
        if (snc==0)
        {
            System.out.println("denklemın cozumu yok ");
        }else
        {
            System.out.println("denklemın çözümü : ");

            System.out.println("x:" +(e*d - b*f) / snc);
            System.out.println("y:"+  (a*f - e*c) / snc);
        }



    }
}
