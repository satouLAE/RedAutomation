package RedRover.school.Task12_2;

public class SittingFurniture extends Furniture{
    @Override
    public void name()
    {
        System.out.println("Я не обычная мебель");
    }

    public void sittingName()
    {
        System.out.println("Я мебель, на которой сидят");
    }
}
