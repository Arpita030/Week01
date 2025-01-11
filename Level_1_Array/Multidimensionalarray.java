import java.util.Scanner;

public class Multidimensionalarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of row: ");
        int row = input.nextInt();
        System.out.print("Enter number of columns: ");
        int col = input.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[row * col];
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.print("The 1D array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
