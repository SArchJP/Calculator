package lt.vtvpmc.console_menus;

import lt.vtvpmc.functionality.DecimalBinaryOctalHex;

import java.util.Scanner;

public class DecimalBinaryOctalHexMenu {
    Scanner reader = new Scanner(System.in);
    DecimalBinaryOctalHex decimal = new DecimalBinaryOctalHex();

    private int a;
    private String number;
    private boolean quit;
    private int choose;


    public void convertDecimalBinaryOctalHexMenu() {
        quit = false;
        printInstructions();
        while (!quit) {
            choose = reader.nextInt();

            switch (choose) {
                case 1:
                    enterA();
                    decimal.decimalToBinary(a);
                    break;
                case 2:
                    enterA();
                    decimal.decimalToOctal(a);
                    break;
                case 3:
                    enterA();
                    decimal.decimalToHex(a);
                    break;
                case 4:
                    enterNumber();
                    decimal.binaryToDecimal(number);
                    break;
                case 5:
                    enterNumber();
                    decimal.octalToDecimal(number);
                    break;
                case 6:
                    enterNumber();
                    decimal.hexToDecimal(number);
                    break;
                case 7:
                    printInstructions();
                case 8:
                    this.quit = true;
            }

        }
    }

    private void printInstructions() {
        System.out.println("Select:\n"
                + "1) To Convert Decimal to Binary\n"
                + "2) To Convert Decimal to Octal\n"
                + "3) To Convert Decimal to Hex\n"
                + "4) To Convert Binary to Decimal\n"
                + "5) To Convert Octal to Decimal\n"
                + "6) To Convert Hex to Decimal\n"
                + "===================================================\n"
                + "7) To print instructions\n"
                + "8) Exit to Main Menu "
        );
    }

    private void enterA() {
        System.out.print("Enter number: ");
        a = reader.nextInt();
    }
    private void enterNumber(){
        System.out.print("Enter number: ");
        number = reader.next();
    }
}
