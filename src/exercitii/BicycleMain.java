package exercitii;

public class BicycleMain extends Bicycle {
    private String modelName = "Strada";

    public static void main(String[] args) {

        BicycleMain myBicycle = new BicycleMain();

        myBicycle.honk();
        System.out.println(myBicycle.brand + " " + myBicycle.modelName);
    }
}
