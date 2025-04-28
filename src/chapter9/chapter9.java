package chapter9;

import java.awt.*;
import java.util.Date;
import java.util.Random;

public class chapter9
{

    public static void main(String[] args) {

        /*
                // İki Rectangle nesnesi oluştur
                Rectangle rectangle1 = new Rectangle(4, 40);
                Rectangle rectangle2 = new Rectangle(3.5, 35.9);

                // rectangle1 bilgileri
                System.out.println("Rectangle 1:");
                System.out.println("Width: " + rectangle1.getWidth());
                System.out.println("Height: " + rectangle1.getHeight());
                System.out.println("Area: " + rectangle1.getArea());
                System.out.println("Perimeter: " + rectangle1.getPerimeter());

                System.out.println();

                // rectangle2 bilgileri
                System.out.println("Rectangle 2:");
                System.out.println("Width: " + rectangle2.getWidth());
                System.out.println("Height: " + rectangle2.getHeight());
                System.out.println("Area: " + rectangle2.getArea());
                System.out.println("Perimeter: " + rectangle2.getPerimeter());
            }

         */


      /*
        // Stock nesnesi oluşturma
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Önceki kapanış fiyatını ve mevcut fiyatı ayarlama
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        // Değişim yüzdesini hesaplayıp yazdırma
        double changePercent = stock.getChangePercent();
        System.out.println("Stock symbol: " + stock.getSymbol());
        System.out.println("Stock name: " + stock.getName());
        System.out.println("Previous closing price: " + stock.getPreviousClosingPrice());
        System.out.println("Current price: " + stock.getCurrentPrice());
        System.out.println("Price change percentage: " + changePercent + "%");
    }

       */

        /*
        // Farklı zaman dilimlerinde Date nesneleri oluşturma ve yazdırma
        long[] elapsedTimes = {
                10000,
                100000,
                1000000,
                10000000,
                100000000,
                1000000000L,
                10000000000L,
                100000000000L
        };

        // Her bir zaman dilimi için Date nesnesi oluşturma ve toString() ile yazdırma
        for (long elapsedTime : elapsedTimes) {
            Date date = new Date(elapsedTime);
            System.out.println("Elapsed time: " + elapsedTime + " milliseconds => " + date.toString());
        }
    }


         */

        /*
        // Seed değeri ile
        Random random = new Random(1000);

        // 50 adet rastgele tam sayı üreterek yazdırma
        for (int i = 0; i < 50; i++) {
            // nextInt(100) metodu 0 ile 99 arasında bir sayı döndürür
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }
    }


         */
    }

}
