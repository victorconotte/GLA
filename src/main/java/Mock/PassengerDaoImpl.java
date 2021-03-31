package Mock;

import java.util.List;

import DAO.Passenger;
import DAO.PassengerDao;

public class PassengerDaoImpl implements PassengerDao {

	@Override
	public boolean addElement(Passenger e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Passenger modifyElement(String id, Passenger element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Passenger e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteElement(String id) {
		// TODO Auto-generated method stub
		return false;
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

}
