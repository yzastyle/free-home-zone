import java.util.Scanner;

public class GeekBrainsFive {
	public static void main(String[] args) {
	
		Scanner cs = new Scanner(System.in);
		System.out.println("Введите первое число...");
		int a = cs.nextInt();
		System.out.println("Введите второе число...");
		int b = cs.nextInt();
		System.out.println("Укажите, какую операцию, которую надо выполнить с этими числами: 1) + 2) - 3) * 4) / ");
		int res = 0;
		int op = cs.nextInt();
		if (op == 1) {
			res = a + b;
			System.out.println("Ответ равен:" + res);
		}
		if (op == 2) {
			res = a - b;
			System.out.println("Ответ равен:" + res);
		}
		if (op == 3) {
			res = a * b;
			System.out.println("Ответ равен:" + res);
		}
		if (op == 4) {
			res = a / b;
			System.out.println("Ответ равен:" + res);
		}
		
	}
}