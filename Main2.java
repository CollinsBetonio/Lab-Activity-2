public class Main {
    public static void printDetails(Vehicle2 vehicle) {
        vehicle.displayInfo();
    }

    public static void printAbstractDetails(Vehicle2 vehicle) {
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
    }

    public static void main(String[] args) {
        Vehicle2 vehicle = new Car("Ford", "Mustang", 1967, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Honda", "Beat", 2026, "Automatic");
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Truck("Mitsubishi", "Traviz", 2019, 2);
        vehicle.displayInfo();
        System.out.println();

        System.out.println("\n=== Method Parameter===");
        Car car = new Car("BYD", "Sealion", 2026, 4);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja ZX-10R", 2025, "1000cc");
        Truck truck = new Truck("Isuzu", "Fuso Canter", 2011, "Manual");

        printDetails(car);
        System.out.println();
        printDetails(motorcycle);
        System.out.println();
        printDetails(truck);
        System.out.println();

        System.out.println("\n===Polymorphic Array===");
        Vehicle2[] vehicles = {
            new Car("Nissan", "Juke", 2018, 2),
            new Motorcycle("Ducati", "Panigale V4", 2024, "Manual"),
            new Truck("Mitsubishi", "L300", 2022, "Manual")
        };

        for (Vehicle2 currentVehicle : vehicles) {
            printDetails(currentVehicle);
            printAbstractDetails(currentVehicle);
            System.out.println();
        }
    }
}
