import java.util.*;

abstract class Vehicle {

    public abstract void getData();

    public abstract void printData();
}

class TwoWheeler extends Vehicle {
    private String color;
    private int price;
    Scanner input = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter TwoWheeler color: ");
        color = input.nextLine();
        System.out.print("Enter TwoWheeler price: ");
        price = input.nextInt();
    }

    public void printData() {
        System.out.println("TwoWheeler Details:");
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

class FourWheeler extends Vehicle {
    private String color;
    private int price;
    Scanner input = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter FourWheeler color: ");
        color = input.nextLine();
        System.out.print("Enter FourWheeler price: ");
        price = input.nextInt();
    }

    public void printData() {
        System.out.println("FourWheeler Details:");
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

public class VehicleMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter choice of vehicle:");
        System.out.println("1. Two Wheeler");
        System.out.println("2. Four Wheeler");
        int choice = input.nextInt();

        Vehicle vehicle;
        switch (choice) {
            case 1:
                vehicle = new TwoWheeler();
                vehicle.getData();
                vehicle.printData();
                break;
            case 2:
                vehicle = new FourWheeler();
                vehicle.getData();
                vehicle.printData();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
