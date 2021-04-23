package Mock;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import DAO.Passenger;
import DAO.PassengerDao;
import DAO.User;

public class PassengerDaoImpl implements PassengerDao {

	private PersistenceManagerFactory pmf;

	public PassengerDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	@Override
	public boolean addElement(Passenger e) throws Exception {
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
	public Passenger modifyElement(String id, Passenger element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Passenger e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		if (e == null) {
			return false;
		}
		try {
			tx.begin();
			int passengerId = e.getId();
			if (e != null) {
				Query q = pm.newQuery(User.class);
				q.declareParameters("String passengerId");
				q.setFilter("id == passengerId");
				q.deletePersistentAll(passengerId);
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
	public List<Passenger> consultElement() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger searchPassenger(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger searchPassenger(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
