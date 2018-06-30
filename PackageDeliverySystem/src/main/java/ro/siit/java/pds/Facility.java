package ro.siit.java.pds;

import java.util.*;


public class Facility {
    private String name; //only name from class Address
    private Queue<Parcel> filterQueue;
    private Queue<Parcel> deliveryPickUpQueue; //trebuie declarat aici?
    private Queue<Parcel> transportPickUpQueue; //trebuie declarat aici?


    public Facility(String name, Queue<Parcel> filterQueue, Queue<Parcel> deliveryPickUpQueue, Queue<Parcel> transportPickUpQueue) {
        this.name = name;
        this.filterQueue = filterQueue;
        this.deliveryPickUpQueue = deliveryPickUpQueue;
        this.transportPickUpQueue = transportPickUpQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Queue<Parcel> getFilterQueue() {
        return filterQueue;
    }

    public void setFilterQueue(Queue<Parcel> filterQueue) {
        this.filterQueue = filterQueue;
    }

    public Queue<Parcel> getDeliveryPickUpQueue() {
        return deliveryPickUpQueue;
    }

    public void setDeliveryPickUpQueue(Queue<Parcel> deliveryPickUpQueue) {
        this.deliveryPickUpQueue = deliveryPickUpQueue;
    }

    public Queue<Parcel> getTransportPickUpQueue() {
        return transportPickUpQueue;
    }

    public void setTransportPickUpQueue(Queue<Parcel> transportPickUpQueue) {
        this.transportPickUpQueue = transportPickUpQueue;
    }

    /**
     * @param filterQueue is the Queue containing packages from SmallCar and Truck (packages from inside the city and from other facility)
     * @param name is the Facility name
     */
    public void filterPackages(Queue<Parcel> filterQueue, Facility name) {//Queue<Parcel>
        while (!filterQueue.isEmpty()) {
            Parcel elem = filterQueue.poll();
            ContactInfo elemContactInfo = elem.getDestination();
            Address elemAddress = elemContactInfo.getAddress();
            String elemCity = elemAddress.city;
            //System.out.println(elemCity); //test
            String facilityName = name.getName();
            //System.out.println(facilityName); //test
            System.out.println(elemCity.equals(facilityName));
            if (elemCity.equals(facilityName)) {
                deliveryPickUpQueue.add(elem);
            } else {
                transportPickUpQueue.add(elem);
            }
        }
        //int dQ=deliveryPickUpQueue.size();
        //int tQ=transportPickUpQueue.size();
        //System.out.println(dQ+" and "+tQ);
        //return transportPickUpQueue;

    }

    /**
     * @param someQueue is one of the arrays returned in filterPackages method
     * @return an array sorted based on the delivery address
     */
    public Parcel[] sortPackages(Parcel[] someQueue) {
        return null;
    }

}


