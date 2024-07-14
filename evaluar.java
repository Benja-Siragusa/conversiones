class evaluar {
    public static void main(String[] args) {
        String binaryString = "1010"; // Representación binaria del número 10 en decimal

        // Convertir binario a decimal
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Binario: " + binaryString);
        System.out.println("Decimal: " + decimal);

        // Convertir decimal a octal
        String octalString = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octalString);

        // Convertir decimal a hexadecimal
        String hexString = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexString);
    }
}