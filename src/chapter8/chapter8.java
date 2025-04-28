package chapter8;

import java.util.Arrays;
import java.util.Scanner;

public class chapter8
{
    public static void main(String[] args) {

        /*
        //Sütun sütun elemanları toplayın

        Scanner input = new Scanner(System.in);
        // 3x4 boyutunda matris oluşturuyoruz
        double[][] matrix = new double[3][4];

        // Kullanıcıdan matrisi alıyoruz
        System.out.println("3x4 boyutunda bir matrisi satır satır girin:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        // Her sütunun toplamı
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sütun " + col + "daki elemanların toplamı: " + sumColumn(matrix, col));
        }
    }
    // Belirli bir sütundaki elemanların toplamını döndüren metod
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

         */
        /*
        //Bir matrisin ana köşegenindeki elemanları topla
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];

        System.out.println("4x4 boyutunda bir matrisi girin:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("Ana köşegenin elemanlarının toplamı: " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

         */

/*
        // Çalışanların haftalık saatleri
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // {Çalışan numarası, toplam saat} şeklinde dizi oluştur
        int[][] totalHours = new int[hours.length][2];

        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++) {
                total += hours[i][j];
            }
            totalHours[i][0] = i;    // Çalışan numarası
            totalHours[i][1] = total; // Toplam saat
        }

        // Toplam saate göre AZALAN sırada sırala
        Arrays.sort(totalHours, (a, b) -> b[1] - a[1]);

        // Sonuçları yazdır
        System.out.println("Çalışanların haftalık toplam çalışma saatleri çoktan aza:");
        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Çalışan " + totalHours[i][0] + ": " + totalHours[i][1] + " saat");
        }

 */


        /*
       // Notlara göre öğrencileri sırala
                char[][] answers = {
                        {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                };

                // Cevap anahtarı
                char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

                // Her öğrencinin doğru cevap sayısı dizi{öğrenciNumarası, doğruSayısı}
                int[][] scores = new int[answers.length][2];

                for (int i = 0; i < answers.length; i++) {
                    int correctCount = 0;
                    for (int j = 0; j < answers[i].length; j++) {
                        if (answers[i][j] == key[j]) {
                            correctCount++;
                        }
                    }
                    scores[i][0] = i;           // Öğrencinin numarası
                    scores[i][1] = correctCount; // Doğru cevap sayısı
                }

                // Doğru sayısına göre artan şekilde sırala
                Arrays.sort(scores, (a, b) -> a[1] - b[1]);

                // Sıralı şekilde yazdır
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("Öğrenci " + scores[i][0] + ": " + scores[i][1] + " doğru cevap");
                }
            }
        }

         */
        /*
        //Cebir: İki matrisi çarpma
        Scanner input = new Scanner(System.in);
        // 3x3 boyutlu iki matris
        double[][] matrixA = new double[3][3];
        double[][] matrixB = new double[3][3];
        // Kullanıcıdan matris A al
        System.out.println("Matris A'yı giriniz (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = input.nextDouble();
            }
        }
        // Kullanıcıdan matris B al
        System.out.println("Matris B'yi giriniz (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = input.nextDouble();
            }
        }
        // Matris çarpımını hesapla
        double[][] result = multiplyMatrix(matrixA, matrixB);

        System.out.println("İki matrisin çarpımı:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%6.2f ", result[i][j]);
            }
            System.out.println();
        }
    }

    // Matris çarpımı için metod
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int n = a[0].length; // a'nın sütun sayısı = b'nin satır sayısı

        double[][] c = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }

}
         */


    }
}
