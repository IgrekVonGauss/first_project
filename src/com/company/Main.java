package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Input command: ");
            userInput = in.nextLine();
            String[] tokens = userInput.split(", ");
            String command = tokens[0];
            switch (command) {
                case "exit":
                    break;
                case "front3":
                    System.out.println(Warmup1.front3(tokens[1]));
                    break;
                default:
                    System.out.println(command);
                    System.err.println("Provided unknown command, please try again");
                    break;
            }
        } while (!userInput.equalsIgnoreCase("exit"));
        System.out.println("Program finished!");
    }
}












