/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlineressystem;

import java.util.Date;

/**
 *
 * @author hp
 */
class Flights 
{
    private String flightid,src,destination,deptdate,departure,arrival,price;
    
    
    public Flights(String flightid,String src,String destination,String deptdate,String departure,String arrival,String price)
    {
        this.flightid=flightid;
        this.src=src;
        this.destination=destination;
        this.deptdate=deptdate;
        this.departure=departure;
        this.arrival=arrival;
        this.price=price;
    }
    public String getsflightid()
    {
        return flightid; 
    }
    public String getssrc()
    {
        return src; 
    }
    public String getsdestination()
    {
        return destination; 
    }
    public String getsdeptdate()
    {
        return deptdate; 
    }
    public String getsdeparture()
    {
        return departure; 
    }
    public String getsarrival()
    {
        return arrival; 
    }
    public String getsprice()
    {
        return price; 
    }
}
