import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conversiones2 {
    public static void main(String[] ar) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        /*
         * variables:
         * int
         * a=centinela value(repeats the program until the value of "a" is -1)
         * base=the base of the given number
         * String
         * number=takes the value from the number given
         */
        int a, base;
        String number;
        do {
            // we ask for the base of the number to convert
            System.out.print("tell me in witch base is your number 2, 8, 10 o 16: ");
            base = Integer.parseInt(e.readLine());

            // we ask the number to convert
            System.out.print("tell me the number to convert: ");
            number = e.readLine();
            switch (base) {
                case 2: {
                    b2(number);
                    break;
                }
                // PRIMARY BASE: OCTAL BASE
                case 8: {
                    b8(number);
                    break;
                }
                // PRIMARY BASE: DECIMAL BASE
                case 10: {
                    b10(Integer.valueOf(number));
                    break;
                }
                // PRIMARY BASE: HEXADECIMAL BASE
                case 16: {
                    b16(number);
                    break;
                }
                default:
                    System.out.println("invalid base.");
                    break;
            }

            // we ask if the user wnat to do another convertion, if not we end the program
            System.out.print("if want to do another convertion insert any number, if not insert -1: ");
            a = Integer.parseInt(e.readLine());
        } while (a != -1);
    }

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