/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulation;

/**
 *
 * @author Sebastian Benavides
 */

import java.util.Scanner;

public class Encapsulation 
{

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("     Welcome to my data encapsulor simulation     ");
        System.out.println("Here we will demonstrate a TCP PDU's encapsulation");
        System.out.println(" process as it traverses down the OSI Layer Stack ");
        
        System.out.println();
        
        //ENTER RAW DATA TYPE & RAW DATA
        
        String rawDataType;
        String rawData;
        
        System.out.println("Type the raw data type of our TCP segment");
        System.out.println("e.g - Email Data, Messaging Data, SSH / Telnet Data, Website Data, etc.");
        
        rawDataType = scnr.nextLine();
        
        System.out.println("Type the contents of the raw data");
        System.out.println("e.g - '0111010110010', '1010010110100', etc. ");
        
        rawData = scnr.nextLine();
        
        System.out.println();
        
        // ENTERING SOURCE PORT & DESTINATION PORT
        
        String sourcePort;
        String destinationPort;
        
        System.out.println("Enter the Source Port");
        System.out.println("e.g - Dynamics Ports: 49152 Through 65535");
        
        sourcePort = scnr.nextLine();
        
        System.out.println("Enter the destination port");
        System.out.println("e.g - Well-Known Ports: 0 Through 1023 <22 (SSH), 23 (Telnet), 80 (HTTP), 443 (HTTPS), etc.>");
        
        destinationPort = scnr.nextLine();
        
        // DECLARING AN INSTANCE OF THE SEGMENT CLASS
        
        Segment TCPSegment1 = new Segment(rawDataType, rawData, sourcePort, destinationPort);
        
        // Printing 
        
        System.out.println();
        
        System.out.print(TCPSegment1.encapsulateData());
        
        // ENTERING SOURCE PORT & DESTINATION PORT 
        
        String sourceIPAddress;
        String destinationIPAddress;
        
        System.out.println();
        
        System.out.println("Enter the source IPv4 Address");
        System.out.println("e.g - 192.168.0.1 Through 192.168.0.254");
        
        sourceIPAddress = scnr.nextLine();
        
        System.out.println("Enter the destination IPv4 Address");
        System.out.println("e.g - 192.168.0.1 Through 192.168.0.254");
        
        destinationIPAddress = scnr.nextLine();
        
        // DECLARING INSTANCE OF PACKET CLASS
        
        Packet TCPPacket1 = new Packet (rawDataType, rawData, 
                                        sourcePort, destinationPort, 
                                        sourceIPAddress, destinationIPAddress);
        
        //Printing
        
        System.out.println();
        
        System.out.println(TCPPacket1.encapsulateData());
        
        // ENTERING SOURCE AND DESTINATION MAC ADDRESS
        
        String sourceMACAddress;
        String destinationMACAddress;
        
        System.out.println();
        
        System.out.println("Enter the source MAC Address");
        System.out.println("e.g - 18-1D-EA-B1-B1-F0");
        
        sourceMACAddress = scnr.nextLine();
        
        System.out.println();
        
        System.out.println("Enter the destination MAC Address");
        System.out.println("e.g - 18-1D-EA-B1-B1-F0");
        
        destinationMACAddress = scnr.nextLine();
        
        // DECLARING INSTANCE OF FRAME CLASS
        
        Frame TCPFrame1 = new Frame (rawDataType, rawData, 
                                     sourcePort, destinationPort, 
                                     sourceIPAddress, destinationIPAddress, 
                                     sourceMACAddress, destinationMACAddress);
        
        //PRINTING
        
        System.out.println();
        
        System.out.println(TCPFrame1.encapsulateData());
        
        
        
        
        
    }
}
