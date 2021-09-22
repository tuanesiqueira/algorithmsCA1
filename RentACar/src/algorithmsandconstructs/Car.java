/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author maria
 */
public class Car implements CarInterface {
    
    public double Rate;
    public Make Make;
    Map<Month, boolean[]> availability;

            
    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        Map<Month, boolean[]> availability = new HashMap<>();           //Created the HashMap for the each month availability
        
        availability.put(Month.JANUARY , new boolean.[Month.JANUARY.getNumberOfDays()]);         //Add the array of booleans of each month acording to the number of day
        availability.put(Month.FEBRUARY , new boolean[Month.FEBRUARY.getNumberOfDays()]);
        availability.put(Month.MARCH , new boolean[Month.MARCH.getNumberOfDays()]);
        availability.put(Month.APRIL , new boolean[Month.APRIL.getNumberOfDays()]);
        availability.put(Month.MAY, new boolean[Month.MAY.getNumberOfDays()]);
        availability.put(Month.JUNE , new boolean[Month.JUNE.getNumberOfDays()]);
        availability.put(Month.JULY , new boolean[Month.JULY.getNumberOfDays()]);
        availability.put(Month.AUGUST , new boolean[Month.AUGUST.getNumberOfDays()]);
        availability.put(Month.SEPTEMBER , new boolean[Month.SEPTEMBER.getNumberOfDays()]);
        availability.put(Month.OCTOBER , new boolean[Month.OCTOBER.getNumberOfDays()]);
        availability.put(Month.NOVEMBER , new boolean[Month.NOVEMBER.getNumberOfDays()]);
        availability.put(Month.DECEMBER , new boolean[Month.DECEMBER.getNumberOfDays()]);
        
        //Go through all of the days and set the boolean into true
        
        availability(Month.JANUARY,  boolean.true[Month.JANUARY.getNumberOfDays()]);  
        
        
        // Make the contructor of availability
        
        
        /**
     * This method in in charge of creating the calendar of availability 
     * of the car for the whole year. 
     * The calendar should be a Map that uses the Month as the key, 
     * and an array of boolean as its associated value.
     * 
     * @return Map of availability
     */
     
        
        
    }

    @Override
    public Make getMake() {
         /**
     * Getter method for the make of this car.
     * 
     * @return the make of the car
     */
         return Make;
    }

    @Override
    public void setMake(Make make) {
    /**
     * Sets the make of the car.
     * 
     * @param make 
     */
    this.Make = make;
    }

    @Override
    public double getRate() {
           
    /**
     * Getter method for the rate of this car.
     * 
     * @return rate of the car.
     */
    return Rate;
    }

    @Override
    public void setRate(double rate) {
    
    /**
     * Sets the rate of the car.
     * 
     * @param rate 
     */
    this.Rate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
    /**
     * Getter method for the availability calendar of this car.
     * 
     * @return Map of availability
     */
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
     /**
     * Sets the availability calendar of the car.
     * 
     * @param availability 
     */
    }

    @Override
    public int getId() {
      /**
     * Getter method for the id of this car.
     * 
     * @return 
     */
    }

    @Override
    public boolean isAvailable(Month month, int day) {
   /**
     * Returns whether or not the car is available on the given month and day. 
     * Month is an Emum, day is an int within the limits of the number of days
     * in a given month
     * 
     * @param month Month being checked
     * @param day date being checked
     * @return  true or false if it is available or not
     */
    }

    @Override
    public boolean book(Month month, int day) {
             /**
     * Book a room on the given month and day. To book a room its availability 
     * is changed to false on the given month and day. 
     * This should return true or false if this change is successfully made
     * 
     * @param month month to book
     * @param day date to book
     * @return true or false if the booking is completed
     */
        
    }
    
    
}