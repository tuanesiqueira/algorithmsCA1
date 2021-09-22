/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import algorithmsandconstructs.BookingSystemInterface;
import algorithmsandconstructs.RentACarInterface;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author maria
 */
public class BookingSystem implements BookingSystemInterface {
    /**
     * This method reads in from the given bufferedReader object. This should be 
     * opening the text file with the data about number of cars and their 
     * makes. You may assume that the structure of this file is always the same. 
     * 
     * @param in instance of the buffered reader class that has open the file
     * @return instance of the Rent-a-car class.
     * @throws IOException 
     */
    @Override
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        return null;
    
        
    }
    
}
