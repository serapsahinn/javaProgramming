package chapter6;

import java.util.Scanner;

public class chapter6
{
   /* public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);

        System.out.print("The grade is ");
        printGrade(59.5);
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

    */

    /*
    public class PentagonalNumbers {
        public static void main(String[] args) {
            int count = 0;
            for (int i = 1; i <= 100; i++) {
                System.out.printf("%6d", getPentagonalNumber(i));
                count++;
                if (count % 10 == 0) {
                    System.out.println(); // Her 10 sayıda bir alt satıra geç
                }
            }
        }

        public static int getPentagonalNumber(int n) {
            return n * (3 * n - 1) / 2;
        }
    }

     */

    /*
    public class SumDigits {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            long number = input.nextLong();

            System.out.println("The sum of digits: " + sumDigits(number));
        }

        public static int sumDigits(long n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10; // Son basamağı ekler
                n /= 10;       // Son basamağı çıkarır
            }
            return sum;
        }
    }

     */

 /*

    public class PalindromeCheck {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        }

        public static int reverse(int number) {
            int reverse = 0;
            while (number != 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }
            return reverse;
        }

        public static boolean isPalindrome(int number) {
            return number == reverse(number);
        }
    }

  */
/*

    public class ReverseInteger {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            System.out.print("Reversed number: ");
            reverse(number);
        }

        public static void reverse(int number) {
            while (number != 0) {
                System.out.print(number % 10); // Son basamağı yazdır
                number /= 10;                  // Son basamağı çıkar
            }
            System.out.println();
        }
    }

 */

    /*

    public class SortThreeNumbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter three numbers: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            double num3 = input.nextDouble();

            displaySortedNumbers(num1, num2, num3);
        }

        public static void displaySortedNumbers(double num1, double num2, double num3) {
            double temp;

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num2 > num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.println("Sorted numbers: " + num1 + " " + num2 + " " + num3);
        }
    }


     */
 /*

    public class DisplayPattern {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number (n): ");
            int n = input.nextInt();

            displayPattern(n);
        }

        public static void displayPattern(int n) {
            for (int row = 1; row <= n; row++) {

                for (int space = 1; space <= n - row; space++) {
                    System.out.print("  ");
                }
                
                for (int num = row; num >= 1; num--) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }



  */



}
