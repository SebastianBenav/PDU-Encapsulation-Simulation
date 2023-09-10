/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation;

/**
 *
 * @author Sebastian Benavides
 */
public class Packet extends Segment
{
    protected String sourceIPAddress;
    protected String destinationIPAddress;
    
    public Packet (String rawDataType, String rawData, 
                   String sourcePort, String destinationPort,
                   String sourceIPAddress, String destinationIPAddress)
    {
        super(rawDataType, rawData, sourcePort, destinationPort);
        
        this.sourceIPAddress = sourceIPAddress;
        this.destinationIPAddress = destinationIPAddress;
        
    }
    
    //SETTER & GETTER FOR SOURCE IP
    
    public void setSourceIPAddress(String sourceIPAddress)
    {
        this.sourceIPAddress = sourceIPAddress;
    }
    
    public String getSourceIPAddress()
    {
        return sourceIPAddress;
    }
    
    //SETTER & GETTER FOR DESTINATION IP
    
    public void setDestinationIPAddress(String destinationIPAddress)
    {
        this.destinationIPAddress = destinationIPAddress;
    }
    
    public String getDestinationIPAddress()
    {
        return destinationIPAddress;
    }
    
    // THE toString() METHOD
    
    public String toString()
    {
        return "Source IP Address: " + sourceIPAddress + 
               " Destination IP Address " + destinationIPAddress;
    }
    
    // ENCAPSULATION OF SEGMENT DATA
    
    public String encapsulateData()
    {
        return "| Internet Protocol Header, " + 
               "Source IP Address: " + sourceIPAddress + " Destination IP Address " + destinationIPAddress + 
                super.encapsulateData();
    }
    
}
