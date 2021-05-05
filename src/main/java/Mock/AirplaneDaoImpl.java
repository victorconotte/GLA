package Mock;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;

import DAO.Airplane;
import DAO.AirplaneDao;
import DAO.User;

public class AirplaneDaoImpl implements AirplaneDao {
	private PersistenceManagerFactory pmf;

	public AirplaneDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	@Override
	public boolean addElement(Airplane e) throws Exception {
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
	public Airplane modifyElement(String id, Airplane element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Airplane e) throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		boolean b = true;
		if (e == null) {
			return false;
		}
		try {
			tx.begin();
			int airplaneId = e.getId();
			if (e != null) {
				Query q = pm.newQuery(User.class);
				q.declareParameters("Integer airplaneId");
				q.setFilter("id == airplaneId");
				q.deletePersistentAll(airplaneId);
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
	public List<Airplane> consultElement() throws Exception {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		List<Airplane> planes;
		try {
			tx.begin();
			planes = new ArrayList<Airplane>(pm.getManagedObjects(Airplane.class));
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return planes;
	}

	@Override
	public Airplane searchPlane(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airplane> searchPlane(String model) throws Exception {
		List<Airplane> actions = null;
		List<Airplane> detached = new ArrayList<Airplane>();
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			Query q = pm.newQuery(Airplane.class);
			q.declareParameters("String mod");
			q.setFilter("model == mod");

			actions = (List<Airplane>) q.execute(model);
			detached = (List<Airplane>) pm.detachCopyAll(actions);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return detached;
	}

}
