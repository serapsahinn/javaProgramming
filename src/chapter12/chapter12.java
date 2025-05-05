package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class chapter12
{
    public static void main(String[] args) {
        /*
                Scanner input = new Scanner(System.in);
                int number1 = 0, number2 = 0;
                boolean validInput = false;

                // İlk sayı için döngü
                while (!validInput) {
                    try {
                        System.out.print("Enter the first integer: ");
                        number1 = input.nextInt();
                        validInput = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid input. Please enter an integer.");
                        input.nextLine(); // Hatalı girişi temizle
                    }
                }

                validInput = false; // İkinci sayı için sıfırla

                // İkinci sayı için döngü
                while (!validInput) {
                    try {
                        System.out.print("Enter the second integer: ");
                        number2 = input.nextInt();
                        validInput = true;
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid input. Please enter an integer.");
                        input.nextLine(); // Hatalı girişi temizle
                    }
                }

                int sum = number1 + number2;
                System.out.println("The sum is: " + sum);

                input.close();
            }

         */


/*
        int[] numbers = new int[100];

        // Diziyi 0-99 arasında rastgele sayılarla doldur
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an index (0-99): ");
            int index = input.nextInt();

            // Diziye eriş ve sonucu yazdır
            System.out.println("Element at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }

        input.close();
    }


 */
/*
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter annual interest rate: ");
            double rate = input.nextDouble();

            System.out.print("Enter number of years: ");
            int years = input.nextInt();

            System.out.print("Enter loan amount: ");
            double amount = input.nextDouble();

            Loan loan = new Loan(rate, years, amount);
            System.out.printf("Monthly Payment: %.2f\n", loan.getMonthlyPayment());
            System.out.printf("Total Payment: %.2f\n", loan.getTotalPayment());

        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        input.close();
    }

 */


    }


}
