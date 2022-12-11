
public class GeekBrainsTwo {
	public static void main (String[] args) {
		System.out.println(triangleDig(3));
	}
	
	public static int triangleDig (int n) {
		int res = 0;
		int temp = 0;
		for (int i = 1; i < n + 1; i++) {
			temp =  ((i * (i + 1)) / 2);
			res = res + temp;
		}
		return res;
	}
}