package chapter17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream
{
    public static void main(String[] args) throws ClassNotFoundException, IOException//nesneyi geri yüklediğinde, sınıf daha önce yüklenmemişse önce nesnenin sınıfını yükler
    {
        try(ObjectInputStream input= new ObjectInputStream(new FileInputStream("temp.dat"));)
        {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date=(java.util.Date)(input.readObject());
            System.out.println(name + " "+ score + " "+ date);
        }
    }
}
