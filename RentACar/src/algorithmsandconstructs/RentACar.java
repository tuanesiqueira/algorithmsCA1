/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;

import java.util.List;

/**
 *
 * @author maria
 */
public class RentACar implements RentACarInterface {

    
    
    @Override
    public List<CarInterface> getCars() {
        /**
     * Return the full list of cars.
     *
     * @return	List of cars
     */
        
    }

    @Override
    public void setCars(List<CarInterface> cars) {
       /**
     * Helper method to set all the cars with a list if we so wished
     *
     * @param cars	List of cars
     */
    }

    @Override
    public String getName() {
            /**
     * Return the name of the Rent-a-car
     *
     * @return
     */   
      return Name;
    }

    @Override
    public void setName(String name) {
            /**
     * Set the name of the rent-a-car.
     *
     * @param name
     */
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
       /**
     * Check through all cars in this hotel and see if there is continuous
     * availability of any specific car. It is not enough to just have
     * any car available for the length of stay, we need it to be in one
     * specific car.
     *
     * @param month	Month of proposed rent
     * @param day	Day of start of proposed rent
     * @param make	Make, what sort of car for the proposed rent
     * @param lengthOfRent	how long is the proposed rent for
     * 
     * @return	true or false is there availability for the proposed rent
     */
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
            /**
     * Assuming there is availability, get the id of a car that fits that
     * availability
     *
     * @param month	Month of proposed rent
     * @param day	Day of start of proposed rent
     * @param make	Make, what sort of car for the proposed rent
     * @param lengthOfRent	how long is the proposed rent for
     * @return	the id of a room that fits the bill
     */
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
           /**
     * Book a car for the proposed rent. It should be one car for the full
     * time. THERE IS NO NEED TO CONSIDER RENTALS THAT ROLL OVER TWO MONTHS
     *
     * @param month	Month of proposed rent
     * @param day	Day of start of proposed rent
     * @param make	Make, what sort of car for the proposed rent
     * @param lengthOfRent	how long is the proposed rent for
     * @return	true or false has the room been booked
     */
    }

    @Override
    public int getNumberOfCars() {
           /**
     * How many cars are in the rent-a-car
     *
     * @return number of cars
     */
    }
    
}
