package phuengsujarit.pitthaya.lab4;

import java.util.Scanner;

public class MatrixDisplay {
    private static int[][] matrix;
    private static int rows;
    private static int columns;

    public static void main(String[] args) {
        inputMatrixDimensions();
        inputMatrixElements();
        displayMatrix();
    }

    private static void inputMatrixDimensions() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            columns = scanner.nextInt();

            if (rows <= 0 || columns <= 0) {
                System.out.println("Both rows and columns must be greater than 0. Please try again.");
            }
        } while (rows <= 0 || columns <= 0);

        matrix = new int[rows][columns];
    }

    private static void inputMatrixElements() {
        Scanner scanner = new Scanner(System.in);

        

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + i  + "]" + "["+ j  + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void displayMatrix() {
        System.out.println("Displaying Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

