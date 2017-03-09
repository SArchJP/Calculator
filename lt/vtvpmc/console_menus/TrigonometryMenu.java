package lt.vtvpmc.console_menus;

import lt.vtvpmc.functionality.Trigonometry;

import java.util.Scanner;

public class TrigonometryMenu {
    Scanner reader = new Scanner(System.in);
    Trigonometry trigonometry = new Trigonometry();

    private double a;
    private boolean quit;
    private int choose;


    public void trigonometryFunctionality() {
        quit = false;
        printInstructions();
        while (!quit) {
            choose = reader.nextInt();

            switch (choose) {
                case 1:
                    enterA();
                    System.out.println(trigonometry.sin(a));
                    break;
                case 2:
                    enterA();
                    System.out.println(trigonometry.cos(a));
                    break;
                case 3:
                    enterA();
                    System.out.println(trigonometry.tg(a));
                    break;
                case 4:
                    enterA();
                    System.out.println(trigonometry.ctg(a));
                    break;
                case 5:
                    printInstructions();
                case 6:
                    this.quit = true;
            }

        }
    }

    private void printInstructions() {
        System.out.println("Select:\n"
                + "1) To Calculate Sin\n"
                + "2) To Calculate Cos\n"
                + "3) To Calculate Tg\n"
                + "4) To Calculate Ctg\n"
                + "===================================================\n"
                + "5) To print instructions\n"
                + "6) Exit to Main Menu "
        );
    }

    private void enterA() {
        System.out.print("Enter Degree: ");
        a = reader.nextDouble();
    }
}
