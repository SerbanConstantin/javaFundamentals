package exercitii;

public class Passenger {
    private int checkedBags;
    private int freeBags;

    private double perBagFee;

    public void setCheckedBags(int checkedBags) {

        this.checkedBags = checkedBags;
    }

    public Passenger() {

    }

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    public Passenger(int checkedBags, int freeBags) {
        this(freeBags);
        this.checkedBags = checkedBags;

    }

    private Passenger(double perBagFree) {
        this.perBagFee = perBagFree;
    }

    public static void main(String[] args) {

        Passenger bob = new Passenger();

        Passenger jane = new Passenger(3, 2);
        Passenger fred = new Passenger(2);


    }

}
