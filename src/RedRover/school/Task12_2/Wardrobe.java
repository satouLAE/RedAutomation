package RedRover.school.Task12_2;

public class Wardrobe extends PuttingFurniture{
    @Override
    public void name()
    {
        System.out.println("Я тоже конкретная мебель");
    }

    @Override
    public void puttingName()
    {
        System.out.println("Я шкаф!");
    }
}
