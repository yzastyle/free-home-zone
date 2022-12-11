
public class GeekBrainsFour {
	public static void main(String[] args) {
		int ez = 2;
		outer:
		for (int i = 2; i < 1001; i++) {
			for (int j = 2; j < i; j++) {
				if ((i != j) && (i % j == 0)) {
					 continue outer;
				}
				else {
					ez = i;
				}
			}
			System.out.println(ez);
		}
	}
}