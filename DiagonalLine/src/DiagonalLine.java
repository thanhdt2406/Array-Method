import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        int size = inputInt("Enter size:");

        int[][] arr = new int[size][size];
        input2DimeArr(arr);
        outputArr(arr,"Element in two-dimensional array: ");

        System.out.println("The sum of the elements on the main diagonal is: "+sumMainDiagonal(arr));

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

    public static int sumMainDiagonal(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i][i];
        }
        return sum;
    }
}
