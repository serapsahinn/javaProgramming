package chapter17;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException
    {       //hem okuma hem yazmayı ac
        try(RandomAccessFile inout = new RandomAccessFile("inout.dat","rw");) {
            inout.setLength(0); // dosyayı sıfırla
            for (int i =0;i<200;i++){inout.writeInt(i);} //dosyayya sayı yazdırıypruz
            System.out.println("dosyanın uzunlugu  "+inout.length());

            inout.seek(0);//ilk sayıyı oku
            System.out.println("1.sayı "+ inout.readInt());

            // her int 4 bayte yer kapladıgından 4 le carpıyoruz
            inout.seek(1*4);
            System.out.println("2.sayı "+inout.readInt());

            inout.seek(9 * 4); // 10. sayı
            System.out.println("10.sayı  " + inout.readInt());

            inout.writeInt(555);

            inout.seek(inout.length());  // sona git
            inout.writeInt(999); //dosyanın sonuna yenı sayı eklıyoruz

            System.out.println("yenı uzunluk " + inout.length());
            inout.seek(10*4);
            System.out.println("11. sayıı  " + inout.readInt());


        }
    }
}
