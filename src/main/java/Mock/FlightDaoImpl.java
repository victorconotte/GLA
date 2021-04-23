package Mock;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import DAO.Airplane;
import DAO.Airport;
import DAO.Flight;
import DAO.FlightDao;
import DAO.Passenger;
import DAO.User;

public class FlightDaoImpl implements FlightDao {

	private PersistenceManagerFactory pmf;

	public FlightDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	@Override
	public boolean addElement(Flight e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		try {
			tx.begin();
			pm.makePersistent(e);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return b;
	}

	@Override
	public Flight modifyElement(String id, Flight element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Flight e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		if (e == null) {
			return false;
		}
		try {
			tx.begin();
			String flightId = e.getId();
			if (e != null) {
				Query q = pm.newQuery(User.class);
				q.declareParameters("String flightId");
				q.setFilter("id == flightId");
				q.deletePersistentAll(flightId);
				tx.commit();
			}
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return b;
	}

	@Override
	public boolean deleteElement(String id) {
		return false;
	}

	@Override
	public List<Flight> consultElement() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight searchFlight(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightAirport(String airport_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightAirportAndDate(String airport_name, String date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlight(String departureAirport, String duree, String departureDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightDuree(String duree) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightDeparDate(String departureDate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightPlane(Airplane plane) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightArrivAirport(Airport arrivAirport) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightPliot(String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightPassenger(String p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightNbSeat(int nb) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlightPrice(double price) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPassengerToFlight(Passenger p, Flight f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> searchFlightLocation(String location) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addElement(String id, Flight e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
