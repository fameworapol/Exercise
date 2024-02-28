public class DecimalToBinary {
    public static void main(String[] args) {
        String result = convertToBinary(24);
        System.out.println(result);
    }
    
    private static String convertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            binary.insert(0, decimalNumber % 2);
            // Update the decimal number with the quotient
            decimalNumber /= 2;
        }

        // If the input decimal number was 0, return "0" as binary representation
        if (binary.length() == 0) {
            return "0";
        }

        return binary.toString();
    }
}
