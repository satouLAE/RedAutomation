package RedRover.school.Task9_2;

public class Person {

    String name;
    int age;
    String sex;

    //пример без конструктора

    public String getName(String sex, String name)
    {
        if (sex.toLowerCase().contains("man"))
            return "Mr. "+ name;
        else return "Mrs. "+ name;

    }
}