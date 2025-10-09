package RedRover.school;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        //Задание 1, необходимо вывести сумму всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("сумма массива = " + sum);

        //Задание 2, необходимо вывести максимальное значение массива
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("максимальное значение массива = " + Arrays.stream(array2).max().getAsInt());


        //Задание 3, необходимо вывести минимальное значение массива.
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("минимальное значение массива = " + Arrays.stream(array2).min().getAsInt());

        //Задание 4, необходимо вывести среднее арифметическое всех значений массива.
        int sum4 = 0;
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : array4) {
            sum4 += num; // складываем все элементы
        }

        int average = sum4 / array4.length; // делим на количество элементов
        System.out.println("Среднее арифметическое: " + average);


        //Экстра задача №1, необходимо вывести сумму элементов массива.
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum5 = 0;

        for (int[] row : array5) {
            for (int num : row) {
                sum5 += num;
            }
        }

        System.out.println("Сумма элементов массива: " + sum5);


        //Экстра задача №2, необходимо вывести максимальное значение массива.
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = 0;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++)
                if (array6[i][j] > max6)
                    max6 = array6[i][j];
        }
        System.out.println( "Максимальное значение массива = "+ max6);

        //Экстра задача №3, необходимо вывести количество элементов в массиве.
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count7 = 0;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++)
                    count7++;
        }
        System.out.println( "Количество элементов в массиве = "+ count7);
    }
}
