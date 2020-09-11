import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = inputInt("Enter your choice: ");
            double temp;
            switch (choice) {
                case 1:
                    temp = inputDouble("Enter temperature:");
                    System.out.println(temp + " degree Fahrenheit = " + convertToCel(temp) + " degree Celsius");
                    break;
                case 2:
                    temp = inputDouble("Enter temperature:");
                    System.out.println(temp + " degree Celsius = " + convertToFah(temp) + " degree Fahrenheit");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while(true);
    }

    public static void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
    }

    public static int inputInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double inputDouble(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double convertToCel(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }

    public static double convertToFah(double celsius) {
        return celsius / (5.0 / 9) + 32;
    }
}
