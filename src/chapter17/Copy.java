package chapter17;

import javafx.beans.binding.When;

import java.io.*;

public class Copy
{
    public static void main(String[] args) throws IOException
    {// bır dosyayı baska bır dosyaya kopyalamak ıcın
        if (args.length!=2)
        {
            System.out.println("kopyala ");
            System.exit(1);// kontrollu sonlandırıyoruz 1=genel hata parametre hatası //0= hata yok
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists())
        {
            System.out.println("bu kaynak dosya "+ args[0]+ "mevcut degıl");
            System.exit(2);// 2= dosya bulunamadı
        }
        File targetFile = new File(args[1]);
        if (targetFile.exists())
        {
            System.out.println("bu hedef dosya "+args[1]+ "zaten var ");
            System.exit(3);//3= dosya cakısması
        }
        try(BufferedInputStream input= new BufferedInputStream(new FileInputStream(sourceFile));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
        )
        {
            int r, numberOfBytesCopied=0;
            while ((r=input.read())!=-1)
            {
                output.write((byte)r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied +"kopyalanan byte lar ");
        }

    }
}
