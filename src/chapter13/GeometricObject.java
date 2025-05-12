package chapter13;

public abstract class GeometricObject
{

        private String color = "white";
        private boolean filled;
        private java.util.Date dateCreated;

        protected GeometricObject() {
            dateCreated = new java.util.Date();
        }

        protected GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }



    // Soyut metotlar
        public abstract double getArea();
        public abstract double getPerimeter();

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        public String toString() {
            return "created on " + dateCreated + "color: " + color +
                    " and filled: " + filled;
        }

    // max metodu: İki GeometrikObject nesnesinden büyüğünü döndürme
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        if (obj1.compareTo(obj2) > 0) {
            return obj1;
        } else {
            return obj2;
        }
    }
    public int compareTo(GeometricObject other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        } else if (this.getArea() < other.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

}
