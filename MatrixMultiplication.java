import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input for first matrix
        System.out.print("Enter number of rows for first matrix: ");
        int rows1 = input.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int cols1 = input.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter elements for first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        
        // Take input for second matrix
        System.out.print("Enter number of rows for second matrix: ");
        int rows2 = input.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int cols2 = input.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter elements for second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        
        // Multiply matrices
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied");
        } else {
            int[][] result = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    int sum = 0;
                    for (int k = 0; k < cols1; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    result[i][j] = sum;
                }
            }
            
            // Print result
            System.out.println("Resultant matrix after multiplication: ");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        
    }
}
