package chapter17;

import java.io.*;

public class DetectEndOfFile
{
   public static void main(String[] args)
   {//dosya sonunu(EOF) nasıl test edecegız. exceptionları nadır boyle kullanırmısız
       try
       {
           try(DataOutputStream output= new DataOutputStream(new FileOutputStream("test.dat")))
           {
               output.writeDouble(4.5);
               output.writeDouble(43.5);
               output.writeDouble(3.2);
           }

           try(DataInputStream input = new DataInputStream(new FileInputStream("test.dat"))) {
               while (true)
                   System.out.println(input.readDouble());//-1 donmez hata fırlatır
           }
           catch (EOFException ex)
           {
               System.out.println("veriler okundu ");
           }
           } catch (IOException ex) {
              ex.printStackTrace();//hata detayları
           }
       }
   }
