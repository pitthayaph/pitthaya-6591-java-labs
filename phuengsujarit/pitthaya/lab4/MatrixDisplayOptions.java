package phuengsujarit.pitthaya.lab4;

import java.util.Scanner;

public class MatrixDisplayOptions {
    private static int[][] matrix; // defined matrix
    private static int rows;
    private static int columns;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();

    }

    private static void Menu() { // method menu for choose type of matrix
        System.out.println("Select matrix initialization method:");
        System.out.println("1. User Input");
        System.out.println("2. Random Numbers");
        System.out.println("3. All Zeros");
        System.out.println("4. All Ones");
        System.out.println("5. Diagonal Matrix");
        System.out.print("Enter choice (1-5): ");
        int option = scanner.nextInt();

        if (option == 1) {
            inputMatrixDimensions();
        } else if (option == 2) {
            randomMatrix();
        } else if (option == 3) {
            allZerosMatrix();
        } else if (option == 4) {
            allOnesMatrix();
        } else if (option == 5) {
            diagonalMatrix();
        }

    }

    private static void inputMatrixDimensions() { // user input matrix

        do {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            columns = scanner.nextInt();

            if (rows <= 0 || columns <= 0) { // check rows and column
                System.out.println("Both rows and columns must be greater than 0. Please try again.");
            }
        } while (rows <= 0 || columns <= 0);

        matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        displayMatrix();
    }

    private static void randomMatrix() {
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        initializeMatrix();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Random number between 0 and 9
            }
        }
        displayMatrix();
    }

    private static void allZerosMatrix() { // create all zero matrix
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        initializeMatrix();
        displayMatrix();
    }

    private static void allOnesMatrix() { // create all one matrix
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        initializeMatrix();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = 1;
            }
        }
        displayMatrix();
    }

    private static void diagonalMatrix() { // create diagonal matrix
        System.out.print("Enter the number of rows and columns for diagonal matrix: ");
        int size = scanner.nextInt();
        rows = size;
        columns = size;
        initializeMatrix();
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Diagonal elements set to 1
        }
        displayMatrix();
    }

    private static void initializeMatrix() { // create matrix
        matrix = new int[rows][columns];
    }

    private static void displayMatrix() { // show matrix
        System.out.println("Displaying Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
