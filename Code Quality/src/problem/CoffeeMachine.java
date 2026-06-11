package coffee.problem;

import java.util.Scanner;

public class CoffeeMachine {
    public int WaterLevel;
    public int beansGrams;
    boolean isPoweredOn;
    public String MachineName;
    int cupsMADE;
    public double pricePerCup;

    public CoffeeMachine(String name, double price) {
        MachineName = name;
        pricePerCup = price;
        WaterLevel = 0;
        beansGrams = 0;
        isPoweredOn = false;
        cupsMADE = 0;
    }

    public void powerOn() {
        isPoweredOn = true;
        System.out.println(MachineName + " is now ON.");
    }

    public void addWater(int ml) {
        WaterLevel = WaterLevel + ml;
        System.out.println("Added " + ml + "ml. Water level: " + WaterLevel + "ml");
    }

    public void addBeans(int grams) {
        beansGrams = beansGrams + grams;
        System.out.println("Added " + grams + "g beans. Total: " + beansGrams + "g");
    }

    public boolean brewCoffee() {
        if (WaterLevel < 150) {
            System.out.println("Not enough water!");
            return false;
        }
        WaterLevel = WaterLevel - 150;
        cupsMADE = cupsMADE + 1;
        System.out.println("Brewing cup #" + cupsMADE + ". Enjoy!");
        return true;
    }

    public double getTotalRevenue() {
        return WaterLevel * pricePerCup;
    }

    public String getStatus() {
        return "Machine: " + MachineName +
                " | On: " + isPoweredOn +
                " | Water: " + WaterLevel + "ml" +
                " | Cups made: " + cupsMADE;
    }

    public void reset() {
        isPoweredOn = false;
        WaterLevel = 0;
        System.out.println(MachineName + " has been reset.");
    }
}