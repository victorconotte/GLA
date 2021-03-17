package webservices;

import javax.inject.Singleton;

import Mock.AirplaneDaoImpl;
import Mock.AirportDaoImpl;
import Mock.FlightDaoImpl;
import Mock.PassengerDaoImpl;
import Mock.PilotDaoImpl;
import Mock.ReservationDaoImpl;
import jwt.JwtToken;

/**
 * 
 * define and initialize dao implementations and security
 *
 */
@Singleton
public abstract class GeneralService {

	// DAO
	protected PilotDaoImpl pilotDao = new PilotDaoImpl();
	protected PassengerDaoImpl passangerDao = new PassengerDaoImpl();
	protected AirplaneDaoImpl airplaneDao = new AirplaneDaoImpl();
	protected AirportDaoImpl airportDao = new AirportDaoImpl();
	protected FlightDaoImpl flightDao = new FlightDaoImpl();
	protected ReservationDaoImpl reservationDao = new ReservationDaoImpl();
	// Token
	protected JwtToken jwtModule = new JwtToken();

}
