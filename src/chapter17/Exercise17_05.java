package chapter17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class Exercise17_05
{
    public static void main(String[] args) throws IOException
    {
        //bir int[] (dizi): {1, 2, 3, 4, 5}
        // bir Date nesnesi (şu anki tarih/zaman)
        // bir double değeri: 5.5
        // bunları Exercise17_05.dat dosyasına yazmak

       try(ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream("Exerie17_05.dat")))
       {
           int[] numbers = {1, 2, 3, 4, 5};
           Date now = new Date();
           double d = 5.5;

           outputStream.writeObject(numbers);
           outputStream.writeObject(now);
           outputStream.writeDouble(d);

           System.out.println("verıler basarıyla yazıldı ");
       }

    }
}
