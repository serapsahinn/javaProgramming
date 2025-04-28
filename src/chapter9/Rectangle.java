package chapter9;

public class Rectangle
{
        // Veri alanları
        private double width;
        private double height;

        // No-arg (parametresiz) constructor
        public Rectangle() {
            this.width = 1;
            this.height = 1;
        }

        // Parametreli constructor
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Alanı döndüren metod
        public double getArea() {
            return width * height;
        }

        // Çevreyi döndüren metod
        public double getPerimeter() {
            return 2 * (width + height);
        }

        // Genişliği döndüren getter (isteğe bağlı)
        public double getWidth() {
            return width;
        }

        // Yüksekliği döndüren getter (isteğe bağlı)
        public double getHeight() {
            return height;
        }


}
