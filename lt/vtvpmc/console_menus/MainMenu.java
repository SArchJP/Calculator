package lt.vtvpmc.console_menus;

import java.util.Scanner;

public class MainMenu {
    private boolean quit = false;
    private int choose;

    public void start() {
        Scanner reader = new Scanner(System.in);
        BasicFunctionalityMenu basic = new BasicFunctionalityMenu();


        System.out.println("Welcome to basic console calculator SVV v1.0");
        System.out.println("===================================================");
        printInstructions();
        while (!quit) {
            choose = reader.nextInt();

            switch (choose) {
                case 1:
                    basic.basicFunctionality();
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    printInstructions();
                    break;
                case 6:
                    quit = true;


            }

        }
    }

    private void printInstructions() {
        System.out.println("Select:\n"
                + "1) For Basic Functionality +,-,*,-,aPowb\n"
                + "2) For Trigonometry Functions\n"
                + "3) To Calculate Quadratic Equation\n"
                + "4) For Decimal to Binary || Octal || Hex converter\n"
                + "===================================================\n"
                + "5) To Print Instructions\n"
                + "6) To Exit Calculator\n"
                + "===================================================\n"
        );
    }
}
