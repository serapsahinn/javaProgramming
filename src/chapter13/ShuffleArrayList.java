package chapter13;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList
{
        public static void shuffle(ArrayList<Number> list) {
            Collections.shuffle(list);  // lşstedekılerı ratgele karıstırıyor
        }

        // Test etmek için main metodu
        public static void main(String[] args) {
            // Number türünden bir ArrayList oluşturuyoruz
            ArrayList<Number> list = new ArrayList<>();
            list.add(1);        // tam sayı
            list.add(2.5);      // ondalık sayı
            list.add(3);        // tam sayı
            list.add(4.7);      // ondalık sayı
            list.add(5);        // tam sayı

            System.out.println("Orijinal liste: " + list);
            shuffle(list); // listeyı karıstırıyoruz

            System.out.println("Karıştırılmış liste: " + list);
        }
}
