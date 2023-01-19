import java.util.Scanner;

public class Validation {
    private final static Scanner scanner = new Scanner(System.in);


    public static int correctLowerBorder(int lowerBorder, int lowerLimit, int upperLimit) {
        while (lowerBorder < lowerLimit || lowerBorder > upperLimit) {
            System.out.println("The lower limit must be greater than " + lowerLimit + " and must be lower than " + upperLimit);
            lowerBorder = scanner.nextInt();
            scanner.nextLine();
        }
        return lowerBorder;
    }

    public static int correctUpperBorder(int upperBorder, int upperLimit, int lowerBorder) {
        while (upperBorder > upperLimit || upperBorder <= lowerBorder) {
            System.out.println("The upper limit must be lower than " + upperLimit + " and must be greater than " + lowerBorder);
            upperBorder = scanner.nextInt();
            scanner.nextLine();
        }
        return upperBorder;
    }


    public static int correctOption(int option, int numberOfOption) {
        while (option < 1 || option > numberOfOption) {
            System.out.println("Number must be within the range 1-" + numberOfOption + " inclusive.");
            System.out.println("Please enter correct number:");
            option = scanner.nextInt();
            scanner.nextLine();
        }
        return option;
    }


}
