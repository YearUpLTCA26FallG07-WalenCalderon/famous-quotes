package com.pluralsight;

import java.util.Scanner;
public class Console{
    private static final Scanner sc = new Scanner(System.in);

    public static int displayQuote() {
        System.out.print("Select a number from 1 to 10 (0 if you want to exit the program) ");

        return promptForInt("Select an option: ");
    }

    public static int promptForInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static double promptForDouble(String prompt){
        System.out.print(prompt);
        return Double.parseDouble(sc.nextLine());
    }

    public static long promptForLong(String prompt){
        System.out.println(prompt);
        return Long.parseLong(sc.nextLine());





    }

}