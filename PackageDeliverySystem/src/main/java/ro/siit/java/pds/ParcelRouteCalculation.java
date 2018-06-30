package ro.siit.java.pds;

import java.util.*;

public class ParcelRouteCalculation {

    /* Dijkstra Algorithm
     *
     * @param source - Starting point
     *
     *
     */
    public static void computePaths(City source) {
        source.shortestDistance = 0;
        //implement a priority queue
        PriorityQueue<City> queue = new PriorityQueue<City>();
        queue.add(source);

        while (!queue.isEmpty()) {
            City u = queue.poll();

			/*visit the adjacencies, starting from
			the nearest City(smallest shortestDistance)*/

            for (Edge e : u.adjacencies) {//for each adjacency

                City v = e.target;
                double weight = e.weight;

                //relaxation process(u,v,weight)
                double distanceFromU = u.shortestDistance + weight;
                if (distanceFromU < v.shortestDistance) {

                    //remove v from queue for updating the shortestDistance value
                    queue.remove(v);
                    v.shortestDistance = distanceFromU;
                    v.parent = u;
                    queue.add(v);

                }
                //System.out.println(v.shortestDistance);
            }

        }

    }

    /**
     * @param target
     * @param
     * @return an array of strings composed of city names
     */
    public static List<City> getShortestPathTo(City target) {

        //trace path from target to source
        List<City> path = new ArrayList<City>();
        for (City city = target; city != null; city = city.parent) {
            path.add(city);
        }

        Collections.reverse(path);//reverse the order such that it will be from source to destination

        return path;
    }

}

//define Cities
class City implements Comparable<City> {

    public final String cityName;
    public Edge[] adjacencies;
    public double shortestDistance = Double.POSITIVE_INFINITY;
    public City parent;

    public City(String cityName) {

        this.cityName = cityName;
    }

    public String toString() {

        return cityName;
    }

    public int compareTo(City other) {

        return Double.compare(shortestDistance, other.shortestDistance);
    }

}

//define Edge
class Edge {
    public final City target;
    public final double weight;

    public Edge(City target, double weightVal) {
        this.target = target;
        weight = weightVal;
    }
}


//     /**
//     * todo
//     * @param admin
//     * @return
//     */
//    public Parcel[] getVehicleDetails(Administrator admin){
//        return null;
//    }
