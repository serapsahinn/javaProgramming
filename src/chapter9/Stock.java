package chapter9;

public class Stock
{
        // Veri alanları
        private String symbol;
        private String name;
        private double previousClosingPrice;
        private double currentPrice;

        // Yapıcı (Constructor)
        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        // getChangePercent() metodu: Fiyat değişim yüzdesini hesaplar
        public double getChangePercent() {
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        }

        // Getter ve Setter metodları (isteğe bağlı)
        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPreviousClosingPrice() {
            return previousClosingPrice;
        }

        public void setPreviousClosingPrice(double previousClosingPrice) {
            this.previousClosingPrice = previousClosingPrice;
        }

        public double getCurrentPrice() {
            return currentPrice;
        }

        public void setCurrentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
        }


}
