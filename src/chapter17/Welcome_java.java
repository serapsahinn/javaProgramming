package chapter17;

import java.io.*;

public class Welcome_java
{
    public static void main(String[] args) throws IOException
    {
        //Örneğin Welcome.java adlı bir metin dosyası var
        // Bu dosyadaki satırları okuyup,
        // Her satırı UTF-8 string olarak bir binary dosyaya yazacağız (Welcome.utf)
        // Program sonunda:
        //
        //Welcome.java dosyasının boyutunu
        //
        //Welcome.utf dosyasının boyutunu
        //ekrana yazacağız
                // Komut satırından parametreleri kontrol et
                if (args.length != 2) {
                    System.out.println("Kullanım: java Exercise17_04 kaynakDosya hedefDosya");
                    System.exit(1);
                }

                File sourceFile = new File(args[0]);
                File targetFile = new File(args[1]);

                if (!sourceFile.exists()) {
                    System.out.println("Kaynak dosya bulunamadı: " + args[0]);
                    System.exit(2);
                }

                try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                        DataOutputStream output = new DataOutputStream(
                                new FileOutputStream(targetFile)
                        );
                ) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        output.writeUTF(line);
                    }
                }

                System.out.println("Kaynak dosya boyutu: " + sourceFile.length() + " byte");
                System.out.println("Hedef dosya boyutu:  " + targetFile.length() + " byte");
            }




    }

