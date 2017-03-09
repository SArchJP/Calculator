package lt.vtvpmc.console_menus;

import lt.vtvpmc.functionality.BasicFunctionality;

import java.util.Scanner;

public class BasicFunctionalityMenu {
    Scanner reader = new Scanner(System.in);
    BasicFunctionality basic = new BasicFunctionality();

    private double a, b;
    private boolean quit = false;
    private int choose;


    public void basicFunctionality() {

        printInstructions();
        while (!quit) {
            choose = reader.nextInt();

            switch (choose) {
                case 1:
                    enterAandB();
                    System.out.println(basic.add(a, b));
                    break;
                case 2:
                    enterAandB();
                    System.out.println(basic.subtract(a, b));
                    break;
                case 3:
                    enterAandB();
                    System.out.println(basic.multiply(a, b));
                    break;
                case 4:
                    enterAandB();
                    System.out.println(basic.divide(a, b));
                    break;
                case 5:
                    enterAandB();
                    System.out.println(basic.power(a, b));
                    break;
                case 6:
                    printInstructions();
                case 7:
                    quit = true;
            }

        }
    }

    private void printInstructions() {
        System.out.println("Select:\n"
                + "1) For Addition\n"
                + "2) For Subtraction\n"
                + "3) To Multiply\n"
                + "4) To Divide\n"
                + "5) For a^b\n"
                + "===================================================\n"
                + "6) To print instructions\n"
                + "7) Exit to Main Menu "
        );
    }

    private void enterAandB() {
        System.out.print("Enter first digit: ");
        a = reader.nextDouble();
        System.out.print("Enter second digit: ");
        b = reader.nextDouble();
    }
}
