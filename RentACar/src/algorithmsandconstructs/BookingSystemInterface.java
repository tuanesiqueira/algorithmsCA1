package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * This is one of the interfaces you need to implement
 *
 */
public interface BookingSystemInterface {
    
    /**
     * This method reads in from the given bufferedReader object. This should be 
     * opening the text file with the data about number of cars and their 
     * makes. You may assume that the structure of this file is always the same. 
     * 
     * @param in instance of the buffered reader class that has open the file
     * @return instance of the Rent-a-car class.
     * @throws IOException 
     */
    public RentACarInterface setupRentACar(BufferedReader in) throws IOException;
    
}
