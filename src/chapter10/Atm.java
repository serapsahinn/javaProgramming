package chapter10;

import java.util.Scanner;

public class Atm
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            Account[] accounts = new Account[10];
            for (int i = 0; i < accounts.length; i++) {
                accounts[i] = new Account(i, 100);
            }

            while (true) {
                System.out.print("Bir kullanıcı ID'si girin : ");
                int id = input.nextInt();

                while (id < 0 || id > 9) {
                    System.out.print("Geçersiz ID. Lütfen 0 ile 9 arasında girin: ");
                    id = input.nextInt();
                }

                // Menü göster
                Account currentAccount = accounts[id];
                int choice = 0;

                while (choice != 4) {
                    System.out.println("Main menu");
                    System.out.println("1: Bakiye sorgula");
                    System.out.println("2: Para çek");
                    System.out.println("3: Para yatır");
                    System.out.println("4: Çıkış yap");
                    System.out.print("Seçiminiz: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Mevcut bakiye: " + currentAccount.getBalance());
                            break;
                        case 2:
                            System.out.print("Çekilecek miktar: ");
                            double withdrawAmount = input.nextDouble();
                            currentAccount.withdraw(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Yatırılacak miktar: ");
                            double depositAmount = input.nextDouble();
                            currentAccount.deposit(depositAmount);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor");
                            break;
                        default:
                            System.out.println("Geçersiz seçim. Tekrar deneyin.");
                    }
                }
            }
    }

}
