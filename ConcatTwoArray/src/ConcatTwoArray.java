import java.util.Scanner;

public class ConcatTwoArray {
    public static void main(String[] args) {

        int sizeOfArr1 = checkSize();
        int[] arr1 = new int[sizeOfArr1];
        inputArr(arr1);


        int sizeOfArr2 = checkSize();
        int[] arr2 = new int[sizeOfArr2];
        inputArr(arr2);

        outputArr(arr1, "Element in array 1:");
        outputArr(arr2, "Element in array 2:");

        int[] newArr = concatArray(arr1, arr2);
        outputArr(newArr, "Array after concatenate: ");
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

    public static int checkSize() {
        int size;
        do {
            size = inputInt("Enter size of array:");
            if (size > 20) {
                System.out.println("Size should not exceed 20!");
            }
        } while (size > 20);
        return size;
    }

    public static int[] concatArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0;
        for (int j = 0; j < arr1.length; j++, i++) {
            newArr[i] = arr1[j];
        }
        for (int j = 0; j < arr2.length; j++, i++) {
            newArr[i] = arr2[j];
        }
        return newArr;
    }
}
