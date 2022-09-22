import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private final int rows;
    private final int columns;
    private int[][] matrix;

    public Matrix(int rows, int columns) {

        if(rows <= 0 || columns <= 0) {
            System.out.println("Положительные числа, пожалуйста!");
        }

        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    Scanner in = new Scanner(System.in);
    Random random = new Random();

    public void initMatrix() {
        for(int i = 0; i < rows; i++) {
            System.out.println("Введите " + (i+1) + " строку");
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public void initRandomMatrix() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public void showMatrix() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void maxMin() {
        int min = matrix[0][0];
        int max = matrix[0][0];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(matrix[i][j] < min) min = matrix[i][j];
                if(matrix[i][j] > max) max = matrix[i][j];
            }
        }
        System.out.println("Min = " + min +", Max = " + max);
    }

    public double average() {
        double result = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                result += matrix[i][j];
            }
        }
        return result / (rows * columns);
    }
}