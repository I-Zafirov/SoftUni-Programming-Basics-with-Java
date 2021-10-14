package ForLoop.мoreExercises;

import java.util.Scanner;

public class x01_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        double yearMustLive = Double.parseDouble(scanner.nextLine());

        int countYears = 18;

        for (int years = 1800; years <= yearMustLive; years++) {

            if (years % 2 == 0) {
                inheritedMoney -= 12000;
            } else {
                inheritedMoney -= 12000 + countYears * 50;
            }
            countYears++;
        }
        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",
                    inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.",
                    Math.abs(inheritedMoney));
        }
    }
}
