package coffee.demo;

import coffee.problem.CoffeeMachine;

public class CoffeeMachineDemo {

    public static void main(String[] args) {

        System.out.println("=== Coffee Machine Demo ===\n");

        CoffeeMachine machine = new CoffeeMachine("BrewBot 3000", 3.50);

        // Try brewing before powering on
        System.out.println("-- Attempting brew before power on --");
        machine.brewCoffee();

        // Power on and fill up
        System.out.println("\n-- Starting up --");
        machine.powerOn();
        machine.addWater(500);
        machine.addBeans(50);

        // Brew a couple of cups
        System.out.println("\n-- Brewing --");
        machine.brewCoffee();
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