package RedRover.school;

public class Task3_2 {
    public static void main(String[] args) {

        //Задание 1
        for (int i=1; i<=15;i++)
        {
            System.out.println(i);
        }


        //Задание 2
        int a=5;
        int result = 1;

        for (int i = 1; result * a < 10000; i++) {
            result *= a; // каждый раз умножаем на 5
            System.out.println(a + "^" + i + " = " + result);
        }


        //Задание 3, использовать конструкцию if
        for (int z=40;z<=60; z++)
        {
            if (z%4==0)
                System.out.println(z + " кратное число 4");
        }

        //Задание 3, без использования конструкции if
        System.out.println();
        int t=40;
        do {

                System.out.println(t + " кратное число 4");
                t=t+4;
        }
        while (t<=60 );

    }
}
