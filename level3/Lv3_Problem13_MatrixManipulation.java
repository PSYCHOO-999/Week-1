import java.util.Random;

public class Lv3_Problem13_MatrixManipulation {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);  // Random numbers between 0 and 9
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible: Column count of A should match row count of B.");
            return new int[0][0];
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);

        return det;
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist: Determinant is zero.");
            return new double[0][0];
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / det;
        inverse[0][1] = (double) -matrix[0][1] / det;
        inverse[1][0] = (double) -matrix[1][0] / det;
        inverse[1][1] = (double) matrix[0][0] / det;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist: Determinant is zero.");
            return new double[0][0];
        }

        double[][] inverse = new double[3][3];

        // Calculate cofactor matrix and then the inverse
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) det;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) det;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) det;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) det;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) det;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a matrix (for inverse and 3x3 matrices)
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating random matrices A and B
        int rowsA = 3, colsA = 3;
        int rowsB = 3, colsB = 3;
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        // Display matrices
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Matrix addition
        int[][] addedMatrix = addMatrices(matrixA, matrixB);
        System.out.println("A + B:");
        displayMatrix(addedMatrix);

        // Matrix subtraction
        int[][] subtractedMatrix = subtractMatrices(matrixA, matrixB);
        System.out.println("A - B:");
        displayMatrix(subtractedMatrix);

        // Matrix multiplication
        int[][] multipliedMatrix = multiplyMatrices(matrixA, matrixB);
        System.out.println("A * B:");
        displayMatrix(multipliedMatrix);

        // Transpose of matrix A
        int[][] transposeA = transposeMatrix(matrixA);
        System.out.println("Transpose of A:");
        displayMatrix(transposeA);

        // Determinant of matrix A (2x2 or 3x3)
        if (matrixA.length == 2 && matrixA[0].length == 2) {
            System.out.println("Determinant of A: " + determinant2x2(matrixA));
        } else if (matrixA.length == 3 && matrixA[0].length == 3) {
            System.out.println("Determinant of A: " + determinant3x3(matrixA));
        }

        // Inverse of matrix A (2x2 or 3x3)
        if (matrixA.length == 2 && matrixA[0].length == 2) {
            double[][] inverseA = inverse2x2(matrixA);
            System.out.println("Inverse of A:");
            displayMatrix(inverseA);
        } else if (matrixA.length == 3 && matrixA[0].length == 3) {
            double[][] inverseA = inverse3x3(matrixA);
            System.out.println("Inverse of A:");
            displayMatrix(inverseA);
        }
    }
}
