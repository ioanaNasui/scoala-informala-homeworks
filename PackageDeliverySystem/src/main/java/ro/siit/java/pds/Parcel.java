package ro.siit.java.pds;


import java.util.List;

public class Parcel {

    private TrackingInfo trackingInfo;
    private LogisticalInfo logisticalInfo;
    private ContactInfo sender;
    private ContactInfo destination;
    private List<City> route;

    public Parcel(TrackingInfo trackingInfo, LogisticalInfo logisticalInfo, ContactInfo sender, ContactInfo destination,  List<City> route) {
        this.trackingInfo = trackingInfo;
        this.logisticalInfo = logisticalInfo;
        this.sender = sender;
        this.destination = destination;
        this.route = route;
    }

    public TrackingInfo getTrackingInfo() {
        return trackingInfo;
    }

    public LogisticalInfo getLogisticalInfo() {
        return logisticalInfo;
    }

    public ContactInfo getSender() {
        return sender;
    }

    public ContactInfo getDestination() {
        return destination;
    }

    public List<City> getRoute() {
        return route;
    }
}