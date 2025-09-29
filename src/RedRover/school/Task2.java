package RedRover.school;

public class Task2 {
    public static void main(String[] args) {

        //Задание 1
        int a=4;
        int b=7;
        System.out.println("Сложение " + a+b);
        System.out.println("Вычитание " + (a-b));
        System.out.println("Умножение " + a*b);
        System.out.println("Деление " + a/b);
        System.out.println("остаток от деления " + a%b);

        if(a%2==0) System.out.println("четное");
        else System.out.println("не четное");
        if(b%2==0) System.out.println("четное");
        else System.out.println("не четное");


        //Задание 2
        int a2=4;
        int b2=7;
        var t=b2;
        System.out.println("Значение a " + a2);
        System.out.println("Значение b " + b2);

        b2=a2;
        a2=t;
        System.out.println("Значение a " + a2);
        System.out.println("Значение b " + b2);



        //Задание 3
        int gold=10000;
        int shipOwner;
        int captain;
        int pirates=13;
        int onePirat;
        int Jack;

        shipOwner=gold/2;
        captain=shipOwner/2;
        onePirat=captain/(pirates+1);
        Jack=shipOwner;

        System.out.println(onePirat);
        System.out.println(Jack+onePirat);

    }
}
