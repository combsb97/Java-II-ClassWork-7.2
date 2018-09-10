/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw_7.pkg2;

/**
 *
 * @author 01707950
 */
public class TravelInfo {
    private double speed;
    private double time;
    private double distance;
    
    public void setDistance(double dist){
    distance = dist;
    }
    
    public void setSpeed(double spd){
    speed = spd;
    }

    public void setTime(double tim){
        time = tim;
    }
    
    public double getDistance(){
        return distance;
    }
    
    public double getSpeed(){
        return speed;
    }
    
    public double getTime(){
        return time;
    }
    public double calcTime(double distance, double speed){
        time = distance/speed;
        return time;
    }
    
}
