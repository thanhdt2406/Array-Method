import java.util.Scanner;

public class RemoveClassInArray {
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
        int element = inputInt("Enter element: ");
        outputArr(arr, "Element in array:");

        int[] result = removeElement(arr,element);
        outputArr(result,"Array after remove:");

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

    public static boolean isExist(int[] arr, int element){
        for (int j : arr) {
            if (j == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeElement(int[] arr, int element){
        while(isExist(arr,element)){
            arr=checkRemove(arr,element);
        }
        return arr;
    }

    public static int[] checkRemove(int[] arr,int element) {
        int[] result = new int[arr.length-1];
        int j=0;
        for (int k : arr) {
            if (k != element) {
                result[j] = k;
                j++;
            }
        }
        return result;
    }
}
