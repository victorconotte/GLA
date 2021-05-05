package Mock;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import DAO.Airport;
import DAO.AirportDao;
import DAO.Flight;
import DAO.User;

public class AirportDaoImpl implements AirportDao {

	private PersistenceManagerFactory pmf;

	public AirportDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	@Override
	public boolean addElement(Airport e) throws Exception {
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
	public Airport modifyElement(String id, Airport element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Airport e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		if (e == null) {
			return false;
		}
		try {
			tx.begin();
			String airportIcaoCode = e.getIcaoCode();
			if (e != null) {
				Query q = pm.newQuery(User.class);
				q.declareParameters("String airplaneIcaoCode");
				q.setFilter("id == airplaneIaoCode");
				q.deletePersistentAll(airportIcaoCode);
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
	public List<Airport> consultElement() throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Airport> airports;
		try {
			tx.begin();
			airports = new ArrayList<Airport>(pm.getManagedObjects(Flight.class));
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return airports;
	}

	@Override
	public List<Airport> searchAirportByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searchAirportByCode(String code) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searchAirportByLocation(String location) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
