package chapter17;

import chapter11.Triangle;

import java.io.*;
import java.util.Random;

public class Exercise17_03
{
    public static void main( String[] args ) throws IOException
    {
        File file= new File(" Exercise17_03.dat");
        try (DataOutputStream dataOutputStream= new DataOutputStream(new FileOutputStream(file)))
        {
            Random random= new Random();
            for (int i=1;i<100;i++)
            {
                int num = random.nextInt();
                dataOutputStream.writeInt(num);
            }
            System.out.println("dosya basarıyla olusturuldu ");
        }

        int sum=0;
        if (!file.exists())
        {
            System.out.println("dosya bulunamadı "+file.getName());
            System.exit(1);

        }

        try(DataInputStream dataInputStream= new DataInputStream(new FileInputStream(file));)
        {while (true)
        {
            try
            {
                int value= dataInputStream.readInt();
                sum +=value;

            }catch (EOFException e) //Binary dosyada readInt() sayısı belli değilse
            {
                break;
            }
        }

        }

        System.out.println("toplam " +sum);

        //Dosya: Exercise17_03.dat
        // İçinde bilinmeyen sayıda int var (binary)
        // Hepsini okuyup toplamak
        // Sonucu ekrana yazmak

    }
}
