package RedRover.school;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        //Задание 1, необходимо вывести все нечетные числа из массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Значение " + array[i] + " нечетное ");
            }
        }
        System.out.println();

        //Задание 2, необходимо вывести все значения массива больше 5.
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 5) {
                System.out.println("Значение " + array2[i] + " > 5 ");
            }
        }


        //Задание 3, необходимо увеличить все значения массива на 15.
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[] array3_2 = new int[array3.length];


        for (int i = 0; i < array3.length; i++) {
            array3_2[i] = array3[i] + 15;
            System.out.println("Значение " + array3[i] + " было, а стало " + array3_2[i]);
        }
        for (int i = 0; i < array3_2.length; i++) {
            System.out.print(array3_2[i] + " ");
        }

        System.out.println();

        //Задание 4, вывести все буквы “о” из этой строки.
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }

        System.out.println();

        //Задание 5, необходимо подсчитать количество букв “е” в строке.
        String s2 = "Перевыборы выбранного президента";
        int t = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                t++;
            }
        }
        System.out.println(t);

        //Задание 6, необходимо вывести сумму всех значений массива.
        int[] array6 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array6.length; i++) {
            sum += array6[i];
        }
        System.out.println(sum);

        //Задание 7, все отличающегося от среднего количества
        int[] array7 = new int[20];
        Random random = new Random();
        int sum7 = 0;

        for (int i = 0; i < array7.length; i++) {
            sum7 += array7[i] = random.nextInt(99) + 1; // от 1 до 99
        }

        System.out.println("Изначальный массив");
        for (int num : array7) {
            System.out.print(num + " ");
        }

        int avg = sum7 / array7.length;
        System.out.println("\n" + "Сравнение массива с средним значением " + avg);

        for (int i = 0; i < array7.length; i++) {
            if (Math.abs(array7[i] - avg)>3)
                System.out.println("значение массива " + array7[i] + " отличается больше среднего " + avg + " на " + (array7[i] - avg));


        }

    }
}
