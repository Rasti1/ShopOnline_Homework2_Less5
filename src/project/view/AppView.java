package project.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private final Scanner sc = new Scanner(System.in);

    public String[] getData() {
        sc.useLocale(Locale.ENGLISH);
        int counter = 0;

        while (counter != 1 && counter != 2) {
            System.out.println("""
                Which offer would you prefer:
                1 - Take by yourself
                2 - Delivery""");
            System.out.print("Input: ");
            String input = sc.nextLine();

            try {
                counter = Integer.parseInt(input);
                if (counter != 1 && counter != 2) {
                    System.out.println("Incorrect input. Please enter a valid number (1 or 2).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input. Please enter a valid number (1 or 2).");
            }
        }

        System.out.print("Input quantity of product: ");
        String quantity = sc.nextLine().trim();
        System.out.print("Input price of product: ");
        String price = sc.nextLine().trim();

        return new String[]{String.valueOf((counter)), quantity, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
