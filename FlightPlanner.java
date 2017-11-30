/*
 * FlightPlanner.java
 * ------------------
 * Reads in a file of cities and their corresponding flights,
 * and allows the user to plan a flight route.
 */

import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;

public class FlightPlanner extends ConsoleProgram {

	public void run() {
		
	}
	

	/**NOTE: UNFINISHED CODE!! Boilerplate code to open a BufferedReader and read things given a filename,
	 * you should implement functionality for a FlightPlanner and flights.txt
	 * 
	 * 
	 * 
	 * Reads in the city information from the given file storing the
	 * information in both the ArrayList of cities and the HashMap of
	 * flights.
	 */
	private void readFlightData(String filename) {
		try {
			BufferedReader rd = 
					new BufferedReader(new FileReader(filename));
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				if (line.length() != 0) {
					//DO SOMETHING HERE!!! 
				}
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
	}
}
