import java.util.Scanner;

class if_else1 {
	public static void main(String args[]) {
		String cold = "FROZEN BLYAD";
		String warm = "JARA BLYAD";
		int key;
		Scanner console = new Scanner(System.in);
		System.out.println("Сколько сегодня градусов дядя?");
		if (console.hasNextInt()) {
			key = console.nextInt();
			int temp = key;
				if (temp >= 0)
					System.out.println(warm);
				else
					System.out.println(cold);
		}
		else {
			System.out.println("Дядя, введи число, пожалуйста");   //test git
		}
	}
}

