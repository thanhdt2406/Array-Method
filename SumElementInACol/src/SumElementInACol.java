import java.util.Scanner;

public class SumElementInACol {
    public static void main(String[] args) {
        int row = inputInt("Enter rows:");
        int col = inputInt("Enter cols:");

        int[][] arr = new int[row][col];
        input2DimeArr(arr);
        outputArr(arr,"Element in two-dimensional array: ");

        int column = inputInt("Enter the column for which you want to sum the elements: ");

        System.out.println("The sum of the elements in the column '"+column+"' is: "+sumCol(arr,column));
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

    public static int sumCol(int[][] arr, int col){
        int sum = 0;
        for (int[] i : arr) {
            sum += i[col-1];
        }
        return sum;
    }
}
