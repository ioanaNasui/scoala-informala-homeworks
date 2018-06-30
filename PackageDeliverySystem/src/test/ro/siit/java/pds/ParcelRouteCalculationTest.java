package ro.siit.java.pds;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ParcelRouteCalculationTest {

    @Before
    public void setUp() throws Exception {
        // setting the paths and the distance based on Romania's map: 5 cities
        City Cluj = new City("Cluj");
        City Brasov = new City("Brasov");
        City Bucuresti = new City("Bucuresti");
        City Timisoara = new City("Timisoara");
        City Iasi = new City("Iasi");

        Cluj.adjacencies = new Edge[]{new Edge(Iasi, 391), new Edge(Brasov, 273), new Edge(Timisoara, 391)};
        Brasov.adjacencies = new Edge[]{new Edge(Iasi, 307), new Edge(Bucuresti, 171), new Edge(Timisoara, 412), new Edge(Cluj, 273)};
        Bucuresti.adjacencies = new Edge[]{new Edge(Iasi, 388), new Edge(Timisoara, 550), new Edge(Brasov, 171)};
        Iasi.adjacencies = new Edge[]{new Edge(Cluj, 391), new Edge(Bucuresti, 388), new Edge(Brasov, 307)};
        Timisoara.adjacencies = new Edge[]{new Edge(Cluj, 317), new Edge(Bucuresti, 550), new Edge(Brasov, 412)};
        City start = Timisoara;
        City destination = Iasi;

        ParcelRouteCalculation.computePaths(start);
        List<City> path = ParcelRouteCalculation.getShortestPathTo(destination);
        System.out.println("Shortest distance from " + start + " to " + destination + " is " + destination.shortestDistance + " via " + path);

    }

    @Test
    public void computePaths() {
        //assertEquals();
    }

    @Test
    public void getShortestPathTo() {
    }
}