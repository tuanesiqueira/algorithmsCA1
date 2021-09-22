/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;

// This line will give you an error until you create the needed class.
import algorithmsandconstructs.BookingSystem;

import algorithmsandconstructs.BookingSystemInterface;
import algorithmsandconstructs.RentACarInterface;
import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// INCLUDE HERE THE LINK TO THE GIT REPOSITORY AS A COMMENT!!!!

/**
 *
 * @author apont
 */
public class RentACar {

    /**
     * Do not change the signature of the main method!
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BookingSystemInterface bookingSystem = new BookingSystem();

        String file = "amilcar_rentals.txt";
        BufferedReader in = new BufferedReader(new FileReader(file));

        RentACarInterface rentACar = bookingSystem.setupRentACar(in);

        // Get the name of the car rental
        System.out.println(rentACar.getName());
        
        // Print the number of cars in the rent-a-car
        System.out.println(rentACar.getNumberOfCars());  
        
        // Check if there is a BMW car available for 5 days from the 1st
        // of January
        System.out.println(rentACar.checkAvailability(Month.JANUARY, 1, Make.BMW, 5)); 
        
        // Get the id of the car available
        System.out.println(rentACar.getCarAvailable(Month.JANUARY, 1, Make.BMW, 5));
        
        // Try some bookings
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.JANUARY, 1, Make.BMW, 5));
        System.out.println(rentACar.bookCar(Month.FEBRUARY, 3, Make.FIAT, 10));
        System.out.println(rentACar.bookCar(Month.MARCH, 10, Make.FORD, 12));

    }

}
