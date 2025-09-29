package RedRover.school;

public class Task3_1 {
    public static void main(String[] args) {

        //Задание 1
        int a=4;
        int b=7;
        if(a==b)
        System.out.println("a == b - если переменные равны ");
        else if (a<b)
        System.out.println("a < b - если переменная a меньше "+ b );
        else if(a>b)
        System.out.println("a > b - если переменная " +b + " меньше " +a);




        //Задание 2
        int a2=4;
        int b2=7;
        if((a2+b2)%2==0)
            System.out.println("maybe a and b are even ");
        else
            System.out.println("some variable is odd ");



        //Задание 3
        int z=14;
        if(z>10)
            System.out.println(z +" больше 10");
        if (z<100)
            System.out.println(z +" меньше 100");
        if(z/2>20)
            System.out.println(z +" результат деления на 2 больше 20");
        if(z>5 && z<40)
            System.out.println(z +" значение переменной между 5 и 40 включительно");
        if(z<5 || z>40)
            System.out.println(z +" значение переменной меньше 5 или больше 40");


    }
}
