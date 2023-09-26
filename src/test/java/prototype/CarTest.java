package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        Car car = new Car("Compass", new Brand("Jeep"));

        Car carClone = (Car) car.clone();
        carClone.setModel("Compass Clone");
        carClone.getBrand().setName("Jeep Clone");

        assertEquals("Car { model: 'Compass', Brand { name: 'Jeep' }; }", car.toString());
        assertEquals("Car { model: 'Compass Clone', Brand { name: 'Jeep Clone' }; }", carClone.toString());
    }

}
