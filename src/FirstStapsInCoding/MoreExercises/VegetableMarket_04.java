package FirstStapsInCoding.MoreExercises;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfVegetables = Double.parseDouble(scanner.nextLine());
        double priceOfFruits = Double.parseDouble(scanner.nextLine());
        int vegetableWeight = Integer.parseInt(scanner.nextLine());
        int fruitWeight = Integer.parseInt(scanner.nextLine());
        double total = (priceOfVegetables * vegetableWeight + priceOfFruits * fruitWeight) / 1.94;
        System.out.printf("%.2f", total);
    }
}
