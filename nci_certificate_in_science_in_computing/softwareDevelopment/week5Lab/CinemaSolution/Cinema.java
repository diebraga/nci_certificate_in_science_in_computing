package softwareDevelopment.week5Lab.CinemaSolution;

public class Cinema {
	// declare vars
	private int age = 0;
	private int numTickets = 1;
	private String day = "";
	private double cost = 0.0;

	// constructor

	// set
	public void setAge(int ageParam) {
		age = ageParam;
	}

	public void setNumTickets(int numTicketsParam) {
		numTickets = numTicketsParam;
	}

	public void setDay(String dayParam) {
		day = dayParam;
	}

	// compute
	public void computeCost() {
		if (day.equalsIgnoreCase("Weekend")) {
			if (age >= 18) {
				cost = 12.50 * numTickets;
			} else if (age < 18 && age > 0) {
				cost = 10.00 * numTickets;
			} else {
				System.out.println("Invalid entry for age");
			}
		} else if (day.equalsIgnoreCase("Weekday")) {
			if (age >= 18) {
				cost = 10.50 * numTickets;
			} else if (age < 18 && age > 0) {
				cost = 8.00 * numTickets;
			} else {
				System.out.println("Invalid entry for age");
			}
		} else {
			System.out.println("Invalid entry for weekday/weekend");
		}
	}

	// get
	public double getCost() {
		return cost;
	}
}