/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation;

/**
 *
 * @author Sebastian Benavides
 */
public class Frame extends Packet
{
    protected String sourceMACAddress;
    protected String destinationMACAddress;
    
    // CONSTRUCTOR
    
    public Frame (String rawDataType, String rawData, 
                  String sourcePort, String destinationPort,
                  String sourceIPAddress, String destinationIPAddress,
                  String sourceMACAddress, String destinationMACAddress)
    {
        super(rawDataType, rawData, sourcePort, destinationPort, sourceIPAddress, destinationIPAddress);
        
        this.sourceMACAddress = sourceMACAddress;
        this.destinationMACAddress = destinationMACAddress;
                
    }
    
    // GETTERS & SETTERS FOR SOURCE
    
    public void setSourceMACAddress(String sourceMACAddress)
    {
        this.sourceMACAddress = sourceMACAddress;
    }
    
    public String getMACAddress()
    {
        return sourceMACAddress;
    }
    
    // GETTERS & SETTERS FOR DESTINATION
    
    public void setDestinationIPAddress(String destinationMACAddress)
    {
        this.destinationMACAddress = destinationMACAddress;
    }
    
    // THE toString() Method 
    
    public String toString()
    {
        return "Source MAC Address: " + sourceMACAddress + 
               " Destination IP Address " + destinationMACAddress;
    }
    
    // ENCAPSULATION OF PACKET DATA
    
    public String encapsulateData()
    {
        return "| Frame Header: Ethernet ll, " + 
               "Source MAC Address: " + sourceMACAddress + " Destination IP Address " + destinationMACAddress + 
                super.encapsulateData();
    }
}
