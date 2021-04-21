package DAO;

import java.util.List;

/**
 * 
 * The functions that we may use in AirportDao
 *
 */
public interface AirportDao extends GenericDao<Airport> {

	/**
	 * Search a list of airport by its name
	 * 
	 * @param name
	 * @return Airport List
	 * @throws Exception
	 */
	public List<Airport> searchAirportByName(String name) throws Exception;

	/**
	 * Search a list of airport by its icao code
	 * 
	 * @param code
	 * @return Airport list
	 * @throws Exception
	 */
	public List<Airport> searchAirportByCode(String code) throws Exception;

	/**
	 * Search a list of airport by its location
	 * 
	 * @param location
	 * @return Airport list
	 * @throws Exception
	 */
	public List<Airport> searchAirportByLocation(String location) throws Exception;

}
