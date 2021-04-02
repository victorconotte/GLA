package com.zetcode.ressources;

import javax.inject.Singleton;
import javax.jdo.PersistenceManagerFactory;

import Mock.AirplaneDaoImpl;
import Mock.AirportDaoImpl;
import Mock.FlightDaoImpl;
import Mock.PassengerDaoImpl;
import Mock.PilotDaoImpl;
import Mock.ReservationDaoImpl;
import Mock.UserDaoImpl;

/**
 * 
 * define and initialize dao implementations and security
 *
 */
@Singleton
public abstract class GeneralService {
	private PersistenceManagerFactory pmf;
	// DAO
	protected PilotDaoImpl pilotDao = new PilotDaoImpl();
	protected PassengerDaoImpl passangerDao = new PassengerDaoImpl();
	protected AirplaneDaoImpl airplaneDao = new AirplaneDaoImpl(pmf);
	protected AirportDaoImpl airportDao = new AirportDaoImpl(pmf);
	protected FlightDaoImpl flightDao = new FlightDaoImpl(pmf);
	protected ReservationDaoImpl reservationDao = new ReservationDaoImpl();
	protected UserDaoImpl userDao = new UserDaoImpl(pmf);
}
