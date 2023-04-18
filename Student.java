import java.util.*;

public class Student {
    int age;
    String name, city;
    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter the name of student : ");
        name = sc.nextLine();
        System.out.print("Enter the age : ");
        age = sc.nextInt();
        System.out.print("Enter the city of the student : ");
        city = sc.next();
    }

    public void printData() {
        System.out.print("\n");
        System.out.println("Name of the student is : " + name);
        System.out.println("Age of the student is : " + age);
        System.out.println("City of the student is : " + city);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.getData();
        s1.printData();
        s2.getData();
        s2.printData();

    }
}
