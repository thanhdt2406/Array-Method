import java.util.Scanner;

public class BoardGame {
    public static void main(String[] args) {
        int row = inputInt("Enter rows:");
        int col = inputInt("Enter cols:");

        int[][] boardInt = new int[row][col];
        char[][] boardGame = new char[row][col];

        int numBomb = inputInt("Enter number of bomb: ");
        for (int i = 0; i < numBomb; i++) {
            int rowBomb;
            int colBomb;
            do{
                rowBomb = inputInt("Enter row of bomb " + i);
                colBomb = inputInt("Enter col of bomb " + i);
            }while(boardInt[rowBomb][colBomb]==-1);
            setElement(boardInt, rowBomb, colBomb, -1);
            increaseAround(boardInt, rowBomb, colBomb);
        }

        createBoard(boardGame,boardInt);
        outputArr(boardGame,"Board: ");
    }


    public static int inputInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void setElement(int[][] arr, int row, int col, int element) {
        arr[row][col] = element;
    }

    public static void outputArr(char[][] arr, String message) {
        System.out.println(message);
        for (char[] i : arr) {
            for (int j : i) {
                if(j==42){
                    System.out.print("*\t");
                }else{
                    System.out.print(j+"\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void increaseAround(int[][] arr, int row, int col) {
        if (row == 0) {
            if (col == 0) {
                for (int i = row; i <= row + 1; i++) {
                    for (int j = col; j <= col + 1; j++) {
                        checkPos(arr, i, j);
                    }
                }
            } else if (col == arr[row].length - 1) {
                for (int i = row; i <= row + 1; i++) {
                    for (int j = col; j >= col - 1; j--) {
                        checkPos(arr, i, j);
                    }
                }
            } else {
                for (int i = row; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        checkPos(arr, i, j);
                    }
                }
            }
        } else if (row == arr.length - 1) {
            if (col == 0) {
                for (int i = row - 1; i <= row; i++) {
                    for (int j = col; j <= col + 1; j++) {
                        checkPos(arr, i, j);
                    }
                }
            } else if (col == arr[row].length - 1) {
                for (int i = row - 1; i <= row; i++) {
                    for (int j = col; j >= col - 1; j--) {
                        checkPos(arr, i, j);
                    }
                }
            } else {
                for (int i = row - 1; i <= row; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        checkPos(arr, i, j);
                    }
                }
            }
        } else {
            if (col == 0) {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col; j <= col + 1; j++) {
                        checkPos(arr, i, j);
                    }
                }
            } else if (col == arr[row].length - 1) {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col; j >= col - 1; j--) {
                        checkPos(arr, i, j);
                    }
                }
            } else {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        checkPos(arr, i, j);
                    }
                }
            }
        }

    }

    public static void checkPos(int[][] arr, int row, int col) {
        if (arr[row][col] != -1) {
            arr[row][col]++;
        }
    }

    public static void createBoard(char[][] arr,int[][] arr2){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr2[i][j]!=-1){
                arr[i][j]=(char) arr2[i][j];
                } else{
                    arr[i][j] = '*';
                }
            }
        }
    }
}