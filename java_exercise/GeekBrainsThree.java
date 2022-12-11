
public class GeekBrainsThree {
	public static void main (String[] args) {
		System.out.println(factorialN(6));
	}
	
	public static int factorialN (int n) {
		int res = 1;
		for (int i = 1; i < n +1; i++) {
			res = res * i;
		}
		return res;
	}
}