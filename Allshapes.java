
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Rectangle extends Allshape {

    Scanner sc = new Scanner(System.in);

    void print_Area() {
        int l;
        int b;
        System.out.print("Enter the value of l : ");
        l = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        int area;
        area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }
}

class Circle extends Allshape {
    Scanner sc = new Scanner(System.in);

    void print_Area() {
        int r = 12;
        System.out.print("Enter the value of r : ");
        r = sc.nextInt();
        double area;
        area = (3.14 * r * r);
        System.out.println("Area of circle is: " + area);
    }
}

class Traingle extends Allshape {
    Scanner sc = new Scanner(System.in);

    void print_Area() {
        int h;
        int b;
        System.out.print("Enter the value of h : ");
        h = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        double area;
        area = (0.5 * h * b);
        System.out.println("Area of rectangle is: " + area);
    }
}

abstract class Allshape {

    abstract void print_Area();

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Traingle t1 = new Traingle();

        c1.print_Area();
        r1.print_Area();
        t1.print_Area();
    }
}
