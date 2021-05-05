package com.zetcode.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.Flight;
import DAO.Pilot;

@Path("/service")
public class Services extends GeneralService {

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public User
	 * getUser(@PathParam("user-id") int uid) { return userDao.getUser(uid); }
	 * 
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Flight
	 * getFlight(@PathParam("flight-id") String fid) throws Exception { return
	 * flightDao.searchFlight(fid); }
	 * 
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public List<Airport>
	 * getAirport(@PathParam("airport-id") String aid) throws Exception { return
	 * airportDao.searchAirportByCode(aid); }
	 * 
	 * @PUT
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String createUser(User u) { return
	 * userDao.createUser(u.getName(), u.getPassword()); }
	 * 
	 * @POST
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String editUser(@PathParam("user-id")
	 * int uid, User u) { return userDao.editUser(uid, u.getPassword()); }
	 * 
	 * @DELETE
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public boolean
	 * deleteUser(@PathParam("user-id") int uid) { return userDao.deleteUser(uid); }
	 * 
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Pilot
	 * getPilot(@PathParam("pilot-id") int pid) throws Exception { return
	 * pilotDao.searchPilot(pid); }
	 * 
	 * @PUT
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.TEXT_PLAIN)
	 * 
	 * @Path("/addFlight") public String addFlight(Flight f) throws Exception {
	 * System.out.println(f); List<Passenger> pas = new LinkedList<Passenger>();
	 * f.setPassengers(pas); flightDao.addElement(f); return
	 * "{\"result\" :\" ok\"}"; }
	 */

	@GET
	@Path("/getFlights")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getFlights() throws Exception {
		return flightDao.consultElement();

	}

	@PUT
	@Path("addFlight")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public void addFlight(Flight f) throws Exception {
		flightDao.addFlight(f);
	}

	@GET
	@Path("/getPilot")
	@Produces(MediaType.APPLICATION_JSON)
	public Pilot getPilot(@PathParam("pilot-id") int pid) throws Exception {
		return pilotDao.searchPilot(pid);
	}

}
