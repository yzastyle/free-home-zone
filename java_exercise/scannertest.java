import java.util.Scanner;

public class scannertest {
	public static void main(String[] args) {
		System.out.println("Введите число");
		Scanner cs = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while (cs.hasNextInt()) {
			a = cs.nextInt();
			b = cs.nextInt();
		}
		System.out.println(a);
	}
}