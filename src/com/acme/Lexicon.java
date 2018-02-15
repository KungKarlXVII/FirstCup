package com.acme;

import java.io.*;

public class Lexicon {

    public static void main(String[] args) {

        CoffeeMaker irish = new CoffeeMaker(true, "Lexicon Irish Special", CoffeeType.IRISH_STRONG);
        CoffeeMaker latte = new CoffeeMaker(true, "Lexicon Latte Special", CoffeeType.LATTE);

        irish.serveCoffee(7);
        latte.serveCoffee(4);

        System.out.println(CoffeeMaker.getNumberOfCupsForAllMachines());

        try ( PrintWriter writer = new PrintWriter("daily-report.txt", "UTF-8")) {
            writer.println(CoffeeMaker.getNumberOfCupsForAllMachines());
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         *  Break/Continue Example
         */

        // break leaves a loop. break works with for, switch and while.
//        System.out.println("\nbreak when i is 2:");
//        for (int i = 1; i <= 3; i++) {
//
//            if (i == 2) {
//                System.out.println("[break] \n");
//                break;
//            }
//            System.out.print("[i:" + i + "]");
//        }
//
//        // continue jumps to the next iteration. continue works with for and switch.
//
//        System.out.println("continue when i is 2:");
//        for (int i = 1; i <= 3; i++) {
//            if (i == 2) {
//                System.out.print("[continue]");
//                continue;
//            }
//            System.out.print("[i:" + i + "]");
//        }
    }

}
