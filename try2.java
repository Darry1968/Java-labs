import java.util.*;

class Vehicle {
    int registration_no;
    String color;
    String type_of_vehicle;

    public Vehicle(int registration_no, String color, String type_of_vehicle) {
        this.registration_no = registration_no;
        this.color = color;
        this.type_of_vehicle = type_of_vehicle;
    }

    public void getData(Scanner sc) {
        System.out.print("Enter the Registration number : ");
        this.registration_no = sc.nextInt();
        System.out.print("Enter the Color : ");
        this.color = sc.next();
        System.out.print("Enter the Type of vehicle : ");
        this.color = sc.next();
    }

    public void Display() {
        System.out.println("Registration No: " + registration_no);
        System.out.println("Color          : " + color);
        System.out.println("Type of Vehicle: " + type_of_vehicle);
    }
}

class Car extends Vehicle {
    int Cubic_Centimeter;
    String fuel_type;

    public Car(int RN, String clr, String TOV, int CC, String FT) {
        super(CC, FT, clr);
        this.Cubic_Centimeter = CC;
        this.fuel_type = FT;
    }

    @Override
    public void getData(Scanner sc) {
        super.getData(sc);
        System.out.print("Enter the cc: ");
        this.Cubic_Centimeter = sc.nextInt();
        System.out.print("Enter the fuel type: ");
        this.fuel_type = sc.next();
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("CC             : " + Cubic_Centimeter);
        System.out.println("Type of Fuel   : " + fuel_type);
    }
}

class Truck extends Vehicle {
    int weight_capacity;
    String fuel_type;

    public Truck(int registration_no, String color, String type_of_vehicle, int weight_capacity, String fuel_type) {
        super(registration_no, color, type_of_vehicle);
        this.weight_capacity = weight_capacity;
        this.fuel_type = fuel_type;
    }

    @Override
    public void getData(Scanner sc) {
        super.getData(sc);
        System.out.print("Enter the weight capacity: ");
        this.weight_capacity = sc.nextInt();
        System.out.print("Enter the fuel type: ");
        this.fuel_type = sc.next();
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Weight Capacity: \t" + weight_capacity);
        System.out.println("Type of Fuel: \t" + fuel_type);
    }
}

class Motorcycle extends Vehicle {
    int Cubic_Centimeters;
    String fuel_type;

    public Motorcycle(int registration_no, String color, String type_of_vehicle, int cc, String fuel_type) {
        super(registration_no, color, type_of_vehicle);
        this.Cubic_Centimeters = cc;
        this.fuel_type = fuel_type;
    }

    @Override
    public void getData(Scanner sc) {
        super.getData(sc);
        System.out.print("Enter the cc: ");
        this.Cubic_Centimeters = sc.nextInt();
        System.out.print("Enter the fuel type: ");
        this.fuel_type = sc.next();
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("CC: \t" + Cubic_Centimeters);
        System.out.println("Type of Fuel: \t" + fuel_type);
        System.out.println("\n");
    }
}

public class try2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car(0, "", "", 0, "");
        Truck truck = new Truck(0, "", "", 0, "");
        Motorcycle motor = new Motorcycle(0, "", "", 0, "");
        System.out.println("Enter Details for Car : \n");
        car.getData(sc);
        car.Display();

        System.out.println("Enter Details for Truck: \n");
        truck.getData(sc);
        truck.Display();

        System.out.println("E,nter Details for Motor Cycle: \n");
        motor.getData(sc);
        motor.Display();

    }
}