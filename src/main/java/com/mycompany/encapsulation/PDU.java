/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulation;

/**
 *
 * @author Sebastian Benavides
 */
public abstract class PDU 
{
    protected String rawDataType;
    protected String rawData;
    
    //CONSTRUCTOR !
    
    public PDU (String rawDataType, String rawData)
    {
        this.rawDataType = rawDataType;
        this.rawData = rawData;
    }
    
    // SETTER / MUTATOR & GETTER / ACCESSOR FOR RAW DATA TYPE, E.G - APPLICATION DATA, STREAMING DATA, ETC.
    
    public void setRawDataType(String rawDataType)
    {
        this.rawDataType = rawData;
    }
    
    public String getRawDataType()
    {
        return rawDataType; 
    }
    
    // SETTER / MUTATOR & GETTER / ACCESSOR FOR RAW DATA, E.G - 0110111001101011110
    
    public void setRawData(String rawData)
    {
        this.rawData = rawData;
    }
    
    public String getRawData()
    {
        return rawData;
    }
    
    //ABSTRACT METHODS FOR ENCAPSULATOR;
    
    public abstract String encapsulateData();
    
    // toString() METHOD
    
    public String toString()
    {
        return rawDataType + " - " + rawData;
    }
    
    
    
}
