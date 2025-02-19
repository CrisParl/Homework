public class Automobile implements Comparable<Automobile> {
    String model;
    int year;
    String brand;

    public Automobile(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }

    public void honk() {
        System.out.println(brand + " " + model + " honks: Beep Beep!");
    }

    public void accelerate() {
        System.out.println(brand + " " + model + " is accelerating.");
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }

    public void reverse() {
        System.out.println(brand + " " + model + " is reversing.");
    }

    @Override
    public int compareTo(Automobile other) {
        return this.year - other.year;
    }

    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Automobile that = (Automobile) obj;
        return year == that.year && model.equals(that.model) && brand.equals(that.brand);
    }
}

class Car extends Automobile {
    public Car(String model, int year, String brand) {
        super(model, year, brand);
    }
}

class SportsCar extends Automobile {
    public SportsCar(String model, int year, String brand) {
        super(model, year, brand);
    }

    @Override
    public void accelerate() {
        System.out.println(brand + " " + model + " is accelerating rapidly!");
    }
}

class JunkCar extends Automobile {
    public JunkCar(String model, int year, String brand) {
        super(model, year, brand);
    }

    @Override
    public void honk() {
        System.out.println(brand + " " + model + " honks: *weak honk*");
    }
}

public class Tester {
    public static void main(String[] args) {
        Automobile[] vehicles = {
            new Car("Civic", 2020, "Honda"),
            new SportsCar("911", 2023, "Porsche"),
            new JunkCar("Camry", 1980, "Toyota")
        };

        for (Automobile vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.honk();
            vehicle.accelerate();
            vehicle.stop();
            vehicle.reverse();
            System.out.println();
        }
    }
}
