package com.zetcode.ressources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import DAO.Airport;
import DAO.Flight;
import DAO.Pilot;
import DAO.User;

public class Services extends GeneralService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{user-id}")
	public User getUser(@PathParam("user-id") int uid) {
		return userDao.getUser(uid);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{flight-id}")
	public Flight getFlight(@PathParam("flight-id") String fid) throws Exception {
		return flightDao.searchFlight(fid);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{airport-id}")
	public List<Airport> getAirport(@PathParam("airport-id") String aid) throws Exception {
		return airportDao.searchAirportByCode(aid);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String createUser(User u) {
		return userDao.createUser(u.getName(), u.getPassword());
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{user-id}")
	public String editUser(@PathParam("user-id") int uid, User u) {
		return userDao.editUser(uid, u.getPassword());
	}

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{user-id}")
	public boolean deleteUser(@PathParam("user-id") int uid) {
		return userDao.deleteUser(uid);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{user-id}")
	public Pilot getPilot(@PathParam("pilot-id") int pid) throws Exception {
		return pilotDao.searchPilot(pid);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean addFlight(Flight f) throws Exception {
		return flightDao.addElement(f);
	}

}
