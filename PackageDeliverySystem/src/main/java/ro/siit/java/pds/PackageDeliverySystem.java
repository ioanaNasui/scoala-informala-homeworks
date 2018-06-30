package ro.siit.java.pds;

import java.util.*;

/**
 * PackageDeliverySystem implements the workflow of a package delivery system.
 *
 * @author Ioana
 * @since June 2018
 */
public class PackageDeliverySystem {
    private Parcel packages[];

    /**
     * @param pickupContactInfo
     * @param deliveryContactInfo
     * @return the tracking id of the delivery
     */
    public String requestDeliveryPickUp(ContactInfo pickupContactInfo, ContactInfo deliveryContactInfo) {
        return null;
    }

    /**
     * @param trackingId
     * @return list with tracking information regarding the package
     */
    public TrackingInfo getTrackingInfo(String trackingId) {
        return null;
    }

    /**
     * @param admin
     * @return all the packages
     */
    public Parcel[] getPackages(Administrator admin) {
        return null;
    }

//    /**
//     * @param pickupContactInfo
//     * @param deliveryContactInfo
//     * @return an array of strings composed of city names
//     */
//    public String[] routeCalculation(ContactInfo pickupContactInfo, ContactInfo deliveryContactInfo) {
//        return null;
//    }
}
