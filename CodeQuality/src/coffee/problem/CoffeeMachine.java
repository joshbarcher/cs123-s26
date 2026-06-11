package coffee.problem;

/**
 * Represents a coffee machine.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class CoffeeMachine {
    private static final int MIN_WATER = 150;
    private int waterLevel;
    private int beansGrams;
    private boolean isPoweredOn;
    private String machineName;
    private int cupsMade;
    private double pricePerCup;

    /**
     * Creates a coffee machine
     * @param name the name of the machine
     * @param price the price per cup
     */
    public CoffeeMachine(String name, double price) {
        machineName = name;
        pricePerCup = price;
        waterLevel = 0;
        beansGrams = 0;
        isPoweredOn = false;
        cupsMade = 0;
    }

    /**
     * Turns the machine on
     */
    public void powerOn() {
        isPoweredOn = true;
        System.out.println(machineName + " is now ON.");
    }

    /**
     * Add water to the machine
     * @param milliliters the amount of water
     */
    public void addWater(int milliliters) {
        waterLevel = waterLevel + milliliters;
        System.out.println("Added " + milliliters + "milliliters. Water level: " +
                waterLevel + "milliliters");
    }

    /**
     * Adds beans to the machine.
     * @param grams the amount of beans
     */
    public void addBeans(int grams) {
        beansGrams = beansGrams + grams;
        System.out.println("Added " + grams + "g beans. Total: " + beansGrams + "g");
    }

    /**
     * Brews coffee.
     * @return return true if the brewing was successful, otherwise false
     */
    public boolean brewCoffee() {
        if (waterLevel < MIN_WATER) {
            System.out.println("Not enough water!");
            return false;
        }

        waterLevel = waterLevel - MIN_WATER;
        cupsMade = cupsMade + 1;
        System.out.println("Brewing cup #" + cupsMade + ". Enjoy!");

        return true;
    }

    /**
     * Returns the total revenue.
     * @return the revenue
     */
    public double getTotalRevenue() {
        return cupsMade * pricePerCup;
    }

    /**
     * Returns the state of the machine
     * @return the state of the machine as a string
     */
    public String getStatus() {
        return "Machine: " + machineName +
                " | On: " + isPoweredOn +
                " | Water: " + waterLevel + "ml" +
                " | Cups made: " + cupsMade;
    }

    /**
     * Reset the machine.
     */
    public void reset() {
        isPoweredOn = false;
        waterLevel = 0;
        System.out.println(machineName + " has been reset.");
    }

    /**
     * Getter for water level
     * @return the water level
     */
    public int getWaterLevel() {
        return waterLevel;
    }
    /**
     * Getter for beans
     * @return the beans
     */
    public int getBeansGrams() {
        return beansGrams;
    }
    /**
     * Getter for powered on state
     * @return the powered on state
     */
    public boolean isPoweredOn() {
        return isPoweredOn;
    }
    /**
     * Getter for machine name
     * @return the machine name
     */
    public String getMachineName() {
        return machineName;
    }
    /**
     * Getter for cups made
     * @return the cups made
     */
    public int getCupsMade() {
        return cupsMade;
    }
    /**
     * Getter for price per cup
     * @return the price per cup
     */
    public double getPricePerCup() {
        return pricePerCup;
    }

    public String toString() {
        return "CoffeeMachine{" +
                "isPoweredOn=" + isPoweredOn +
                '}';
    }
}