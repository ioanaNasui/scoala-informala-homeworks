package ro.siit.java.pds;

public class Truck extends Vehicle {

    /**
     *
     * @param packages brought by Truck
     *
     * @return adds to the filterQueue in facility the packages brought by Truck
     */
    public Parcel[] unloadPackages(Parcel[] packages){return null;}
    /**
     *
     * @param transportPickUpQueue
     *
     * @return packages - loads the Truck with packages that need to be transported to the next facility according to route
     */
    public Parcel[] pickUpPackages(Parcel[] transportPickUpQueue ){return null;}
}
