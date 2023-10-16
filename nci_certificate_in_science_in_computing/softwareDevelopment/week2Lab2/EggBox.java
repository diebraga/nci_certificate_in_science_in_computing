import javax.swing.JOptionPane;

public class EggBox {
	public static void main(String[] args) {
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;

		eggs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of eggs"));
		boxSize = 6;

		numBoxes = eggs / boxSize;
		leftOverEggs = eggs % boxSize;

		JOptionPane.showMessageDialog(null, "Number of boxes needed " + numBoxes);
		JOptionPane.showMessageDialog(null, "Number of eggs left over " + leftOverEggs);
	}
}
