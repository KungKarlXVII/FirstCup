package com.acme;

public class CoffeeMaker {

    private boolean power;
    private String name;
    private CoffeeType coffeeType;

    private static final int MAX_LIMIT = 5;

    //Counts number of served cups
    private int numberOfServedCups;

    //Count number of served cups for all machines
    //This one is common for both objects now, because its static
    private static int numberOfCupsForAllMachines;

    public CoffeeMaker(boolean power, String name, CoffeeType coffeeType) {
        super();
        this.power = power;
        this.name = name;
        this.coffeeType = coffeeType;
    }


    public void serveCoffee(int numberOfCups){
        if((numberOfServedCups + numberOfCups) <= MAX_LIMIT && this.power == true){
            numberOfServedCups += numberOfCups;
            numberOfCupsForAllMachines = numberOfCupsForAllMachines + numberOfCups;
            System.out.println("Served one extremely hot coffee from machine: " + this.name);
        }

        else{
            System.out.println("Limit for machine reached or machine is off");

            if(this.power == true){
                refillAndReset();
            }

            else{
                this.power = true;
            }
        }

    }

    private void refillAndReset() {
        System.out.println("Number of cups for machine reset");
        numberOfServedCups = 0;
    }


    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public static int getMaxLimit() {
        return MAX_LIMIT;
    }

    public int getNumberOfServedCups() {
        return numberOfServedCups;
    }

    public static String getNumberOfCupsForAllMachines() {
        return "Total number of cups for all machines: " + numberOfCupsForAllMachines;
    }

}
