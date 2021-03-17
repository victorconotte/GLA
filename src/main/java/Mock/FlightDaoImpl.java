package Mock;

import java.util.List;

import DAO.Airplane;
import DAO.Airport;
import DAO.Flight;
import DAO.FlightDao;
import DAO.Passenger;

public class FlightDaoImpl implements FlightDao {

	public String addElement(Flight e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight modifyElement(String id, Flight element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteElement(Flight e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteElement(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Flight> consultElement() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight searchFlight(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightAirport(String airport_name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightAirportAndDate(String airport_name, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlight(String departureAirport, String duree, String departureDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightDuree(String duree) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightDeparDate(String departureDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightPlane(Airplane plane) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightArrivAirport(Airport arrivAirport) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightPliot(String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightPassenger(String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightNbSeat(int nb) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Flight> searchFlightPrice(double price) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addPassengerToFlight(Passenger p, Flight f) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Flight> searchFlightLocation(String location) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public String addElement(String id, Flight e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
