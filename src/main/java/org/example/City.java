package org.example;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class City
{
    private final String name;
    private final Set<City> connections;
    //Add appropriate collection to store connections here

    //Complete
    public City(String name)
    {
        this.name = name;
        connections = new HashSet<>();
    }

    //Complete
    public void connect(City city)
    {
        this.connections.add(city);
        city.connections.add(this);
    }

    //Uncomment and complete
    public Collection<City> getConnections()
    {
        return connections;
    }

    //Uncomment and complete
    public boolean isConnected(City city)
    {
        return connections.contains(city);
    }

    public static void main(String[] args) {
        City dublin = new City("Dublin"), galway = new City("Galway"), cork = new City
                ("Cork"), limerick = new City("Limerick");
        dublin.connect(cork);
        dublin.connect(galway);
        Collection<City> dublinConnections = dublin.getConnections();
        System.out.println(dublinConnections);
        System.out.println(dublin.isConnected(galway));
        System.out.println(dublin.isConnected(limerick));
    }
}
