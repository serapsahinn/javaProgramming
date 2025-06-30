package chapter17;

import java.io.*;
import java.util.Random;

public class Exercise17_01
{
    public static void main(String[] args) throws IOException{
        File file= new File("Exercise17_01.txt");
        try(PrintWriter printWriter= new PrintWriter(new FileOutputStream(file,true)))
        {
            Random r= new Random();
            for (int i=1; i< 100;i++)
            {
                int num = r.nextInt(1000);
                printWriter.println(num);
            }
            System.out.println("sayılar basarılı bır sekılde yazıldı ");
        }
    }
    // Dosya yoksa oluşturulacak
    // Dosya varsa üzerine ekleme yapılacak
    // Dosyaya 100 tane rastgele tamsayı yazılacak
    // Text I/O kullanılacak  PrintWriter


}
