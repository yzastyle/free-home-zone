import java.util.Scanner;
import java.util.Arrays;

class BioForm {
	private String fio = null;
	private int age;
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
	
	public void setAge (Scanner console) {
		System.out.println("Сколько вам лет? " + getFio());
		while (console.hasNextLine()) {
			String b = console.nextLine();
			if (b.matches("[0-9]*")) {
				age = Integer.parseInt(b);
				if ((age < 18) || (age > 65)) {
					System.out.println("Приносим свои извенения " + getFio() + ", но минимальный допустимый возраст трудоустройства на наш корабль от 18 до 65 лет.");
					return;
				}
				else {
					System.out.println("Спасибо" + " " + getFio());
					break;
					 }
			}
			else {
		  	  System.out.println("Возраст введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
		}
	}
	
	
}