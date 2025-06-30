package chapter17;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Exercise17_02
{
    public static void main( String[] args) throws IOException
    {
        try (DataOutputStream dataOutputStream= new DataOutputStream(new FileOutputStream("Exercise17_02.dat")))
        {
            Random random= new Random();
            for (int i=1;i<100;i++)
            {
                int num = random.nextInt();
                dataOutputStream.writeInt(num);
            }
            System.out.println("dosya basarıyla olusturuldu ");
        }






//Dosya yoksa oluştur
//
// 100 tane rastgele tamsayı yaz (0–999 arası mesela)
// Binary I/O kullanılacak (yani writeInt ile yazılacak)
    }
}
