import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

class Calorie_test {
    public int ReturnResult(int a) {
        return a;
    }
};

public class CalorieCounter {
    public static void main(String[] args) {
        Calorie_test c1 = new Calorie_test();
        Scanner scanner = new Scanner(System.in);

        // Prompt user for calorie goal
        int calorieGoal = scanner.nextInt();

        // Prompt user for number of meals eaten
        int numMeals = scanner.nextInt();

        int totalCalories = 0;

        // Loop through each meal and prompt user for calories consumed
        for (int i = 1; i <= numMeals; i++) {
            System.out.print("Food Item : " + i + ": ");
            int mealCalories = scanner.nextInt();
            totalCalories += mealCalories;
        }

        // Calculate remaining calories and output result
        int remainingCalories = calorieGoal - totalCalories;
        c1.ReturnResult(remainingCalories);

        scanner.close();
    }
}