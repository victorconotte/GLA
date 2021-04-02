package Mock;

import java.util.ArrayList;
import java.util.List;

import DAO.User;
import DAO.UserDao;

public class UserDaoImpl implements UserDao {

	static List<User> u = new ArrayList<>();

	@Override
	public boolean addElement(User e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User modifyElement(String id, User element) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteElement(User e) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteElement(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> consultElement() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsers() {
		return u;
	}

	@Override
	public String createUser(String name, String password) {
		for (User us : u) {
			if (us.getName().equalsIgnoreCase(name)) {
				return "This username is already used.";
			}
		}
		User newUser = new User((Integer) null, name, password, null, null, null);
		u.add(newUser);
		return "flightshare/flightshare.html?uid=" + newUser.getId();
	}

	@Override
	public User getUser(int uid) {
		for (User us : u) {
			if (us.getId() == uid)
				return us;
		}
		return null;
	}

	@Override
	public User getUser(String username) {
		for (User us : u) {
			if (us.getName().equalsIgnoreCase(username))
				return us;
		}
		return null;
	}

	@Override
	public String editUser(int uid, String password) {
		for (User us : u) {
			if (us.getId() == uid) {
				us.setPassword(password);
				return "Password successfully updated!";
			}
		}
		return "User not found!";
	}

	@Override
	public boolean deleteUser(int uid) {
		for (User us : u) {
			if (us.getId() == uid) {
				u.remove(us);
				return true;
			}
		}
		return false;
	}

}
