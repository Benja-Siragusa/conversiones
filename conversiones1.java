import java.io.*;

public class conversiones1 {
    public static void main(String[] ar) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int a, accion, base, newBase, numero, operacion;
        String cadena1, cadena2;
        do {
            System.out.println("ingrese que desea hacer\n1 conversion\n2 operacion");
            accion = Integer.parseInt(e.readLine());
            System.out.print("digame en que base es su numero 2, 8, 10 o 16: ");
            base = Integer.parseInt(e.readLine());
            if (accion == 1) {
                System.out.print("digame a que base desea convertir su numero 8, 10 o 16: ");
                newBase = Integer.parseInt(e.readLine());
                switch (base) {
                    case 2:
                        System.out.print("digame su numero binario: ");
                        cadena1 = (e.readLine());
                        switch (newBase) {
                            case 8:
                                System.out.println("su numero binario "+cadena1+" en octal es: " + b2b8(cadena1));
                                break;
                            case 10:
                                System.out.println("su numero binario "+cadena1+" en decimal es: " + b2b10(cadena1));
                                break;
                            case 16:
                                System.out.println("su numero binario "+cadena1+" en hexadecimal es: " + b2b16(cadena1));
                                break;
                            default:
                                System.out.println("un binario solo se puede pasar a base 8, 10 o 16.");
                                break;
                        }
                        break;
                    case 8:
                        System.out.print("digame su numero octal: ");
                        cadena1 = (e.readLine());
                        switch (newBase) {
                            case 2:
                                System.out.println("su numero octal "+cadena1+" en binario es: " + b8b2(cadena1));
                                break;
                            case 10:
                                System.out.println("su numero octal "+cadena1+" en decimal es: " + b8b10(cadena1));
                                break;
                            case 16:
                                System.out.println("su numero octal "+cadena1+" en hexadecimal es: " + b8b16(cadena1));
                                break;
                            default:
                                System.out.println("un octal solo se puede pasar a base 2, 10 o 16.");
                                break;
                        }
                        break;
                    case 10:
                        System.out.print("digame su numero decimal: ");
                        numero = Integer.parseInt(e.readLine());
                        switch (newBase) {
                            case 2:
                                System.out.println("su numero decimal "+numero+" en binario es " + b10b2(numero));
                                break;
                            case 8:
                                System.out.println("su numero decimal "+numero+" en octal es " + b10b8(numero));
                                break;
                            case 16:
                                System.out.println("su numero decimal "+numero+" en hexadecimal es " + b10b16(numero));
                                break;
                            default:
                                System.out.println("un decimal solo se puede pasar a base 2, 8 o 16.");
                                break;
                        }
                        break;
                    case 16:
                        System.out.print("digame su numero hexadecimal: ");
                        cadena1 = (e.readLine());
                        switch (newBase) {
                            case 2:
                                System.out.println("su numero hexadecimal "+cadena1+" binario es: " + b16b2(cadena1));
                                break;
                            case 8:
                                System.out.println("su numero hexadecimal "+cadena1+" octal es: " + b16b8(cadena1));
                                break;
                            case 10:
                                System.out.println("su numero hexadecimal "+cadena1+" decimal es: " + b16b10(cadena1));
                                break;
                            default:
                                System.out.println("un sexadecimal solo se puede pasar a base 2, 8 o 10.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("base invalida.");
                        break;
                }
            } else if (accion == 2) {
                System.out.println("que desea hacer:\n1 suma\n2 resta");
                operacion = Integer.parseInt(e.readLine());
                System.out.print("digame el primer numero: ");
                cadena1 = (e.readLine());
                System.out.print("digame el segundo numero: ");
                cadena2 = (e.readLine());
                switch (operacion) {
                    case 1:
                        switch (base) {
                            case 2:
                                suma2(cadena1, cadena2);
                                break;
                            case 8:
                                suma8(cadena1, cadena2);
                                break;
                            case 10:
                                System.out.println(suma10(Integer.valueOf(cadena1), Integer.valueOf(cadena2)));
                                break;
                            case 16:
                                suma16(cadena1, cadena2);
                                break;
                            default:
                                System.out.println("usted no indico nignuna base indicada");
                                break;
                        }
                        break;
                    case 2:
                        switch (base) {
                            case 2:
                                resta2(cadena1, cadena2);
                                break;
                            case 8:
                                resta8(cadena1, cadena2);
                                break;
                            case 10:
                                System.out.println(resta10(Integer.valueOf(cadena1), Integer.valueOf(cadena2)));
                                break;
                            case 16:
                                resta16(cadena1, cadena2);
                                break;
                            default:
                                System.out.println("usted no indico nignuna base indicada");
                                break;
                        }
                        break;
                    default:
                        System.out.println("solo se pueden hacer sumas o restas.");
                        break;
                }
            }
            System.out.print("si desea realizar otra operacion inserte cualquier numero, de lo contrario inserte -1: ");
            a = Integer.parseInt(e.readLine());
        } while (a != -1);
    }

    // convertir de binario a otras bases:

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

    // convertir de octal a otras bases:

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

    // convertir de decimal a otras bases:

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

    // convertir de sexadecimal a otras bases:

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

    // suma y resta binaria:

    static void suma2(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        String binary = Integer.toBinaryString(n1 + n2);
        System.out.println("La suma de sus numeros binarios es: \n" + a + " + " + b + " = " + binary);
    }

    static void resta2(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        String binary = Integer.toBinaryString(n1-n2);
        System.out.println("La resta de sus numeros binarios es: \n" + a + " - " + b + " = " + binary);
    }

    // suma y resta octal:

    static void suma8(String a, String b) {
        int n1 = Integer.parseInt(a, 8);
        int n2 = Integer.parseInt(b, 8);
        String octal = Integer.toOctalString(n1+n2);
        System.out.println("La resta de sus numeros octales es: \n" + a + " + " + b + " = " + octal);
    }

    static void resta8(String a, String b) {
        int n1 = Integer.parseInt(a, 8);
        int n2 = Integer.parseInt(b, 8);
        String octal = Integer.toOctalString(n1-n2);
        System.out.println("La resta de sus numeros octales es: \n" + a + " - " + b + " = " + octal);
    }

    // suma y resta decimal:

    static int suma10(int a, int b) {
        return a + b;
    }

    static int resta10(int a, int b) {
        return a - b;
    }

    // suma y resta sexadecimal:

    static void suma16(String a, String b) {
        int n1 = Integer.parseInt(a, 16);
        int n2 = Integer.parseInt(b, 16);
        String hexa = Integer.toHexString(n1+n2);
        System.out.println("La suma de sus numeros hexadecimales es: \n" + a + " + " + b + " = " + hexa);
    }

    static void resta16(String a, String b) {
        int n1 = Integer.parseInt(a, 16);
        int n2 = Integer.parseInt(b, 16);
        String hexa = Integer.toHexString(n1-n2);
        System.out.println("La resta de sus numeros hexadecimales es: \n" + a + " - " + b + " = " + hexa);
    }
}