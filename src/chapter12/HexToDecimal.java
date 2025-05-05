package chapter12;

public class HexToDecimal
{
        // Hexadecimal stringi decimale dönüştüren metod
        public static int hex2Dec(String hexString) throws NumberFormatException {
            // Hex stringin geçerliliğini kontrol et
            if (!hexString.matches("[0-9A-Fa-f]+")) {
                throw new NumberFormatException("Invalid hex string: " + hexString);
            }

            // Geçerli hex stringi decimale dönüştür
            return Integer.parseInt(hexString, 16);
        }

        public static void main(String[] args) {
            try {
                String hex = "1A3F";
                int decimal = hex2Dec(hex);
                System.out.println("Hex string " + hex + " in decimal is: " + decimal);
            } catch (NumberFormatException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }


}
