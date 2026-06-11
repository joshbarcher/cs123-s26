package coffee.demo;

import coffee.problem.CoffeeMachine;

/**
 * Demo for the coffee machine program.
 *
 * @author Josh Archer
 * @version 1.0
 */
public class CoffeeMachineDemo {
    private static final double PRICE = 3.50;
    private static final int WATER = 500;
    private static final int BEANS = 50;

    /**
     * Entry point of my application
     */
    static void main() {

        System.out.println("=== Coffee Machine Demo ===\n");

        CoffeeMachine machine = new CoffeeMachine("BrewBot 3000", PRICE);

        // Try brewing before powering on
        System.out.println("-- Attempting brew before power on --");
        machine.brewCoffee();

        // Power on and fill up
        System.out.println("\n-- Starting up --");
        machine.powerOn();
        machine.addWater(WATER);
        machine.addBeans(BEANS);

        // Brew a couple of cups
        System.out.println("\n-- Brewing --");
        if (machine.brewCoffee()) {
            System.out.println("First cup was poured successfully");
        }
        machine.brewCoffee();
        machine.brewCoffee();

        // Check revenue and status
        System.out.println("\n-- Status report --");
        System.out.println(machine.getStatus());
        System.out.printf("Total revenue: $%.2f%n", machine.getTotalRevenue());

        // Drain the water and try to brew
        System.out.println("\n-- Running low --");
        machine.addWater(100);
        machine.brewCoffee();
        machine.brewCoffee(); // should fail — not enough water

        // Reset and check state
        System.out.println("\n-- Resetting --");
        machine.reset();
        System.out.println(machine.getStatus());

        System.out.println("\n=== End of Demo ===");
    }
}