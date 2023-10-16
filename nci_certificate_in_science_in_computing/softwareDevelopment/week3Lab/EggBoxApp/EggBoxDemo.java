import javax.swing.JOptionPane;

public class EggBoxDemo {
	public static void main(String[] args) {
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;

		EggBox egg;
		// Create new instance of the class EggBox
		egg = new EggBox();

		eggs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of eggs"));
		boxSize = 6;

		// Set
		egg.setEggs(eggs);
		egg.setBoxSize(boxSize);

		// Compute
		egg.computeBoxes();
		egg.computeLeftover();

		// Get
		numBoxes = egg.getBoxes();
		leftOverEggs = egg.getLeftover();

		JOptionPane.showMessageDialog(null, "Number of boxes needed " + numBoxes);
		JOptionPane.showMessageDialog(null, "Number of eggs left over " + leftOverEggs);
	}
}
