import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArr;
        do {
            sizeOfArr = inputInt("Enter the size of array:");
            if (sizeOfArr > 20) {
                System.out.println("Size does not exceed 20, try again!");
            }
        } while (sizeOfArr > 20);

        int[] arr = new int[sizeOfArr];

        inputArr(arr);

        outputArr(arr, "Elements in array:");

        revArr(arr);

        outputArr(arr, "Elements after reverse array:");
    }

    public static void revArr(int[] arr) {
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static int inputInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
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


}

