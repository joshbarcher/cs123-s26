package coffee.test;

import coffee.problem.CoffeeMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeMakerTests {
    private CoffeeMachine machine;

    @BeforeEach
    public void setup() {
        //this will run before each test
        machine = new CoffeeMachine("Test Machine", 3.50);
    }

    @Test
    public void testPoweredOn() {
        machine.powerOn();
        Assertions.assertTrue(machine.isPoweredOn());
    }

    @Test
    public void testEmptyWater() {
        boolean result = machine.brewCoffee();
        Assertions.assertFalse(result);
    }

    @Test
    public void testBrewAfterAddingWater() {
        machine.addWater(500);

        boolean result = machine.brewCoffee();
        Assertions.assertTrue(result);
    }

    @Test
    public void revenueTest() {
        machine.addWater(500);

        //make three cups of water
        for (int i = 1; i <= 3; i++) {
            machine.brewCoffee();
        }

        double expectedRevenue = 3 * 3.50;
        Assertions.assertEquals(expectedRevenue, machine.getTotalRevenue());
    }
}
