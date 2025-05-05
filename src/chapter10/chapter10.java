package chapter10;

import java.util.Scanner;

public class chapter10
{
    public static void main(String[] args) {

       /*
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir tamsayı girin: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int n = number;
        int factor = 2;

        // Asal çarpanlara ayırma
        while (n > 1) {
            if (n % factor == 0) {
                stack.push(factor);  // küçükten büyüğe stack e eklenir
                n /= factor;
            } else {
                factor++;
            }
        }

        // büyükten küçüğe ekrana yazdırma
        System.out.print(number + " sayısının asal çarpanları : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

        */

        /*
        StackOfIntegers stack = new StackOfIntegers();

        // 120'den küçük asal sayıları bul ve stack'e ekle
        for (int i = 2; i < 120; i++) {
            if (isPrime(i)) {
                stack.push(i); // küçükten büyüğe ekleniyor
            }
        }

        // büyükten küçüğe ekrana yazdır
        System.out.print("120'den küçük asal sayılar (azalan sıra): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    // Asal kontrol fonksiyonu
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

         */
        /*
        Course course = new Course("Java Programming");

        // Öğrenci ekleme
        course.addStudent("Ali");
        course.addStudent("Ayşe");
        course.addStudent("Mehmet");

        // Bir öğrenciyi sil
        course.dropStudent("Ayşe");

        System.out.println("Kursta kalan öğrenciler:");
        String[] students = course.getStudents();
        for (String s : students) {
            System.out.println(s);
        }

        // Tümünü temizle
        course.clear();
        System.out.println("Tüm öğrenciler silindi. Toplam öğrenci sayısı: " + course.getNumberOfStudents());

         */



    }
}



