package RedRover.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {

        //Задание 1, вывести жаркие дни по убыванию
        int[] array = new java.util.Random().ints(10, 0, 100).toArray();
        int maxTemprature = Arrays.stream(array).max().getAsInt();
        int secondTemprature = 0;
        int buffer = 0;

        for (int a : array
        ) {
            System.out.print(a + " ");

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxTemprature & array[i] > buffer) {
                secondTemprature = array[i];
                buffer = array[i];
            }
        }
        System.out.println("\nмаксимальная температура = " + maxTemprature);
        System.out.println("вторая максимальная температура = " + secondTemprature);

        //Задание 2, необходимо вывести максимальное значение массива
        String trueEmail = "@gmail.com";
        String[] allEmails = {"ssfsfs@gmail.com", "fsfsfsdfsdfs@gmail.com", "admin@gmail.com", "dfdf@gmail.com",
                "ssfsfs@google.com", "fsfsfsdfsdfs@yandex.com", "admin@rururu.com", "dfdf@mail.ru"
        };
        List<String> gmailEmails = new ArrayList<>();
        for (int i = 0; i < allEmails.length; i++) {
            if (allEmails[i].endsWith(trueEmail)) {
                gmailEmails.add(allEmails[i]);
            }

        }
        System.out.println("Выводим все отсортированные @gmail.com адреса");
        for (String str : gmailEmails) {
            System.out.print(str + " ");
        }

        String smallestValue = allEmails[0];
        for (String str : allEmails) {
            if (str.length() > smallestValue.length())
                smallestValue = str;

        }
        System.out.println("\nСамый длинный адрес " + smallestValue);

        String biggestValue = allEmails[0];
        for (String str : allEmails) {
            if (str.length() < biggestValue.length())
                biggestValue = str;

        }
        System.out.println("Самый короткий адрес " + biggestValue);

        for (String str : allEmails) {
            if (str.contains("admin"))
                System.out.print("\nЕсть адрес с admin " + str);
        }
        System.out.println();

        //Задание 3, Создайте двумерный массив 5х5, заполните его какими-нибудь числами.
        int[][] array3 = {
                {9, 2, 6, 4, -5},
                {12, 47, 58, 66, 4},
                {32, 37, -38, 36, -4},
                {42, 27, 28, 46, 24},
                {52, 17, 18, -6, 34}};

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                System.out.printf("%3d", array3[i][j]);
            }
            System.out.println();
        }

        //Задание 4, диагонольный вывод
        int[][] array4 = {
                {9, 2, 6, 4, -5},
                {12, 47, 58, 66, 4},
                {32, 37, -38, 36, -4},
                {42, 27, 28, 46, 24},
                {52, 17, 18, -6, 34}};

        System.out.print("Вывод элементов по диогонали слева на право ");

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == j) { // только элементы по диагонали
                    System.out.print(array4[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.print("Вывод списка справо на лево по диогонали ");
        for (int i = array4.length - 1; i >= 0; i--) {
            for (int j = array4.length - 1; j >= i; j--) {
                System.out.print(array4[i][j] + " ");
                if (i > 0) {
                    i--;
                } else {
                    continue;
                }
            }
        }
        System.out.println();

        //Задание 5, Зеркально преобразуйте его вокруг диагонали от верхнего левого до нижнего правого угла
        int[][] array5 = {
                {9, 2, 6, 4, -5},
                {12, 47, 58, 66, 4},
                {32, 37, -38, 36, -4},
                {42, 27, 28, 46, 24},
                {52, 17, 18, -6, 34}};
        int bufferValue[][] = new int[array5.length][array5[0].length];

        System.out.println("Перевернутая матрица из предыдущего варианта ");
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5.length; j++) {
                bufferValue[j][i] = array5[i][j];
            }
        }
        System.out.println("Перевернутый массив");
        for (int[] t : bufferValue) {
            System.out.println(Arrays.toString(t));
        }

        //Задание 6, множество операций со строкой
        String string6 = "I’m just 16,\n" +
                "going on\t17!\n";

        System.out.println(string6);

        int upperCase = 0;
        int lowerCase = 0;
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int punctuation = 0;
        int whitespace = 0;

        //гласные
        String vowelsSet = "AEIOUaeiou";


        for (char c : string6.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase++;
            }
            if (Character.isLowerCase(c)) {
                lowerCase++;
            }
            if (vowelsSet.indexOf(c) > -1) {
                vowels++;
            }
            if (vowelsSet.indexOf(c) == -1) {
                consonants++;
            }
            if (Character.isDigit(c)) {
                digits++;
            }
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                punctuation++;
            }
            if (Character.isWhitespace(c)) {
                whitespace++;
            }

        }
        System.out.println("Количество заглавных букв в строке " + upperCase);
        System.out.println("Количество прописных букв в строке " + lowerCase);
        System.out.println("Количество гласных букв в строке " + vowels);
        System.out.println("Количество цифр в строке " + consonants);
        System.out.println("Количество знаков препинания в строке " + digits);
        System.out.println("Количество заглавных букв в строке " + punctuation);
        System.out.println("Количество \"пробельных\" символов в строке " + whitespace);

        //Задание 7, Зеркально преобразуйте его вокруг диагонали от верхнего левого до нижнего правого угла
        //пароль должен быть не менее 8 символов, содержать как минимум:
        //заглавную латинскую букву
        //строчную латинскую букву
        //цифру
        //знак препинания из списка: ~@#$%^&*()_-+=
        //и не иметь пробелов и символов НЕ упомянутых в этом перечислении.
        String str7 = "Мой пароль!";
        int count7 = 0;
        int upper7 = 0;
        int lower7 = 0;
        int digit7 = 0;
        String error7 = "~@#$%^&*()_-+=";
        int inTheList = 0;
        int space7 = 0;

        for (char c : str7.toCharArray()) {
            count7++;

            if (Character.isWhitespace(c)) {
                space7++;
            }
            if (Character.isUpperCase(c)) {
                upper7++;
            }
            if (Character.isLowerCase(c)) {
                lower7++;
            }
            if (Character.isDigit(c)) {
                digit7++;
            }
            if (error7.indexOf(c) > -1) {
                inTheList++;
            }

        }
        System.out.println(str7);
        if (count7 <= 8)
            System.out.println("Пароль должен быть не менее 8 символов");
        if (space7 == 0)
            System.out.println("Пароль слишком слабый! " + "В пароле должны быть пробелы или пустые символы");
        if (upper7 == 0)
            System.out.println("Пароль слишком слабый! \" В пароле должны быть заглавные буквы");
        if (lower7 == 0)
            System.out.println("Пароль слишком слабый! \" В пароле должны быть прописные буквы");
        if (digit7 == 0)
            System.out.println("Пароль слишком слабый! \" В пароле должны быть цифры");
        if (inTheList == 0)
            System.out.println("Пароль слишком слабый! \" В пароле должны быть знаки препинания");

        //Задача № 8 Вывести следующие строки с соответствующим форматированием (как пирамиды):
        int t8 = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < t8; j++) {
                System.out.print(j + "\t");
            }
            t8--;
            System.out.println();
        }

        //Задача № 9 Вывести следующие строки с соответствующим форматированием (как пирамиды) в другом порядке
        int t9 = 10;

        for (int i = t9; i > 0; i--) {
            // вывод табуляций перед числами
            for (int tab = 0; tab < t9 - i; tab++) {
                System.out.print("\t");
            }
            // вывод чисел
            for (int j = 0; j < i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println(); // переход на новую строку
        }

        //Задача № 10 Вывести в виде пирамиды
        int l10 = 9;

        for (int i = l10; i >= 0; i--) {

            // вывод табуляций
            for (int tab = 0; tab < l10 - i; tab++) {
                System.out.print("\t");
            }

            // вывод чисел слева
            for (int j = i; j > 0; j--) {
                System.out.print(j + "\t");
            }

            System.out.print(0 + "\t");

            // вывод чисел справа
            for (int j2 = 1; j2 <= i; j2++) {
                System.out.print(j2 + "\t");
            }


            System.out.println(); // переход на новую строку
        }
    }
}
