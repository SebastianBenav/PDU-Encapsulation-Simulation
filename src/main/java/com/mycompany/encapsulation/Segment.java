/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation;

/**
 *
 * @author Sebastian Benavides
 */
public class Segment extends PDU
{
    protected String sourcePort;
    protected String destinationPort;
    
    public Segment (String rawDataType, String rawData, 
                    String sourcePort, String destinationPort)
    {
        super(rawDataType, rawData);
        
        this.sourcePort  = sourcePort;
        this.destinationPort = destinationPort;
    }
    
   // SETTER AND GETTER FOR SOURCE PORT
    
    public void setSourcePort(String sourcePort)
    {
        this.sourcePort = sourcePort;
    }

    public String getSourcePort()
    {
        return sourcePort;
    }
    
    // SETTER AND GETTER FOR SOURCE PORT
    
    public void setDestinationPort(String destinationPort)
    {
        this.destinationPort = destinationPort;
    }
    
    public String getDestinationPort()
    {
        return destinationPort;
    }
    
    //Override toStringMethod
    
    @Override
    public String toString ()
    {
     return "Source Port: " + sourcePort + " Destination Port: " + destinationPort + ", " + super.toString();
    }
    
    //Define Abstract Method
    
    
    @Override
    public String encapsulateData()
    {
        return "| TCP Header, " + "Source Port: " + sourcePort + " Destination Port: " + destinationPort + ", " + super.toString() + "|";
    }
    
    
}
