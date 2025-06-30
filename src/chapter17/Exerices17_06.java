package chapter17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exerices17_06
{
    public static void main(String[] args)
    {
        //erializable'ı uygulamak için Loan sınıfını yeniden yazın. Yazmak
        //beş Kredi nesnesi oluşturan ve bunları aşağıdaki addaki bir dosyada saklayan bir program

        try(ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream("Exerices17_06.dat")))
        {
            Loan loan1= new Loan(5.5,7,8000);
            Loan loan2= new Loan(4.5,10,6000);
            Loan loan3= new Loan(7.5,8,7000);
            Loan loan4= new Loan(2.5,6,8000);
            Loan loan5= new Loan(4.5,3,1000);

            outputStream.writeObject(loan1);
            outputStream.writeObject(loan2);
            outputStream.writeObject(loan3);
            outputStream.writeObject(loan4);
            outputStream.writeObject(loan5);

            System.out.println("5 loan nesnesı dosyaya yazıldı ");


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
