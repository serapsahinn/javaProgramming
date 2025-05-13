package chapter4;

import java.util.Scanner;

public class chapter4
{
    public static void main(String[] args) {


        /*
        Scanner input = new Scanner(System.in);
        //   r al
        System.out.print("Merkezden bir tepe noktasına kadar olan uzunluğu girin: ");
        double r = input.nextDouble();
        // alan begnenın(s = 2r * sin(π/5))
        double s = 2 * r * Math.sin(Math.PI / 5);
        //  alanını hesapla (Area = 5 * s^2 / (4 * tan(π/5)))
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

       */

        /*
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan bir hex karakter girmesini iste
        System.out.print("Enter a hex digit (0-9, A-F): ");
        String hex = input.next().toUpperCase(); // Küçük harf girdilerini de büyük harfe çevir

        // Girilen değerin geçerli olup olmadığını kontrol et
        if (hex.length() == 1 && ((hex.charAt(0) >= '0' && hex.charAt(0) <= '9') || (hex.charAt(0) >= 'A' && hex.charAt(0) <= 'F'))) {
            // Hexadecimal karakteri integer'a çevir
            int decimalValue = Integer.parseInt(hex, 16);
            // Binary'ye çevir ve ekrana yazdır
            String binaryValue = Integer.toBinaryString(decimalValue);
            System.out.println( binaryValue);
        }

         */
/*

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().toLowerCase().charAt(0);  // Küçük harf olarak al
        //  unlu veya ünsüz kontrolü
        if ((letter >= 'a' && letter <= 'z')) {  // Harf olup olmadığını kontrol et
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
 */

/*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade (A, B, C, D, F): ");
        char grade = input.next().toUpperCase().charAt(0);  // Küçük harf girilse bile büyük harfe dönüştürülür
        // Harf notunu sayısal değere çevir
        int numericValue = 0;
        switch (grade) {
            case 'A':
                numericValue = 4;
                break;
            case 'B':
                numericValue = 3;
                break;
            case 'C':
                numericValue = 2;
                break;
            case 'D':
                numericValue = 1;
                break;
            case 'F':
                numericValue = 0;
                break;
            default:
                System.out.println("Lütfen geçerli bir harf notu girin");
                return;
        }
         System.out.println( grade + " is " + numericValue + ".");


 */
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı girin: ");
        int yil = input.nextInt();

        System.out.print("Ayı gırın  ");
        String ay = input.next();

        int gunSayisi;

        switch (ay) {
            case "Ocak": gunSayisi = 31; break;
            case "subat":
                if ((yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0)) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            case "mart": gunSayisi = 31; break;
            case "nisan": gunSayisi = 30; break;
            case "mayıs": gunSayisi = 31; break;
            case "hazıran": gunSayisi = 30; break;
            case "temmuz": gunSayisi = 31; break;
            case "Agustos": gunSayisi = 31; break;
            case "eylül": gunSayisi = 30; break;
            case "ekim": gunSayisi = 31; break;
            case "kasım": gunSayisi = 30; break;
            case "aralık20": gunSayisi = 31; break;
            default:
                System.out.println("Geçersiz ay girişi!");
                return;
        }
        System.out.println(ay + " " + yil + " ayı " + gunSayisi + " gün içerir.");
         */

    }
}
