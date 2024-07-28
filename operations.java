public class operations {
    
    // BINARY operations + & -

    static void suma2(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        String binary = Integer.toBinaryString(n1 + n2);
        System.out.println("The sum of the binary numbers is: \n" + a + " + " + b + " = " + binary);
    }

    static void resta2(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        String binary = Integer.toBinaryString(n1-n2);
        System.out.println("The subtraction of the binary numbers is: \n" + a + " - " + b + " = " + binary);
    }

    // OCTAL operations + & -

    static void suma8(String a, String b) {
        int n1 = Integer.parseInt(a, 8);
        int n2 = Integer.parseInt(b, 8);
        String octal = Integer.toOctalString(n1+n2);
        System.out.println("The sum of the octal numbers is: \n" + a + " + " + b + " = " + octal);
    }

    static void resta8(String a, String b) {
        int n1 = Integer.parseInt(a, 8);
        int n2 = Integer.parseInt(b, 8);
        String octal = Integer.toOctalString(n1-n2);
        System.out.println("The subtraction of the octal numbers is: \n" + a + " - " + b + " = " + octal);
    }

    // DECIMAL operations + & -

    static int suma10(int a, int b) {
        return a + b;
    }

    static int resta10(int a, int b) {
        return a - b;
    }

    // HEXADECIMAL operations + & -

    static void suma16(String a, String b) {
        int n1 = Integer.parseInt(a, 16);
        int n2 = Integer.parseInt(b, 16);
        String hexa = Integer.toHexString(n1+n2);
        System.out.println("The sum of the hexadecimal numbers is: \n" + a + " + " + b + " = " + hexa);
    }

    static void resta16(String a, String b) {
        int n1 = Integer.parseInt(a, 16);
        int n2 = Integer.parseInt(b, 16);
        String hexa = Integer.toHexString(n1-n2);
        System.out.println("The subtraction of the hexadecimal numbers is: \n" + a + " - " + b + " = " + hexa);
    }
}
