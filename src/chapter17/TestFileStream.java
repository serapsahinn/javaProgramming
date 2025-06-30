package chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {

    public static void main(String[] args) throws IOException // METOD IMZASI HATA OLUSABILIR DEMEK
    {//byte tabanı veri yazma ham veri 1-255 arası sadece/ son 8 bıt yazılır
        try(FileOutputStream output= new FileOutputStream("temp.dat");)
        {
            for (int i =1; i<=10; i++)
            {output.write(i);}

        }
        try(FileInputStream input = new FileInputStream("temp.dat");) //byte tabanlı okumak ıçın
        {
            int value;
            while ((value=input.read())!=-1)
            {
                System.out.println(value+" ");
            }

        }
    }


}
