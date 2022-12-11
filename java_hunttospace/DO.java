import java.util.Scanner;
import java.util.Arrays;

class DO {
	private int DOwork;
	
	public int getDOwork() {
		return this.DOwork;
	}
	
	public void workEndExp (Scanner console) {
	 	System.out.println("Работали ли вы когда-нибудь врачем?");
			while (console.hasNextLine()) {
				String q = console.nextLine();
				if (!(q.equalsIgnoreCase("Да") || q.equalsIgnoreCase("Нет"))) {
					System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
				}
				else if (q.equalsIgnoreCase("Нет")) {
					break;
				}
				else {
					System.out.println("Скажите, ваш опыт работы, пожалуйста.");
					while (console.hasNextLine()) {
						String a = console.nextLine();
						if (a.matches("[^0-9]*")) {
							System.out.println("Указывайте числа, пожалуйста.");
						}
						else {
							int exp = Integer.parseInt(a);
							DOwork = exp > 5? DOwork + 10: DOwork + 5;
							break;
						}
					}
				}
			}
		} 
	
	public void mainSickOnShip (Scanner console) {
		System.out.println("Напишите через запятую, пожалуйста, самые частые болезни на космическом кораболе");
		System.out.println("Чтобы пропустить вопрос, введите, \"Пропустить\"");
		String[] shipSick = {"Шиза", "Алкоголизм", "КосмоГрипп"};
		String c = null;
		String[] userSick = null;
		boolean tryt = false;
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (c.equalsIgnoreCase("Пропустить")) {
				System.out.println("Следующий вопрос");
				break;
			}
			else {
				userSick = c.split(","); 
				for (int i = 0; i < shipSick.length; i++) {
					for (int j = 0; j < userSick.length; j++) {
						if (shipSick[i].equalsIgnoreCase(userSick[j].trim())) {
							DOwork = DOwork + 10;
						}
						else {
							tryt = true;
							continue;
						}
					}
				}
				DOwork = tryt == true? DOwork + 5: DOwork + 0;
				break;
			}
		}
	}
}