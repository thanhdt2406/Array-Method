import java.util.Scanner;

public class AddElementToArray {
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

        int element = inputInt("Enter element: ");
        int index = inputInt("Enter index: ");

        int[] result = addElement(arr, index, element);
        outputArr(result, "Array after add:");

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


    public static int[] addElement(int[] arr, int index, int element) {
        int[] result = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                result[j] = arr[i];
                j++;
            } else {
                result[j] = element;
                result[j + 1] = arr[i];
                j += 2;
            }
        }
        return result;
    }
}
