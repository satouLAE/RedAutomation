package RedRover.school.Task11;

import java.time.LocalDate;

public class Task11 {
    //Само задание сделано в Maven проекте Task11
    public static String getHiddenCard(String s) {
        String ss = s.substring(12, s.length());
        return "*".repeat(4) + ss;

    }

    public static String getHiddenCard(String s,int k) {
        String ss = s.substring(12, s.length());
        return "*".repeat(k) + ss;

    }

    public static boolean isPensioner(int k)
    {
            return (k>=60)?true:false;
    }

    public static String startsWith(String date)
    {
        if (date.startsWith("https://"))
        return date;
        else
            return "https://"+date;
    }

    public static String convertString(String str) {
        // Проверяем пустую строку
        if (str.isEmpty()) {
            return "";
        }

//        // Проверяем, является ли первая буква заглавной
//        if (Character.isUpperCase(str.charAt(0))) {
//            return str;
//        } else {
//            // Переворачиваем строку
//            return new StringBuilder(str).reverse().toString();
//        }
        return Character.isUpperCase(str.charAt(0))?str:new StringBuilder(str).reverse().toString();
    }
    public static String getNumberExplanation(int number) {
        return switch (number) {
            case 666 -> "devil number";
            case 42 -> "answer for everything";
            case 7 -> "prime number";
            default -> "just a number";
        };
    }
    // END
    public static void main(String[] args) {
        System.out.println(getHiddenCard("1234567812345678"));
        System.out.println(getHiddenCard("1234567812345678",4));
        System.out.println("a".toUpperCase() == "a".toUpperCase());
        System.out.println(startsWith("test"));

    }

}
