public class VehiclesHierarchy {

  public static class Vehicle {
    String name;
    int numberOfWheels;
  }

  public interface VehicleInterface {
    void getWheels();
  }

  public static class Car extends Vehicle implements VehicleInterface {

    Car(String name) {
      this.name = name;
      numberOfWheels = 4;
      System.out.println("Created a new vehicle: Car.");
    }

    @Override
    public void getWheels() {
      System.out.println("Car \"" + name + "\" has " + numberOfWheels + " wheels.");
    }
  }

  public static class Hydroplane extends Vehicle implements VehicleInterface {

    Hydroplane(String name) {
      this.name = name;
      numberOfWheels = 0;
      System.out.println("Created a new vehicle: Hydroplane.");
    }

    @Override
    public void getWheels() {
      System.out.println("Hydroplane \"" + name + "\" has " + numberOfWheels + " wheels.");
    }
  }

  public static void main(String[] args) {

    Car car = new Car("Tesla");
    Hydroplane hydroplane = new Hydroplane("PowerBoat");

    car.getWheels();
    hydroplane.getWheels();
  }
}

/* ----OUTPUT----
Created a new vehicle: Car.
Created a new vehicle: Hydroplane.
Car "Tesla" has 4 wheels.
Hydroplane "PowerBoat" has 0 wheels.
*/

