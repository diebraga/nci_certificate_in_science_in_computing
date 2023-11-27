package softwareDevelopment.week6Lab.CinemaApp;

import javax.swing.JOptionPane;

public class CinemaApp {
    public static void main(String[] args) {
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

    public static class Cinema {
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
}
