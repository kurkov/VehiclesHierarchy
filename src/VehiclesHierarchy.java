public class VehiclesHierarchy {

    public abstract static class Vehicle {
        String name;
        int numberOfWheels;
    }

    public interface VehicleInterface {
        void displayWheels();
    }

    public static class Car extends Vehicle implements VehicleInterface {

        Car(String name) {
            this.name = name;
            numberOfWheels = 4;
            System.out.println("Created a new vehicle: Car.");
        }

        @Override
        public void displayWheels() {
            System.out.format("Car \"%s\" has %d wheels.%n", name, numberOfWheels);
        }
    }

    public static class Hydroplane extends Vehicle implements VehicleInterface {

        Hydroplane(String name) {
            this.name = name;
            numberOfWheels = 0;
            System.out.println("Created a new vehicle: Hydroplane.");
        }

        @Override
        public void displayWheels() {
            System.out.format("Hydroplane \"%s\" has %d wheels.%n", name, numberOfWheels);
        }
    }

    public static void main(String[] args) {

        Car car = new Car("Tesla");
        Hydroplane hydroplane = new Hydroplane("PowerBoat");

        car.displayWheels();
        hydroplane.displayWheels();
    }
}

/* ----OUTPUT----
Created a new vehicle: Car.
Created a new vehicle: Hydroplane.
Car "Tesla" has 4 wheels.
Hydroplane "PowerBoat" has 0 wheels.
*/

