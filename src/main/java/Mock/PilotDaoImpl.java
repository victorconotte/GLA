package Mock;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import DAO.Pilot;
import DAO.PilotDao;
import DAO.User;

public class PilotDaoImpl implements PilotDao {
	static List<Pilot> p = new ArrayList<>();
	private PersistenceManagerFactory pmf;

	public PilotDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	@Override
	public boolean addElement(Pilot e) throws Exception {
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
	public Pilot modifyElement(String id, Pilot element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Pilot e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		if (e == null) {
			return false;
		}
		try {
			tx.begin();
			int pilotId = e.getId();
			if (e != null) {
				Query q = pm.newQuery(User.class);
				q.declareParameters("String pilotId");
				q.setFilter("id == pilotId");
				q.deletePersistentAll(pilotId);
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
	public List<Pilot> consultElement() throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Pilot> pilots;
		try {
			tx.begin();
			pilots = new ArrayList<Pilot>(pm.getManagedObjects(Pilot.class));
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return pilots;
	}

	@Override
	public Pilot searchPilot(int id) throws Exception {
		for (Pilot pp : p) {
			if (pp.getId() == id)
				return pp;
		}
		return null;
	}

	@Override
	public Pilot searchPilot(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pilot searchPilotByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
