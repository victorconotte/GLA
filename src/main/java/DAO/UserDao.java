package DAO;

import java.util.List;

public interface UserDao extends GenericDao<User> {

	/**
	 * Returns the list of all registered users. If there is not users, it will
	 * return a null object.
	 * 
	 * @return the users on the database
	 */
	public List<User> getUsers();

	/**
	 * Returns the user selected by its id.
	 *
	 * @param uid the user identifier
	 * @return the user object
	 */
	public User getUser(int uid);

	/**
	 * Returns the user selected by his name.
	 *
	 * @param username the user identifier
	 * @return the user object
	 */
	public User getUser(String username);

	/**
	 * Creates a new user on the database according to the user's information
	 * matching the fields' names. If the username is already used it don't finalize
	 * the processus. This service is used on the sign-up process.
	 * 
	 * @param username a public string identifier of the user
	 * @param passwd   the password
	 * @return the result message
	 */
	public String createUser(String name, String passwd);

	/**
	 * Edits the user selected by its id. The username can not be changed.
	 *
	 * @param uid    the user identifier
	 * @param passwd new password
	 * @return the result message
	 */
	public String editUser(int uid, String passwd);

	/**
	 * Deletes the user selected by its id. A user can delete himself only.
	 *
	 * @param uid the user identifier
	 * @return true if the operation was successful
	 */
	public boolean deleteUser(int uid);

}
