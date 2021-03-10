package webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.Flight;

public class Services {

	/**
	 * web service for getting a flight by its flight id
	 * 
	 * @param flight_id
	 * @return Flight
	 * @throws Exception
	 */
	@GET
	@Path("getFlight/{flight_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Flight getFlight(@PathParam(value = "flight_id") String flight_id) throws Exception {
		Flight result = null;

		result = flightDao.searchFlight(flight_id);

		return result;

	}

	/**
	 * web service for searching flights by its airport
	 * 
	 * @param airport
	 * @return
	 */
	@GET
	@Path("getFlightAiport/{airport}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlightsByAirport(@PathParam(value = "airport") String airport) {
		try {
			return flightDao.consultElement("location", airport);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * web service for getting a list of flights with a certain departure date
	 * 
	 * @param date departure date of flight
	 * @return Flight list
	 */
	@GET
	@Path("getFlightDate/{date}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlightsByDate(@PathParam(value = "date") String date) {
		try {
			return flightDao.consultElement("departureDate", date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * web service for getting a list of flights with a certain departure date and a
	 * certain departure location
	 * 
	 * @param date     departure date
	 * @param location departure location
	 * @return Flight list
	 * @throws Exception
	 */
	@GET
	@Path("getFlight/{date}/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlights(@PathParam(value = "date") String date,
			@PathParam(value = "location") String location) throws Exception {
		List<Flight> results = null;

		results = flightDao.consultElement(date, location);
		if (results.isEmpty()) {
			results = flightDao.searchFlightDeparDate(date);
			if (results.isEmpty()) {
				results = flightDao.searchFlightLocation(location);
			}
		}
		return results;

	}

	/**
	 * web service for getting a list of flights with a certain passenger username
	 * 
	 * @param passenger_username
	 * @return Flight list
	 * @throws Exception
	 */
	@GET
	@Path("getFlightPassenger/{passenger_username}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlightPassenger(@PathParam(value = "passenger_username") String passenger_username)
			throws Exception {
		List<Flight> result = null;
		result = flightDao.searchFlightPassenger(passenger_username);
		return result;

	}

	/**
	 * web service for getting a list of flights with a certain pilot username
	 * 
	 * @param pilot_username
	 * @return Flight list
	 * @throws Exception
	 */
	@GET
	@Path("getFlightPilot/{pilot_username}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlightPilot(@PathParam(value = "pilot_username") String pilot_username) throws Exception {
		List<Flight> result = null;
		result = flightDao.searchFlightPliot(pilot_username);
		return result;

	}

}
