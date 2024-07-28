
public class convertions {
    
    // method to convert form BINARY to other bases:

    static void b2(String a) {
        int decimal = Integer.parseInt(a, 2);
        String octal = Integer.toOctalString(decimal);
        String hexa = Integer.toHexString(decimal);
        System.out.println("the binary number: " + a + "\nin decimal is: " + decimal + "\nin octal is: " + octal
                + "\nin hexadecimal is: " + hexa);
    }

    // method to convert form OCTAL to other bases:

    static void b8(String a) {
        int decimal = Integer.parseInt(a, 8);
        String binary = Integer.toBinaryString(decimal);
        String hexa = Integer.toHexString(decimal);
        System.out.println("the octal number: " + a + "\nin decimal is: " + decimal + "\nin binary is: " + binary
                + "\nin hexadecimal is: " + hexa);
    }
    // method to convert form DECIMAL to other bases:

    static void b10(int a) {
        String binary = Integer.toBinaryString(a);
        String octal = Integer.toOctalString(a);
        String hexa = Integer.toHexString(a);
        System.out.println("the decimal number: " + a + "\nin binary is: " + binary + "\nin octal is: " + octal
                + "\nin hexadecimal is: " + hexa);
    }

    // method to convert form HEXADECIMAL to other bases:

    static void b16(String a) {
        int decimal = Integer.parseInt(a, 16);
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        System.out.println("the hexadecimal number: " + a + "\nin binary is: " + binary + "\nin octal is: " + octal
                + "\nin decimal is: " + decimal);
    }
}