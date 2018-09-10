/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw_7.pkg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author 01707950
 */
public class CW_72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //create TravelInfo object ArrayList
        ArrayList<TravelInfo> info = new ArrayList<>(10);
        
        
        System.out.print("Please enter file destination: ");
        //create scanner object to get file destination
        Scanner kb = new Scanner(System.in);
        //create string object containing file destination
        String dir = kb.nextLine();
        //create new file object
        File file = new File(dir);
        //scanner to read in from file
        Scanner inputFile = new Scanner(file);
        //printwriter class for output file
        PrintWriter outputFile = new PrintWriter("DST.txt");
       
        for (int i = 0; i<10; i++)
            {
                //String objName = "TravelInfo_" + (i + 1);
                double dist = inputFile.nextDouble();
                double speed = inputFile.nextDouble();
                TravelInfo obj = new TravelInfo();
                
                obj.setDistance(dist);
                obj.setSpeed(speed);
                
                double time = obj.calcTime(dist, speed);
                obj.setTime(time);
                info.add(i, obj);
                outputFile.printf(info.get(i).getDistance()+"\t"+info.get(i).getSpeed() + "\t" + "%.2f",info.get(i).getTime());
                outputFile.println();
            }
        outputFile.close();
  
    }
    
}
