import java.io.*;

public class program {

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
         * number1=takes the value from the first number given
         * number2=(just for operations) takes the value of the second number given
         */
        
        int a, action, base, operation;
        String number1, number2;
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
                number1=e.readLine();

                //switch to determine the primary base
                switch (base) {

                    //PRIMARY BASE: BINARY BASE
                    case 2:
                        convertions.b2(number1);
                        break;

                    //PRIMARY BASE: OCTAL BASE
                    case 8:
                        convertions.b8(number1);
                        break;

                    //PRIMARY BASE: DECIMAL BASE
                    case 10:
                        convertions.b10(Integer.valueOf(number1));
                        break;

                    //PRIMARY BASE: HEXADECIMAL BASE
                    case 16:
                        convertions.b16(number1);
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
                number1 = (e.readLine());
                System.out.print("tell me the second number: ");
                number2 = (e.readLine());

                //witch to decide if we do an addition or a substraction depend of the before given answer
                switch (operation) {

                    //ADDITION, another switch inside to call a method depending on the base of the numbers
                    case 1:
                        switch (base) {
                            case 2:
                                operations.suma2(number1, number2);
                                break;
                            case 8:
                                operations.suma8(number1, number2);
                                break;
                            case 10:
                                System.out.println("the sum of your decimal numbers is:\n"+number1+" + "+number2+" = "+operations.suma10(Integer.valueOf(number1), Integer.valueOf(number2)));
                                break;
                            case 16:
                                operations.suma16(number1, number2);
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
                                operations.resta2(number1, number2);
                                break;
                            case 8:
                                operations.resta8(number1, number2);
                                break;
                            case 10:
                                System.out.println("the substraction of your decimal numbers is:\n"+number1+" - "+number2+" = "+operations.resta10(Integer.valueOf(number1), Integer.valueOf(number2)));
                                break;
                            case 16:
                                operations.resta16(number1, number2);
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
}