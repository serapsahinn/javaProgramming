package chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise12_15
{
    public static void main(String[] args) throws Exception {
        File file = new File("Exercise12_15.txt");

        // 1 dosya yoksa oluşttur
        if (!file.exists()) {
            System.out.println("Dosya oluşturuluyor");
            file.createNewFile();
        }

        // 2. 100 rastgele sayı oluştur ve dosyaya yaaz
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                int number = (int)(Math.random() * 100); // 0-99 arası
                output.print(number + " ");
            }
        }

        // 3. dosyadaki sayıları oku
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextInt()) {
                numbers.add(input.nextInt());
            }
        }

        // 4. sayıları sırala ve yazdır
        Collections.sort(numbers);
        System.out.println("Sıralanmış Sayılar:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
