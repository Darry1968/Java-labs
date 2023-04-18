import java.util.*;

class Student1 {
    int roll_no;
    String name;
    float percentage;
    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter the name of student : ");
        name = sc.nextLine();
        System.out.print("Enter the roll no of student : ");
        roll_no = sc.nextInt();
        System.out.print("Enter the percentage of student : ");
        percentage = sc.nextFloat();
    }

    public void PrintData() {
        System.out.printf("Name of student : %s", name);
        System.out.println();
        System.out.printf("Roll no of student : %d", roll_no);
        System.out.println();
        System.out.printf("Percentage of student : %f", percentage);
        System.out.println();
    }
}

public class Lab2 {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.getData();
        s1.PrintData();
        s2.getData();
        s2.PrintData();

    }

}