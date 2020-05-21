package exercitii;

public class Flight {
    private int passengers;
    private int seats;

    public Flight() {
        seats = 150;
        passengers = 0;

    }

    public void add1Passanger() {
        if (passengers < seats)
            passengers += 1;

        else handleTooMany();

    }

    private void handleTooMany() {
        System.out.println("Too many");
    }


    //        Flight nycToSf;
//        nycToSf = new Flight();
//
//        Flight slcToDallas = new Flight();
//        slcToDallas.add1Passenger();
//
//        Flight flight1 = new Flight();
//        Flight flight2 = new Flight();
//        flight2.add1Passenger();
//        System.out.println(flight2.passengers); // print 1
//        flight2 = flight1;
//        System.out.println(flight2.passengers); // print 0
//        flight1.add1Passenger();
//        flight1.add1Passenger();
//        System.out.println(flight2.passengers); // print 2
    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;

    }

    public Flight createNewWithBoth(Flight f2) {
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;

    }
    public  void addFlight3() {

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();
        //add passangers to both flights

        Flight lax3 = null;

        if (lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);

        // do some work

        if (lax3 != null){
            System.out.println("Flights combined");
        }
    }


}
