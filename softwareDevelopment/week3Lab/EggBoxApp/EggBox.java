public class EggBox {
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}

	public void setBoxSize(int boxSize) {
		this.boxSize = boxSize;
	}

	public void computeBoxes() {
		numBoxes = eggs / boxSize;
	}

	public void computeLeftover() {
		leftOverEggs = eggs % boxSize;
	}

	public int getBoxes() {
		return numBoxes;
	}

	public int getLeftover() {
		return leftOverEggs;
	}
}
