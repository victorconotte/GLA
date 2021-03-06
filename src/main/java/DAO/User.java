package DAO;

public class User {

	// =================================attributes==============================
	/**
	 * the id
	 */
	private int id;
	/**
	 * the userName of the user account
	 */
	private String userName;
	/**
	 * the passWord of the user account
	 */
	private String passWord;
	/**
	 * the name of the passenger
	 */
	private String name;
	/**
	 * the birth date of the passenger
	 */
	private String birthDate;

	private String email;
	// =============================== the methods ================================

	public User(int id, String userName, String passWord, String name, String birthDate, String mail) {
		this.setId(id);
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.birthDate = birthDate;
		this.email = mail;
	}

	// -------------------------------getters and
	// setters----------------------------

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return passWord;
	}

	public String getName() {
		return name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String passWord) {
		this.passWord = passWord;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", name=" + name + ", birthDate=" + birthDate
				+ "]";
	}
	// --------------------------------------------------------------------

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
