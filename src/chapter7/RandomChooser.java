package chapter7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomChooser
{
        public static void main(String[] args) {
            // 5 10 harıc sayı uretır
            int randomNumber = getRandom(5, 10, 15);
            System.out.println("Rastgele sayı: " + randomNumber);
        }

        public static int getRandom(int... numbers) {
            //harıc tutuulacak sayılar ıcın hashset kullanıyoruz
            Set<Integer> excludedNumbers = new HashSet<>();
            for (int number : numbers) {
                excludedNumbers.add(number);
            }
            Random rand = new Random();
            int randomNumber;
          //gecerlı bır sayı bulunana kadar
            do {
                randomNumber = rand.nextInt(54) + 1; // 1 ile 54 arası sayı ıstıyoruz
            } while (excludedNumbers.contains(randomNumber)); // eger  tutulan sayı harıc tutulmussa tekrar uret
            return randomNumber;
        }
    }

