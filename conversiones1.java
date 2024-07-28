import java.io.*;

public class conversiones1 {

    //main class
    public static void main(String[] ar) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        /*variables:
        int
         * a=centinela value(repeats the program until the value of "a" is -1)
         * action=determins if the program will do a convertion or an operation
         * base=the base of the primary number in case of convertion, or the base of the numbers for the operation
         * newBase=in convertions, the base that we will convert our primary number
         * operation=if we do an operation, is to indicate if we will do an addition or a substraction
        String
         * string1=takes the value from the first number given
         * string2=(just for operations) takes the value of the second number given
         */
        
        int a, action, base, newBase, operation;
        String string1, string2;
        do {
            //we ask if we want to do a convertion or an operation
            System.out.println("what do yo wanna do:\n1 conversion\n2 operation(+ & -)");
            action = Integer.parseInt(e.readLine());

            //we ask for the base of the primary number
            System.out.print("tell me in witch base is your number 2, 8, 10 o 16: ");
            base = Integer.parseInt(e.readLine());

            //if the user wants to do a convertion 
            if (action == 1) {

                //we ask the number to convert
                System.out.print("tell me the number to convert: ");
                string1=e.readLine();

                //we ask to witch base we will convert our primary number
                System.out.print("tell me to witch base you want to CONVERT the number: ");
                newBase = Integer.parseInt(e.readLine());

                //switch to determine the primary base
                switch (base) {

                    //PRIMARY BASE: BINARY BASE
                    case 2:

                        //switch to see to witch base do we convert the BINARY number
                        switch (newBase) {
                            case 8:
                                System.out.println("your binary number "+string1+" in octal is: " + b2b8(string1));
                                break;
                            case 10:
                                System.out.println("your binary number "+string1+" in decimal is: " + b2b10(string1));
                                break;
                            case 16:
                                System.out.println("your binary number "+string1+" in hexadecimal is: " + b2b16(string1));
                                break;
                            default:
                                System.out.println("invalid base");
                                break;
                        }
                        break;

                    //PRIMARY BASE: OCTAL BASE
                    case 8:

                        //switch to see to witch base do we convert the OCTAL number
                        switch (newBase) {
                            case 2:
                                System.out.println("your octal number "+string1+" in binario is: " + b8b2(string1));
                                break;
                            case 10:
                                System.out.println("your octal number "+string1+" in decimal is: " + b8b10(string1));
                                break;
                            case 16:
                                System.out.println("your octal number "+string1+" in hexadecimal is: " + b8b16(string1));
                                break;
                            default:
                                System.out.println("invalid base");
                                break;
                        }
                        break;

                    //PRIMARY BASE: DECIMAL BASE
                    case 10:

                        //switch to see to witch base do we convert the DECIMAL number
                        switch (newBase) {
                            case 2:
                                System.out.println("your decimal number "+string1+" in binario is " + b10b2(Integer.parseInt(string1)));
                                break;
                            case 8:
                                System.out.println("your decimal number "+string1+" in octal is " + b10b8(Integer.parseInt(string1)));
                                break;
                            case 16:
                                System.out.println("your decimal number "+string1+" in hexadecimal is " + b10b16(Integer.parseInt(string1)));
                                break;
                            default:
                                System.out.println("un decimal solo se puede pasar a base 2, 8 o 16.");
                                break;
                        }
                        break;

                    //PRIMARY BASE: HEXADECIMAL BASE
                    case 16:

                        //switch to see to witch base do we convert the HEXADECIMAL number
                        switch (newBase) {
                            case 2:
                                System.out.println("your hexadecimal number "+string1+" in binario is: " + b16b2(string1));
                                break;
                            case 8:
                                System.out.println("your hexadecimal number "+string1+" in octal is: " + b16b8(string1));
                                break;
                            case 10:
                                System.out.println("your hexadecimal number "+string1+" in decimal is: " + b16b10(string1));
                                break;
                            default:
                                System.out.println("invalid base");
                                break;
                        }
                        break;
                    default:
                        System.out.println("invalid base.");
                        break;
                }

            //if the user wants to do an operation
            } else if (action == 2) {

                //we ask what the user wants to do, addition or substraction
                System.out.println("what you want to do:\n1 addition\n2 substraction");
                operation = Integer.parseInt(e.readLine());

                //we ask for the 2 numbers of the operation
                System.out.print("tell me the first number: ");
                string1 = (e.readLine());
                System.out.print("tell me the second number: ");
                string2 = (e.readLine());

                //witch to decide if we do an addition or a substraction depend of the before given answer
                switch (operation) {

                    //ADDITION, another switch inside to call a method depending on the base of the numbers
                    case 1:
                        switch (base) {
                            case 2:
                                suma2(string1, string2);
                                break;
                            case 8:
                                suma8(string1, string2);
                                break;
                            case 10:
                                System.out.println("the sum of your decimal numbers is:\n"+string1+" + "+string2+" = "+suma10(Integer.valueOf(string1), Integer.valueOf(string2)));
                                break;
                            case 16:
                                suma16(string1, string2);
                                break;
                            default:
                                System.out.println("invalid base");
                                break;
                        }
                        break;

                    //SUBSTRACTION, another switch inside to call a method depending on the base of the numbers
                    case 2:
                        switch (base) {
                            case 2:
                                resta2(string1, string2);
                                break;
                            case 8:
                                resta8(string1, string2);
                                break;
                            case 10:
                                System.out.println("the substraction of your decimal numbers is:\n"+string1+" - "+string2+" = "+resta10(Integer.valueOf(string1), Integer.valueOf(string2)));
                                break;
                            case 16:
                                resta16(string1, string2);
                                break;
                            default:
                                System.out.println("invalid base");
                                break;
                        }
                        break;
                    default:
                        System.out.println("you can only add or substract");
                        break;
                }
            }

            //we ask if the user wnat to do another convertion or operation or if not to end the program
            System.out.print("if want to do another operation insert any number, if not insert -1: ");
            a = Integer.parseInt(e.readLine());
        } while (a != -1);
    }

    // methods to convert form BINARY to other bases:

    static String b2b8(String a) {
        int decimal = Integer.parseInt(a, 2);
        String octal = Integer.toOctalString(decimal);
        return octal;
    }

    static int b2b10(String a) {
        int decimal = Integer.parseInt(a, 2);
        return decimal;
    }

    static String b2b16(String a) {
        int decimal = Integer.parseInt(a, 2);
        String hexa = Integer.toHexString(decimal);
        return hexa;
    }

    // methods to convert form OCTAL to other bases:

    static String b8b2(String a) {
        int decimal = Integer.parseInt(a, 8);
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    static String b8b10(String a) {
        int decimal = Integer.parseInt(a, 8);
        String cadena = Integer.toString(decimal);
        return cadena;
    }

    static String b8b16(String a) {
        int decimal = Integer.parseInt(a, 8);
        String hexa = Integer.toHexString(decimal);
        return hexa;
    }

    // methods to convert form DECIMAL to other bases:

    static String b10b2(int a) {
        String binary = Integer.toBinaryString(a);
        return binary;
    }

    static String b10b8(int a) {
        String octal = Integer.toOctalString(a);
        return octal;
    }

    static String b10b16(int a) {
        String hexa = Integer.toHexString(a);
        return hexa;
    }

    // methods to convert form HEXADECIMAL to other bases:

    static String b16b2(String a) {
        int decimal = Integer.parseInt(a, 16);
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }

    static String b16b8(String a) {
        int decimal = Integer.parseInt(a, 16);
        String octal = Integer.toOctalString(decimal);
        return octal;
    }

    static int b16b10(String a) {
        int decimal = Integer.parseInt(a, 16);
        return decimal;
    }

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