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

        this.rows    = rows;
        this.columns = columns;
        this.matrix  = new int[rows][columns];
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
                matrix[i][j] = random.nextInt(10);
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
}