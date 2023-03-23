import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Please select from the following options:");
            System.out.println("A - Convert a number to decimal system");
            System.out.println("B - Convert a decimal number to another system");
            System.out.println("C - Summing up nembers from different systems");
            System.out.println("D - Subtracting numbers from different systems");
            System.out.println("E - Multiplying numbers from different system");
            System.out.println("F - Dividing numbers from different systems");
            System.out.println("W - Quit the program");

            System.out.print("Please select: ");

            choice = input.next().toUpperCase().charAt(0);
            switch (choice) {
                case 'A':
                    System.out.print("Enter the number you want to convert: ");
                    String numToConvert = input.next();
                    System.out.print("Enter the base of the number system: ");
                    int fromBase = input.nextInt();
                    System.out.print("Sum is: ");
                    System.out.println(convertToDecimal(numToConvert, fromBase));

                    break;
                case 'B':
                    System.out.print("Enter the decimal number you want to convert: ");
                    int decimalNum = input.nextInt();
                    System.out.print("Enter the base of the number system you want to convert to: ");
                    int toBase = input.nextInt();
                    System.out.println(convertFromDecimal(decimalNum, toBase));
                    break;
                case 'C':
                    System.out.print("Enter the first number: ");
                    String firstNum = input.next();
                    System.out.print("Enter the second number: ");
                    String secondNum = input.next();
                    System.out.print("Enter the base of the number system: ");
                    int addBase = input.nextInt();
                    System.out.println(add(firstNum, secondNum, addBase));
                    break;
                case 'D':
                    System.out.print("Enter the first number: ");
                    String number1 = input.next();
                    System.out.print("Enter the second number: ");
                    String number2 = input.next();
                    System.out.print("Enter the base of the number system: ");
                    int subtractBase = input.nextInt();
                    System.out.println(subtract(number1, number2, subtractBase));
                    break;
                case 'E':
                    System.out.print("Enter the first number: ");
                    String num1 = input.next();
                    System.out.print("Enter the second number: ");
                    String num2 = input.next();
                    System.out.print("Enter the base of the number system: ");
                    int multiplyBase = input.nextInt();
                    System.out.print(multiply(num1, num2, multiplyBase));
                    break;
                case 'F':
                    System.out.print("Enter the first number: ");
                    String n1 = input.next();
                    System.out.print("Enter the second number: ");
                    String n2 = input.next();
                    System.out.print("Enter the base of the number system: ");
                    int divideBase = input.nextInt();
                    System.out.print(divide(n1, n2, divideBase));
                    break;
                case 'W':
                    System.out.println("Quit the program!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 'W');
        input.close();
    }

    // convert a num to decimal system
    public static int convertToDecimal(String numToConvert, int fromBase) {
        return Integer.parseInt(numToConvert, fromBase);
    }

    // convert a decimal number to another system
    public static String convertFromDecimal(int decimalNum, int toBase) {
        return Integer.toString(decimalNum, toBase);
    }

    // add two numbers from any system
    public static String add(String firstNum, String secondNum, int base) {
        int sum = Integer.parseInt(firstNum, base) + Integer.parseInt(secondNum, base);
        return Integer.toString(sum, base);
    }

    // subtract two numbers from any system
    public static String subtract(String number1, String number2, int subtractBase) {
        int difference = Integer.parseInt(number1, subtractBase) - Integer.parseInt(number2, subtractBase);
        return Integer.toString(difference, subtractBase);
    }

    // multiply two numbers from any system
    public static String multiply(String num1, String num2, int multiplyBase) {
        int product = Integer.parseInt(num1, multiplyBase) * Integer.parseInt(num2, multiplyBase);
        return Integer.toString(product, multiplyBase);
    }

    // divide two numbers from any system
    public static String divide(String n1, String n2, int divideBase) {
        int quotient = Integer.parseInt(n1, divideBase) / Integer.parseInt(n2, divideBase);
        return Integer.toString(quotient, divideBase);
    }
}