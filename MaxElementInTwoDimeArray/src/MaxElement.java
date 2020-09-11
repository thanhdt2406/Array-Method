import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        int row = inputInt("Enter rows:");
        int col = inputInt("Enter cols:");

        int[][] arr = new int[row][col];
        input2DimeArr(arr);
        outputArr(arr,"Element in two-dimensional array: ");

        System.out.println("Max element is "+findMaxElement(arr));
    }



    public static int inputInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void input2DimeArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = inputInt("Enter a[" + i + "]["+j+"]: ");
            }
        }
    }

    public static void outputArr(int[][] arr, String message) {
        System.out.println(message);
        for (int[] i : arr) {
            for(int j : i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMaxElement(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if(max<j){
                    max=j;
                }
            }
        }
        return max;
    }
}
