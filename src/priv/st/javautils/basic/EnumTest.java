package priv.st.javautils.basic;

enum Color {
	RED, GREEN, BLANK, YELLOW
}

public class EnumTest {
	static boolean isRed(Color color) {
		if (Color.RED.equals(color)) {
			return true;
		}
		return false;
	}

	static void showColor(Color color) {
		switch (color) {
		case BLANK:
			System.out.println(color);
			break;
		case RED:
			System.out.println(color);
			break;
		default:
			System.out.println(color);
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println(isRed(Color.BLANK)); // 结果： false
		System.out.println(isRed(Color.RED)); // 结果： true
		showColor( Color.RED );
	}
}
