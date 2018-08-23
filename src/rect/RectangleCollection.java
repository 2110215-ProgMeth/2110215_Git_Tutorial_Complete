package rect;

public class RectangleCollection {
	
	private static final int MAX_LENGTH = 10;
	private static Rectangle[] rectangles = new Rectangle[MAX_LENGTH];
	private static int totalRectangle = 0;
	
	public static void main(String[] args) {
		addRectangle(10, 10);
		addRectangle(20, 20);
		addRectangle(5, 4);
		printRectangles();
	}
	
	public static void printRectangles() {
		for (int i = 0; i < totalRectangle; i++) {
			System.out.println(rectangles[i]);
		}
	}
	
	public static boolean addRectangle(int width, int height) {
		if (totalRectangle < MAX_LENGTH) {
			rectangles[totalRectangle] = new Rectangle(width, height);
			totalRectangle++;
			return true;
		}
		else {
			return false;
		}
	}
}
