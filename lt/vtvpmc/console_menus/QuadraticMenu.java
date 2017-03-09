package lt.vtvpmc.console_menus;

import lt.vtvpmc.functionality.Quadratic;

import java.util.Scanner;

public class QuadraticMenu {
    Scanner reader = new Scanner(System.in);
    Quadratic quadratic = new Quadratic();

    private boolean quit;
    private int choose;

    public void calculateQuadraticEquation() {

        quit = false;
        printInstructions();
        while (!quit) {
            choose = reader.nextInt();

            switch (choose) {
                case 1:
                    quadratic.quadratic();
                    break;
                case 2:
                    printInstructions();
                    break;
                case 3:
                    this.quit = true;
                    break;
            }

        }
    }

    private void printInstructions() {
        System.out.println("Select:\n"
                + "1) To Calculate Quadratic Equation\n"
                + "===================================================\n"
                + "2) To print instructions\n"
                + "3) Exit to Main Menu "
        );
    }
}
