package chapter17;

import java.io.*;

public class TestDataStream {
    public  static void main(String[] args) throws IOException
    {//primitiv tipleri yazar
        try(DataOutputStream outputStream= new DataOutputStream(new FileOutputStream("temp.dat"));)
        {
            outputStream.writeUTF("john");//strıng (basına uzunluk bılgısı eklıyor)
            outputStream.writeDouble(85.5);
            outputStream.writeUTF("jim");
            outputStream.writeDouble(185.5);
            outputStream.writeUTF("george");
            outputStream.writeDouble(105.25);

            try(DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));)
            {
                System.out.println(input.readUTF()+ " " +input.readDouble());
                System.out.println(input.readUTF()+ " " +input.readDouble());
                System.out.println(input.readUTF()+ " " +input.readDouble());

            }
        }
    }
}
