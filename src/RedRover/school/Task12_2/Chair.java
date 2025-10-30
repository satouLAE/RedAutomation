package RedRover.school.Task12_2;

public class Chair extends SittingFurniture{
    @Override
    public void name()
    {
        System.out.println("Я конкретная мебель");
    }

    @Override
    public void sittingName()
    {
        System.out.println("Я стул!");
    }
}
