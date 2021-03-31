package Mock;

import java.io.IOException;
import java.util.List;

import DAO.Reservation;
import DAO.ReservationDao;

public class ReservationDaoImpl implements ReservationDao {

	@Override
	public boolean addElement(Reservation e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation modifyElement(String id, Reservation element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(Reservation e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteElement(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Reservation> consultElement() throws Exception {
		// TODO Auto-generated method stub
		return null;
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
