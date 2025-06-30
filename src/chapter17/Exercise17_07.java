package chapter17;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercise17_07
{
    public static void main(String[] args)
    {

        double totalLoanAmount=0;
        //Dosyadan Loan nesnelerini okumak ve toplam kredi miktarını (loan amount) göstermek.EOFException ile dosya sonunu tespit et
        try(ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("Exercise17_07.dat")))
        {
            while (true)
            {try
            {
                Loan loan=(Loan)objectInputStream.readObject();
                totalLoanAmount+= loan.getLoanAmount();
            }catch (EOFException e)
            {
                break;
            }catch (ClassNotFoundException c)
            {
                System.out.println("loan sınıfı bulunamadı ");
                c.printStackTrace();
                break;
            }

            }
            System.out.println("toplamm total " + totalLoanAmount);
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("hata");
        }


    }
}
