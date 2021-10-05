package ForLoop.exercises;

import java.util.Scanner;

public class Oscars_06<sumPoints> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryNum = Integer.parseInt(scanner.nextLine());
        String juryName = scanner.nextLine();
        double juryPoints = Double.parseDouble(scanner.nextLine());
        double sumPoints = 0.0;

        for (int i = 0; i < juryNum; i++){
            int length = juryName.length();
            sumPoints = academyPoints+(length*juryPoints/2);
        }
        if(sumPoints>1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %f!", name,sumPoints);
        }
        else {
            System.out.printf("Sorry, %s you need %f more!",name, 1250.5-sumPoints);
        }
    }
}
