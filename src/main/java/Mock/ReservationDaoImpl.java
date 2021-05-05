package Mock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import DAO.Reservation;
import DAO.ReservationDao;
import DAO.User;

public class ReservationDaoImpl implements ReservationDao {

	private PersistenceManagerFactory pmf;

	public ReservationDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	@Override
	public boolean addElement(Reservation e) throws Exception {
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
	public Reservation modifyElement(String id, Reservation element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Reservation e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		if (e == null) {
			return false;
		}
		try {
			tx.begin();
			String reservationId = e.getId();
			if (e != null) {
				Query q = pm.newQuery(User.class);
				q.declareParameters("String reservationId");
				q.setFilter("id == reservationId");
				q.deletePersistentAll(reservationId);
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Reservation> consultElement() throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Reservation> reservations;
		try {
			tx.begin();
			reservations = new ArrayList<Reservation>(pm.getManagedObjects(Reservation.class));
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return reservations;
	}

	@Override
	public List<Reservation> searchPilotReservation(String pilot_id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> searchPassengerReservation(String passenger_id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addElement(String id, Reservation e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String agree(Reservation e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String refuse(Reservation e) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation searchReservation(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
