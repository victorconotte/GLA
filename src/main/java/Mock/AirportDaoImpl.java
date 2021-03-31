package Mock;

import java.util.List;

import DAO.Airport;
import DAO.AirportDao;

public class AirportDaoImpl implements AirportDao {

	@Override
	public boolean addElement(Airport e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Airport modifyElement(String id, Airport element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Airport e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteElement(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Airport> consultElement() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searcheAirportByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searcheAirportByCode(String code) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searcheAirportByLocation(String location) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
