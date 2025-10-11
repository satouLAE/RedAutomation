package RedRover.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Результат сложения " + Sum(4, 8));
        System.out.println("Результат вычитания " + Subtraction(4, 8));
        System.out.println("Результат умножения " + Multiplication(4, 8));
        System.out.println("Результат деления " + division(4, 8));
        System.out.println("Влюбленны ли они " + isLove(1, 4));
        System.out.println("Минимальное значение " + findSmallestInt(new int[]{Integer.MIN_VALUE, -666}));
        System.out.println("Sheeps count " + countingSheep(5));
    }

    public static String countingSheep(int num) {
        //Add your code here
        if (num>0)
        {
            String str = "";
            for (int i = 1; i <= num; i++) {
                str += i + " sheep...";
            }
            return str;
        }
        else
            return "";
    }

    public static int findSmallestInt(int[] args) {
        int t = args[args.length-1];
        for (int i : args ) {
            if (i<t)
                t=i;
        }
        return t;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean firstFlowerIsEven = flower1 % 2 == 0;
        boolean secondFlowerIsEven = flower2 % 2 == 0;

        if (firstFlowerIsEven == secondFlowerIsEven)
            return false;
        else {
            return true;
        }
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
