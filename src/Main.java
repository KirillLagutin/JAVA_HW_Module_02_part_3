import java.util.Scanner;

/*
Задание 2
Создайте шаблонный класс «Матрица». Необходимо реализовать:
 ■заполнение матрицы с клавиатуры;
 ■заполнение случайными значениями;
 ■отображение матрицы;
 ■поиск максимального и минимального элемента;
 ■подсчет среднеарифметического значения.
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, choice;

        System.out.println("Введите размеры Матрицы, два числа:");
        x = in.nextInt();
        y = in.nextInt();

        var matrix = new Matrix(x, y);

        System.out.println("Выберите вариант заполнения Матрицы");
        System.out.println("1 - рандомно заполнить Матрицу");
        System.out.println("2 - вручную заполнить Матрицу");
        choice = in.nextInt();

        switch (choice){
            case 1 -> matrix.initRandomMatrix();
            case 2 -> matrix.initMatrix();
            default -> System.out.println("\nНеверный ввод, вывожу ноли!");
        }

        System.out.println("\nПолученная Матрица:");
        matrix.showMatrix();

        System.out.println("\nМинимум и максимум Матрицы:");
        matrix.maxMin();

        System.out.printf("\nСреднеарифметическое = %.2f", matrix.average());
        System.out.println();
    }
}
