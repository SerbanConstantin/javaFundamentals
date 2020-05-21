package exercitii;

public class VehiculMain extends Vehicul {
    private String tipMasina = "Civic";

    public static void main(String[] args) {

        VehiculMain myMasina = new VehiculMain();
        myMasina.claxoneaza();
        System.out.println(myMasina.brand + " " + myMasina.tipMasina);
    }
}
