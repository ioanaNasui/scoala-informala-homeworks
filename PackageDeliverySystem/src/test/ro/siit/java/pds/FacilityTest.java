package ro.siit.java.pds;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.*;

public class FacilityTest {

    @Before
    public void setUp() throws Exception {
        // setting the paths and the distance based on Romania's map: 5 cities
        City Cluj = new City("Cluj");
        City Brasov = new City("Brasov");
        City Bucuresti = new City("Bucuresti");
        City Timisoara = new City("Timisoara");
        City Iasi = new City("Iasi");

        City[] cities = {Cluj, Brasov, Bucuresti, Iasi, Timisoara};

        Cluj.adjacencies = new Edge[]{new Edge(Iasi, 391), new Edge(Brasov, 273), new Edge(Timisoara, 391)};
        Brasov.adjacencies = new Edge[]{new Edge(Iasi, 307), new Edge(Bucuresti, 171), new Edge(Timisoara, 412), new Edge(Cluj, 273)};
        Bucuresti.adjacencies = new Edge[]{new Edge(Iasi, 388), new Edge(Timisoara, 550), new Edge(Brasov, 171)};
        Iasi.adjacencies = new Edge[]{new Edge(Cluj, 391), new Edge(Bucuresti, 388), new Edge(Brasov, 307)};
        Timisoara.adjacencies = new Edge[]{new Edge(Cluj, 317), new Edge(Bucuresti, 550), new Edge(Brasov, 412)};


        //initializing 2 packages

        ContactInfo senderOne = new ContactInfo("Ion", new Address("Romania", "Bucuresti", "Dorobantilor", "525254"), "0752365061");
        ContactInfo destOne = new ContactInfo("Matei", new Address("Romania", "Cluj", "Grigore", "455622"), "0752365055");
        ParcelRouteCalculation.computePaths(Timisoara);
        List<City> pathOne = ParcelRouteCalculation.getShortestPathTo(Bucuresti);

        ContactInfo senderTwo = new ContactInfo("Maria", new Address("Romania", "Cluj", "Dorobantilor", "88888"), "0752465061");
        ContactInfo destTwo = new ContactInfo("Ioana", new Address("Romania", "Bucuresti", "Mehedinti", "5252454"), "0750365061");
        ParcelRouteCalculation.computePaths(Cluj);
        List<City> pathTwo = ParcelRouteCalculation.getShortestPathTo(Bucuresti);

        Parcel[] packages = new Parcel[2];
        packages[0] = new Parcel(new TrackingInfo("1"), new LogisticalInfo("on route"), senderOne, destOne, pathOne);
        packages[1] = new Parcel(new TrackingInfo("2"), new LogisticalInfo("on route"), senderTwo, destTwo, pathTwo);

        Queue<Parcel> filteringQueue = new LinkedList<Parcel>();
        filteringQueue.add(packages[0]);
        filteringQueue.add(packages[1]);

        Queue<Parcel> delivery = new LinkedList<Parcel>();
        Queue<Parcel> transport = new LinkedList<Parcel>();

        Facility ClujFacility = new Facility("Cluj", filteringQueue, delivery, transport);

        ClujFacility.filterPackages(filteringQueue, ClujFacility);


    }



    @Test
    public void filterPackages() {

        //assertEquals(1, .deliveryPickUpQueue.length());

    }
}