import java.util.Scanner;
import java.util.Arrays;

class BioForm {
	private String fio = null;
	private int age1;
	private double weigh1;
	private double tall1;
	
	public void setFio (Scanner console) {
		System.out.println("Введите, пожалйуста, ваше ФИО.");
		while (console.hasNextLine()) {
			String s = console.nextLine();
			if (!s.matches("[^0-9]*")) {
				System.out.println("Имя " + s + " введено некорректно, используйте, пожалуйста, символы и повторите попытку.");
			}
			else {
				this.fio = s;
				break;
			}
		}
		System.out.println("Приятно познакомиться" + " " + fio);
		System.out.println("");
	}
	
	public String getFio() {
		return this.fio;
	}
}