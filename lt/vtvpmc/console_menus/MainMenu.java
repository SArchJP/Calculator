package lt.vtvpmc.console_menus;

import java.util.Scanner;

public class MainMenu {
    private boolean quit = false;

    public void start() {
        Scanner reader = new Scanner(System.in);


        System.out.println("Welcome to basic console calculator SVV v1.0");
        System.out.println("============================================");
        printInstructions();
        while (!quit) {
            int choose = reader.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("One");
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
                case 6:
                    quit = true;


            }

        }
    }

    private void printInstructions() {
        System.out.println("Select:\n"
                + "1) For basic functionality +,-,*,-,aPowb\n"
                + "2) For trigonometry functions\n"
                + "3) To calculate quadratic equation\n"
                + "4) For Decimal to Binary || Octal || Hex converter\n"
                + "===================================================\n"
                + "5) To print instructions\n"
                + "6) To Exit calculator "
        );
    }
}
