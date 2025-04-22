package chapter5;

import java.util.Scanner;

public class chapter {
    public static void main(String[] args) {
        /*
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print( number1 + " + " + number2 );
        int answer = input.nextInt();

         while (number1 + number2 != answer) {
         System.out.print(  number1 + " + " + number2 + "? ");
         answer = input.nextInt();
         }
         System.out.println("You got it!");

         */
/*
        int number = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.print("numara gırın  ");
        int guess = input.nextInt();

        if (guess == number){System.out.println("evet sayı  " + number);}
        else if (guess > number)
        {
            System.out.println("sayıdan buyuk numara ");

        }
        else
        {
            System.out.println("sayıdan kucuk numara");
        }


 */
/*
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        int guess = -1;
        while (guess != number) {
            // Prompt the user to guess the number
            System.out.print("sayı gırınız: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
 */
/*
        Scanner input = new Scanner(System.in);
         System.out.print("sayı gırınız  ");
         int data = input.nextInt();
         int sum = 0;
         while (data != 0) {
             sum += data;
             data = input.nextInt();
             }

         System.out.println( sum);
         }


 */

        /*
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int answer = -1;

        while (answer != number1 + number2) {
            System.out.print(number1 + " + " + number2 + " = ? ");
            answer = input.nextInt();
            if (answer != number1 + number2) {
                System.out.println("Yanlış cevap, tekrar deneyin.");
            }
        }

        System.out.println("Tebrikler! Doğru cevap.");
        input.close();
    }

    }

         */
/*
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();
            if (number > max)
                max = number;
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }


 */


/*

        Scanner input = new Scanner(System.in);
        int number, max;

        number = input.nextInt();
        max = number;

        do {
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);

        System.out.println("max is " + max);
        System.out.println("number " + number);
    }

 */

        











    }

}
