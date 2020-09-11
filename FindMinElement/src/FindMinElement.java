import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        int sizeOfArr;
        do {
            sizeOfArr = inputInt("Enter size of array:");
            if (sizeOfArr > 20) {
                System.out.println("Size should not exceed 20!");
            }
        } while (sizeOfArr > 20);

        int[] arr = new int[sizeOfArr];

        inputArr(arr);
        outputArr(arr, "Element in array:");

        System.out.println("Min element is: " + findMinElement(arr));
    }

    public static int inputInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputInt("Enter a[" + i + "]:");
        }
    }

    public static void outputArr(int[] arr, String message) {
        System.out.println(message);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
