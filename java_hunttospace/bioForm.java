import java.util.Scanner;
import java.util.Arrays;

class bioForm {
	Scanner console = new Scanner(System.in);
	private String fio;
	private int age1;
	private double weigh1;
	private double tall1;
	
	public void setFio (Scanner console) {
		System.out.println("Введите, пожалйуста, ваше ФИО.");
		String fio = null;
		while (console.hasNextLine()) {
			String s = console.nextLine();
			if (!s.matches("[^0-9]*")) {
				System.out.println("Имя " + s + " введено некорректно, используйте, пожалуйста, символы и повторите попытку.");
			}
			else {
				fio = s;
				break;
			}
		}
		System.out.println("Приятно познакомиться" + " " + fio);
	} 
}