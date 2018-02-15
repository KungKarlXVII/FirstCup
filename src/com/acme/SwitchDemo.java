package com.acme;

import java.util.Scanner;

public class SwitchDemo {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            boolean flag = true;

            //switch doesn't work with boolean,long double. page 73 OCA
            while(flag) {

                System.out.println("Please choose a number");
                int number = sc.nextInt();

                switch (number) {
                    case 1 :
                        System.out.println(number);
                        flag = false;
                        break;
                    case 2 :
                        System.out.println(number);
                        flag = false;
                        break;
                    case 3 :
                        System.out.println(number);
                        flag = false;
                        break;
                    default:
                        // sc.nextLine();
                        System.out.println("Number is not between 1-3");
                        break;
                }
            }

            System.out.println("Your number was between, 1-3 congratulations!, closing scanner ");
            sc.close();

        }

}
