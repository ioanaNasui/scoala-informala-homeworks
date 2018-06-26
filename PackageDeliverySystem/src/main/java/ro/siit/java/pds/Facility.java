package ro.siit.java.pds;

public class Facility {
    private Address name; //only name from class Address
    private Parcel[] filterQueue;
    private Parcel[] deliveryPickUpQueue; //trebuie declarat aici?
    private Parcel[] transportPickUpQueue; //trebuie declarat aici?

    /**
     *
     * @param filterQueue is the Queue containing packages from SmallCar and Truck (packages from inside the city and from other facility)
     * @return filter queue divided in Delivery queue and Transport queue
     */
    public Parcel[] filterPackages(Parcel[] filterQueue) {
        return null;
    }

    /**
     *
     * @param someQueue is one of the arrays returned in filterPackages method
     * @return an array sorted based on the delivery address
     */
    public Parcel[] sortPackages(Parcel[] someQueue) {
        return null;
    }

}


