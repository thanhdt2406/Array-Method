import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name: ");
        String student = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                System.out.println("Found student " + student + " at index " + i + "!");
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.println("Not found student " + student);
        }
    }
}
