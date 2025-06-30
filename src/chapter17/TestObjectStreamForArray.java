package chapter17;

import java.io.*;

public class TestObjectStreamForArray
{
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // 5 elemanlı int dizisi
        int[] numbers = {1, 2, 3, 4, 5};

        // 3 elemanlı String dizisi
        String[] strings = {"John", "Susan", "Kim"};

        // DİZİLERİ DOSYAYA YAZ
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat"));) {
            output.writeObject(numbers);
            output.writeObject(strings);   
        }
        // DİZİLERİ DOSYADAN OKU
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newStrings = (String[]) (input.readObject());

            // DİZİLERİ EKRANA YAZ
            for (int i = 0; i < newNumbers.length; i++) {
                System.out.print(newNumbers[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < newStrings.length; i++) {
                System.out.print(newStrings[i] + " ");
            }

        }
    }


}
