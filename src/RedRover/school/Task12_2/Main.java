package RedRover.school.Task12_2;

public class Main {

    public static void main(String[] args) {
        Furniture furniture = null;
        SittingFurniture sittingFurniture=new SittingFurniture();
        Chair chair = new Chair();
        sittingFurniture.name();
        sittingFurniture.sittingName();

        chair.name();
        chair.sittingName();

        furniture=chair;
        furniture.name();

        PuttingFurniture puttingFurniture= new PuttingFurniture();
        Wardrobe wardrobe = new Wardrobe();
        puttingFurniture.name();
        puttingFurniture.puttingName();

        wardrobe.name();
        wardrobe.puttingName();

        furniture=puttingFurniture;
        furniture.name();


    }
}