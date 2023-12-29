package phuengsujarit.pitthaya.lab4;

import java.util.Scanner;

public class MatrixOperations {

    private static int[][] matrix;  // defined matrix
    private static int rows;
    private static int columns;
    static Scanner scanner = new Scanner(System.in);
    static int option;

    public static void main(String[] args) {
        Menu();
        matrixoperation();

    }

    private static void Menu() { // method menu for choose type of matrix
        System.out.println("Matrix Creation Options:");
        System.out.println("1. User Input Matrix");
        System.out.println("2. Random Matrix (0-9)");
        System.out.println("3. All Zeros Matrix");
        System.out.println("4. All Ones Matrix");
        System.out.println("5. Diagonal Matrix");
        System.out.print("Choose an option (1-5): ");
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

            if (rows <= 0 || columns <= 0) {// check rows and column
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

    private static void allOnesMatrix() {// create all one matrix
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
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        rows = size;
        columns = size;
        initializeMatrix();
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Diagonal elements set to 1
        }
        displayMatrix();
    }

    private static void initializeMatrix() {// create matrix
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

    private static void matrixoperation() { // ask user for matrix operation
        System.out.println("Choose an operations:");
        System.out.println("1. Find Transpose of the Matrix");
        System.out.println("2. Calculate Sum of Rows and Columns");
        System.out.println("3. Find Minimum and Maximum Elements");
        System.out.println("4. Display Diagonal Elements");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        int option = scanner.nextInt();

        if (option == 1) {
            transposeMatrix();
            matrixoperation();
        } else if (option == 2) {
            sumOfRowsAndColumns();
            matrixoperation();
        } else if (option == 3) {
            findMinAndMaxElements();
            matrixoperation();
        } else if (option == 4) {
            displayDiagonalElements();
            matrixoperation();
        }

    }

    private static void transposeMatrix() { // transpose matrix
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Displaying Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();

        }
        matrix = transposedMatrix;

    }

    private static void sumOfRowsAndColumns() { // calculate sum of rows and column
        int[] rowSums = new int[rows];
        int[] columnSums = new int[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSums[i] += matrix[i][j];
                columnSums[j] += matrix[i][j];
            }
        }

        System.out.println("Row Sums:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        System.out.println("Column Sums:");
        for (int j = 0; j < columns; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnSums[j]);
        }
    }

    private static void findMinAndMaxElements() { // show minimum and maximum value
        int minElement = matrix[0][0];
        int maxElement = matrix[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum Value: " + maxElement);
        System.out.println("Minimum Value: " + minElement);

    }

    private static void displayDiagonalElements() { //show main diagonal

        System.out.println("Main Diagonal:");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }
}
