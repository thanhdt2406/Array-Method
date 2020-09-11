import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        int size = checkInput("Enter number of the students: ", "Number of the students must between 0 and 30", 30);
        double[] arrStudent = new double[size];
        inputArr(arrStudent);

        outputArr(arrStudent, "List student:");

        System.out.println("The number of students passing is: " + countPass(arrStudent));
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

    public static void inputArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checkInput("Enter mark of student[" + i + "]:", "Mark must between 0 and 10", 10.0);
        }
    }

    public static void outputArr(double[] arr, String message) {
        System.out.println(message);
        System.out.printf("%-20s%2s", "Student", "Mark");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\n%-20s%2.2f", "Student " + (i + 1), arr[i]);
        }
        System.out.println();
    }

    public static int checkInput(String message1, String message2, int maxSize) {
        int size;
        do {
            size = inputInt(message1);

            if (size < 0 || size > maxSize) {
                System.out.println(message2);
            } else if (size == 0) {
                System.out.println("Empty array! Try again!!!");
            }
        } while (size <= 0 || size > maxSize);
        return size;
    }

    public static double checkInput(String message1, String message2, double maxMark) {
        double mark;
        do {
            mark = inputDouble(message1);

            if (mark < 0 || mark > maxMark) {
                System.out.println(message2);
            }
        } while (mark < 0 || mark > maxMark);
        return mark;
    }

    public static int countPass(double[] arr) {
        int count = 0;
        for (double i : arr) {
            if (i >= 5) {
                count++;
            }
        }
        return count;
    }
}
