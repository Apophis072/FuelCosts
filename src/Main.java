import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tank = -1;
        double MPG = -1;
        double PPG = -1;
        double distance;
        double cost;
        String trash = "N";
        String playAgain = "";
        do {

            do {
                do {
                    //Getting the amount of gas left
                    System.out.println("Input the amount of gas left in the tank");
                    if (in.hasNextDouble()) {
                        tank = in.nextDouble();
                        if (tank >= 0) {
                            trash = "Y";
                            in.nextLine();
                        } else {
                            System.out.println("The amount of gas left in the tank can't be " + tank + ". Try again.");
                            in.nextLine();
                        }
                    } else {
                        System.out.println("This is not a valid input. Try again.");
                        in.nextLine();
                    }
                } while (trash.equals("N"));
            } while (tank < 0);

            //Getting the miles per gallon
            do {
                do {
                    System.out.println("Input the miles per gallon on the vehicle: ");
                    if (in.hasNextDouble()) {
                        MPG = in.nextDouble();
                        if (MPG > 0) {
                            trash = "Y";
                            in.nextLine();
                        } else {
                            System.out.println("The miles per gallon can't be " + MPG + ". Try again.");
                            in.nextLine();
                        }
                    } else {
                        System.out.println("This is not a valid miles per gallon. Try again.");
                        in.nextLine();
                    }
                } while (trash.equals("N"));
            } while (MPG < 0);

            //getting the price per gallon
            do {
                do {
                    System.out.println("Input the price per gallon: ");
                    if (in.hasNextDouble()) {
                        PPG = in.nextDouble();
                        in.nextLine();
                        if (PPG > 0) {
                            trash = "Y";
                        } else {
                            System.out.println("The pricer per gallon can't be " + PPG + ". Try again.");
                        }
                    } else {
                        System.out.println("This is not a valid price per galllon. Try again.");
                        in.nextLine();
                    }
                } while (trash.equals("N"));
            } while (PPG < 0);

            distance = tank * MPG;
            System.out.println("The car can go " + distance + " miles with the gas left in the tank.");

            cost = 100 / MPG * PPG;
            System.out.printf("The cost to travel 100 miles is: %10.2f dollars", cost);

            System.out.println("\nType Y to go again.");
            playAgain = in.nextLine();
        }while (playAgain.equalsIgnoreCase("Y"));
    }
}