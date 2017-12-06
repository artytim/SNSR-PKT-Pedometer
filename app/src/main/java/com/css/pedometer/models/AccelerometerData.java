package com.css.pedometer.models;


public class AccelerometerData {

    public double value; //square root of the sum of the squares of the acceleration acting on all the 3 axes
    public float x;
    public float y;
    public float z;
    public long time;   //timestamp
    public boolean isRealPeak = true;
}
