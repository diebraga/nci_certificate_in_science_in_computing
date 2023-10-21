package softwareDevelopment.week5Lab.CinemaSolution;

import javax.swing.JOptionPane;

public class CinemaApp {
	public static void main(String[] args) {
		// declare vars

		// declare & create objects

		Cinema cinema = new Cinema();
		// input
		int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));
		String day = JOptionPane.showInputDialog(null, "Enter either \"weekend\" or \"weekday\"");
		int numTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of tickets"));
		// set
		cinema.setAge(age);
		cinema.setNumTickets(numTickets);
		cinema.setDay(day);
		// compute
		cinema.computeCost();
		// get
		double cost = cinema.getCost();
		// output
		JOptionPane.showMessageDialog(null, numTickets + " tickets will cost: " + cost);
	}
}