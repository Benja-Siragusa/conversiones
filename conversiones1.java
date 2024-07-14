import java.io.*;

public class conversiones1 {
    public static void main(String[] ar) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int accion, base1, base2, numero1, operacion, numero2;
        System.out.println("ingrese que desea hacer\n1 conversion\n2 operacion");
        accion = Integer.parseInt(e.readLine());
        if (accion == 1) {
            System.out.println("digame en que base es su numero, 2, 8, 10 o 16:");
            base1 = Integer.parseInt(e.readLine());
            switch (base1) {
                case 2:
                    System.out.println("digame su numero binario:");
                    numero1 = Integer.parseInt(e.readLine());
                    System.out.println("digame a que base desea convertir su numero binario 8, 10 o 16:");
                    base2 = Integer.parseInt(e.readLine());
                    switch (base2) {
                        case 8:
                            break;
                        case 10:
                            break;
                        case 16:
                            break;
                        default:
                            System.out.println("un binario solo se puede pasar a base 8, 10 o 16.");
                            break;
                    }
                    break;
                case 8:
                    System.out.println("digame su numero octal:");
                    numero1 = Integer.parseInt(e.readLine());
                    System.out.println("digame a que base desea convertir su numero octal 2, 10 o 16:");
                    base2 = Integer.parseInt(e.readLine());
                    switch (base2) {
                        case 2:
                            break;
                        case 10:
                            break;
                        case 16:
                            break;
                        default:
                            System.out.println("un octal solo se puede pasar a base 2, 10 o 16.");
                            break;
                    }
                    break;
                case 10:
                    System.out.println("digame su numero decimal:");
                    numero1 = Integer.parseInt(e.readLine());
                    System.out.println("digame a que base desea convertir su numero decimal 2, 8 o 16:");
                    base2 = Integer.parseInt(e.readLine());
                    switch (base2) {
                        case 2:
                            break;
                        case 8:
                            break;
                        case 16:
                            break;
                        default:
                            System.out.println("un decimal solo se puede pasar a base 2, 8 o 16.");
                            break;
                    }
                    break;
                case 16:
                    System.out.println("digame su numero sexadecimal:");
                    numero1 = Integer.parseInt(e.readLine());
                    System.out.println("digame a que base desea convertir su numero sexadecimal 2, 8 o 10:");
                    base2 = Integer.parseInt(e.readLine());
                    switch (base2) {
                        case 2:
                            break;
                        case 8:
                            break;
                        case 10:
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
            System.out.println("digame en que base es su numero 2, 8, 10 o 16:");
            base1 = Integer.parseInt(e.readLine());
            System.out.println("que desea hacer:\n1 suma\n2 resta");
            operacion = Integer.parseInt(e.readLine());
            System.out.println("digame el primer numero: ");
            numero1 = Integer.parseInt(e.readLine());
            System.out.println("digame el segundo numero: ");
            numero2 = Integer.parseInt(e.readLine());
            switch (operacion) {
                case 1:
                    switch (base1) {
                        case 2:
                            break;
                        case 8:
                            break;
                        case 10:
                            System.out.println(suma10(numero1, numero2));
                            break;
                        case 16:
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    switch (base1) {
                        case 2:
                            break;
                        case 8:
                            break;
                        case 10:
                            System.out.println(resta10(numero1, numero2));
                            break;
                        case 16:
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("solo se pueden hacer sumas o restas.");
                    break;
            }

        }
    }

    // convertir de binario a otras bases:

    static int b2b8(int a) {
        return a;
    }

    static int b2b10(int a) {
        return a;
    }

    static int b2b16(int a) {
        return a;
    }

    // convertir de octal a otras bases:

    static int b8b2(int a) {
        return a;
    }

    static int b8b10(int a) {
        return a;
    }

    static int b8b16(int a) {
        return a;
    }

    // convertir de decimal a otras bases:

    static int b10b2(int a) {
        return a;
    }

    static int b10b8(int a) {
        return a;
    }

    static int b10b16(int a) {
        return a;
    }

    // convertir de sexadecimal a otras bases:

    static int b16b2(int a) {
        return a;
    }

    static int b16b8(int a) {
        return a;
    }

    static int b16b10(int a) {
        return a;
    }

    // suma y resta binaria:

    static int suma2(int a, int b) {
        return a + b;
    }

    static int resta2(int a, int b) {
        return a - b;
    }

    // suma y resta octal:

    static int suma8(int a, int b) {
        return a + b;
    }

    static int resta8(int a, int b) {
        return a - b;
    }

    // suma y resta decimal:

    static int suma10(int a, int b) {
        return a + b;
    }

    static int resta10(int a, int b) {
        return a - b;
    }

    // suma y resta sexadecimal:

    static int suma16(int a, int b) {
        return a + b;
    }

    static int resta16(int a, int b) {
        return a - b;
    }
}