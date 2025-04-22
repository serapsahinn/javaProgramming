package chapter7;

import java.util.Scanner;

public class chapter7
{

    /*

    public class AssignGrades {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // 1. Öğrenci sayısını al
            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();

            int[] scores = new int[numberOfStudents]; // Dizi oluştur
            int best = 0; // En yüksek not

            // 2. Bütün notları al ve en yüksek notu bul
            System.out.print("Enter " + numberOfStudents + " scores: ");
            for (int i = 0; i < numberOfStudents; i++) {
                scores[i] = input.nextInt();
                if (scores[i] > best) {
                    best = scores[i];
                }
            }

            // 3. Notları yazdır
            for (int i = 0; i < numberOfStudents; i++) {
                char grade;

                if (scores[i] >= best - 10)
                    grade = 'A';
                else if (scores[i] >= best - 20)
                    grade = 'B';
                else if (scores[i] >= best - 30)
                    grade = 'C';
                else if (scores[i] >= best - 40)
                    grade = 'D';
                else
                    grade = 'F';

                System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
            }
        }
    }


     */

  /*

    public class ReverseNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[10];

            // 10 sayı al
            System.out.print("Enter 10 integers: ");
            for (int i = 0; i < 10; i++) {
                numbers[i] = input.nextInt();
            }

            // Ters sırayla yazdır
            System.out.print("Numbers in reverse order: ");
            for (int i = 9; i >= 0; i--) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

   */
   /*

    public class CountOccurrences {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] counts = new int[101]; // 0–100 arası (0 kullanılmaz)

            System.out.println("Enter numbers between 1 and 100 (end with 0):");

            while (true) {
                int number = input.nextInt();

                if (number == 0) break; // Giriş bitişi

                if (number >= 1 && number <= 100) {
                    counts[number]++;
                }
            }

            // Sayıların tekrarını yazdır
            for (int i = 1; i <= 100; i++) {
                if (counts[i] > 0) {
                    System.out.println(i + " occurs " + counts[i] +
                            (counts[i] == 1 ? " time" : " times"));
                }
            }
        }
    }


    */
/*

    public class AnalyzeScores {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double[] scores = new double[100];
            int count = 0;
            double total = 0;

            System.out.println("Enter scores (negative number to end):");

            // Giriş al
            while (true) {
                double score = input.nextDouble();
                if (score < 0) break;
                scores[count] = score;
                total += score;
                count++;
            }

            double average = total / count;
            int aboveOrEqual = 0;
            int below = 0;

            // Ortalama ile karşılaştır
            for (int i = 0; i < count; i++) {
                if (scores[i] >= average)
                    aboveOrEqual++;
                else
                    below++;
            }

            System.out.println("Average is: " + average);
            System.out.println("Number of scores >= average: " + aboveOrEqual);
            System.out.println("Number of scores < average: " + below);
        }
    }

 */
 /*
    public class DistinctNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] numbers = new int[10];
            int[] distinct = new int[10];
            int count = 0;

            System.out.print("Enter 10 numbers: ");
            for (int i = 0; i < 10; i++) {
                int num = input.nextInt();
                boolean isNew = true;

                // Daha önce girilmiş mi kontrol et
                for (int j = 0; j < count; j++) {
                    if (num == distinct[j]) {
                        isNew = false;
                        break;
                    }
                }

                // Yeni ise diziye ekle
                if (isNew) {
                    distinct[count] = num;
                    count++;
                }
            }

            // Sonuçları yazdır
            System.out.println("The number of distinct numbers is " + count);
            System.out.print("The distinct numbers are: ");
            for (int i = 0; i < count; i++) {
                System.out.print(distinct[i] + " ");
            }
        }
    }

  */


}
