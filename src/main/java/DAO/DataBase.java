package DAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataBase {
	public static List<Airport> airports = new ArrayList<>();
	public static List<Airplane> airplanes = new ArrayList<>();
	public static List<Pilot> pilots = new ArrayList<>();
	public static List<Flight> flights = new ArrayList<>();
	public static List<User> users = new ArrayList<>();
	public static List<Reservation> reservations = new ArrayList<>();
	public static List<Passenger> passengers = new ArrayList<>();

	public void init() throws Exception {

		Airplane plane1 = new Airplane(1, "Boeing747", 232);
		Airplane plane2 = new Airplane(2, "Boeing747", 232);
		Airplane plane3 = new Airplane(3, "Boeing749", 237);
		Airplane plane4 = new Airplane(4, "Boeing754", 266);
		Airplane plane5 = new Airplane(5, "Boeing712", 343);
		Airplane plane6 = new Airplane(6, "Boeing755", 198);

		Airport port1 = new Airport("Paris Charles de Gaulle", "5632X", "Paris");
		Airport port2 = new Airport("Paris Orly Airport", "6332X", "Paris");
		Airport port3 = new Airport("Nice Airport", "47232X", "Nice");
		Airport port4 = new Airport("Lyon-Saint Exupéry Airport", "58892X", "Lyon");
		Airport port5 = new Airport("Marseille Airport", "0932X", "Marseille");

		Passenger p1 = new Passenger(1, "user1", "sfqmfj", "Bob", "1999-11-12", "skljfqmsndiq@gmail.com");
		Passenger p2 = new Passenger(2, "user2", "fmlHFsfq", "Alex", "1994-01-02", "sdnfqi@gmail.com");
		Passenger p3 = new Passenger(3, "user3", "sjdfqmnsf", "Amy", "1998-01-11", "sqnfi@gmail.com");
		Passenger p4 = new Passenger(4, "user4", "defqsfqfd", "Paul", "1899-03-23", "sqfdqf@gmail.com");
		Passenger p5 = new Passenger(5, "user5", "irenczee", "Harry", "1993-09-12", "zefqd@gmail.com");
		Passenger p6 = new Passenger(6, "user6", "qdokmfqoefoi", "Stark", "1999-12-22", "dqfdqf@gmail.com");
		Passenger p7 = new Passenger(7, "user7", "qofimqf", "Alice", "1995-09-23", "dfqfdqf@gmail.com");

		List<Passenger> list1 = new LinkedList<Passenger>();
		list1.add(p1);
		list1.add(p2);
		List<Passenger> list2 = new LinkedList<Passenger>();
		list2.add(p3);
		list2.add(p4);
		List<Passenger> list3 = new LinkedList<Passenger>();
		list3.add(p5);
		List<Passenger> list4 = new LinkedList<Passenger>();
		list4.add(p6);
		List<Passenger> list5 = new LinkedList<Passenger>();
		list5.add(p7);
		list5.add(p1);
		list5.add(p4);
		list5.add(p5);
		List<Passenger> list6 = new LinkedList<Passenger>();
		list6.add(p1);
		list6.add(p2);
		list6.add(p3);
		list6.add(p4);
		list6.add(p7);
		list6.add(p5);

		Pilot t1 = new Pilot(1, "pilot1", "sfqmfj", "Piere", "1999-01-22", "one-year-pilot", "good",
				"sklqfefvsndiq@gmail.com");
		Pilot t2 = new Pilot(2, "pilot2", "ssdfqj", "Ben", "1999-09-23", "two-year-pilot", "good", "qmsndiq@gmail.com");
		Pilot t3 = new Pilot(3, "pilot3", "fqgeqmfj", "Penny", "1999-05-19", "fifteen-year-pilot", "great",
				"aaaaadiq@gmail.com");
		Pilot t4 = new Pilot(4, "pilot4", "egtsqmfj", "Emily", "1999-08-11", "one-day-pilot", "no qualifications",
				"skbbbbbbiq@gmail.com");

		Flight f1 = new Flight("1", "2019-02-03", "10:00", plane1, port1, port2, t1, list1, 112, 376, "1h");
		Flight f2 = new Flight("2", "2019-02-03", "11:00", plane2, port2, port3, t2, list2, 132, 396, "2h");
		Flight f3 = new Flight("3", "2019-02-03", "12:30", plane3, port3, port4, t3, list3, 12, 374, "3h");
		Flight f4 = new Flight("4", "2019-02-13", "09:00", plane1, port4, port2, t4, list4, 21, 373, "1h");
		Flight f5 = new Flight("5", "2019-02-13", "10:00", plane2, port5, port1, t1, list5, 12, 346, "1h");
		Flight f6 = new Flight("6", "2019-02-13", "12:10", plane6, port1, port5, t2, list6, 154, 376, "1h");
		Flight f7 = new Flight("7", "2019-02-13", "12:40", plane1, port2, port4, t3, list1, 1533, 176, "1h");
		Flight f8 = new Flight("8", "2019-02-13", "12:50", plane2, port3, port3, t4, list2, 112, 456, "1h");
		Flight f9 = new Flight("9", "2019-02-15", "08:00", plane3, port4, port2, t1, list3, 112, 326, "1h30m");
		Flight f10 = new Flight("10", "2019-02-15", "21:00", plane4, port5, port1, t2, list4, 112, 276, "1h");
		Flight f11 = new Flight("11", "2019-02-16", "16:00", plane5, port1, port2, t3, list5, 100, 476, "1h");
		Flight f12 = new Flight("12", "2019-02-17", "18:10", plane6, port2, port4, t4, list6, 211, 476, "1h");
		Flight f13 = new Flight("13", "2019-02-18", "12:00", plane1, port3, port2, t1, list1, 45, 376, "1h23m");
		Flight f14 = new Flight("14", "2019-02-20", "06:00", plane2, port4, port3, t2, list2, 32, 376, "1h");
		Flight f15 = new Flight("15", "2019-02-22", "03:00", plane3, port5, port5, t3, list3, 65, 376, "1h");
		Flight f16 = new Flight("16", "2019-02-22", "04:20", plane4, port1, port1, t4, list4, 54, 376, "1h");
		Flight f17 = new Flight("17", "2019-02-22", "04:45", plane5, port2, port4, t1, list5, 25, 676, "1h33m");
		Flight f18 = new Flight("18", "2019-02-22", "08:00", plane6, port3, port4, t1, list6, 12, 176, "1h");
		Flight f19 = new Flight("19", "2019-02-22", "12:10", plane1, port4, port2, t2, list1, 54, 376, "1h");
		Flight f20 = new Flight("20", "2019-02-22", "15:50", plane2, port5, port2, t3, list2, 12, 376, "1h");
		Flight f21 = new Flight("21", "2019-02-26", "12:30", plane3, port1, port5, t4, list3, 65, 376, "1h");
		Flight f22 = new Flight("22", "2019-02-26", "12:00", plane4, port2, port5, t1, list4, 3, 116, "1h");
		Flight f23 = new Flight("23", "2019-02-27", "23:00", plane5, port3, port2, t2, list5, 32, 376, "1h");
		Flight f24 = new Flight("24", "2019-02-28", "11:00", plane6, port4, port1, t3, list6, 16, 176, "1h");

		Reservation r1 = new Reservation("1", f1, p1, 2);
		Reservation r2 = new Reservation("2", f1, p2, 1);
		Reservation r3 = new Reservation("3", f3, p1, 7);
		Reservation r4 = new Reservation("4", f4, p1, 2);
		Reservation r5 = new Reservation("5", f6, p4, 1);
		Reservation r6 = new Reservation("6", f8, p5, 1);
		Reservation r7 = new Reservation("7", f21, p3, 2);

		airports.add(port1);
		airports.add(port2);
		airports.add(port3);
		airports.add(port4);
		airports.add(port5);

		airplanes.add(plane1);
		airplanes.add(plane2);
		airplanes.add(plane3);
		airplanes.add(plane4);
		airplanes.add(plane5);
		airplanes.add(plane6);

		passengers.add(p1);
		passengers.add(p2);
		passengers.add(p3);
		passengers.add(p4);
		passengers.add(p5);
		passengers.add(p6);
		passengers.add(p7);

		pilots.add(t1);
		pilots.add(t2);
		pilots.add(t3);
		pilots.add(t4);

		flights.add(f1);
		flights.add(f2);
		flights.add(f3);
		flights.add(f4);
		flights.add(f5);
		flights.add(f6);
		flights.add(f7);
		flights.add(f8);
		flights.add(f9);
		flights.add(f10);
		flights.add(f11);
		flights.add(f12);
		flights.add(f13);
		flights.add(f14);
		flights.add(f15);
		flights.add(f16);
		flights.add(f17);
		flights.add(f18);
		flights.add(f19);
		flights.add(f20);
		flights.add(f21);
		flights.add(f22);
		flights.add(f23);
		flights.add(f24);
		reservations.add(r1);
		reservations.add(r2);
		reservations.add(r3);
		reservations.add(r4);
		reservations.add(r5);
		reservations.add(r6);
		reservations.add(r7);

	}
}
