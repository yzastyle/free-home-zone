import java.util.Scanner;
import java.util.Arrays;

class CO {
	private boolean CO;
	private int COwork;
	
	public int getCOwork() {
		return this.COwork;
	}
	
	public void workOnSpaceShip (Scanner console) {
	 	System.out.println("Работали ли вы когда-нибудь поваром на космическом корабле?");
			while (console.hasNextLine()) {
				String q = console.nextLine();
				if (!(q.equalsIgnoreCase("Да") || q.equalsIgnoreCase("Нет"))) {
					System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
				}
				else if (q.equalsIgnoreCase("Нет")) { 
					System.out.println("Работали ли вы когда-нибудь поваром? (Где угодно)");
					while (console.hasNextLine()) {
						String a = console.nextLine();
						if (!(a.equalsIgnoreCase("Да") || a.equalsIgnoreCase("Нет"))) {
							System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
						}
						else if (a.equalsIgnoreCase("Нет")) {
						return;
						}
						else {
							COwork = 5;
							return;
							}
						}
					}
				else {
					COwork = 10;
					break;
			}
		}
	} 
	
	public void mainDishOnShip (Scanner console) {
		System.out.println("Напишите через запятую, пожалуйста, какие по вашему мнению 4 основных блюда путенского пехотинца.");
		System.out.println("Чтобы пропустить вопрос, введите, \"Пропустить\"");
		String[] putMenu = {"Греча", "Макароны", "Капуста", "Пюрешка"};
		String c = null;
		String[] userMenu = null;
		boolean tryt = false;
		int tempWork = 0;
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (c.equalsIgnoreCase("Пропустить")) {
				System.out.println("Следующий вопрос");
				break;
			}
			else {
				userMenu = c.split(","); 
				for (int i = 0; i < putMenu.length; i++) {
					for (int j = 0; j < userMenu.length; j++) {
						if (putMenu[i].equalsIgnoreCase(userMenu[j].trim())) {
							COwork = COwork + 10;
						}
						else {
							tryt = true;
							continue;
						}
					}
				}
				COwork = tryt == true? COwork + 5: COwork + 0;
				break;
			}
		}
	}
	
	public void shortQandA (Scanner console) {
		System.out.println("Серия коротких вопросов, отвечайте \"Да\" или \"Нет\", пожалуйста.");
		System.out.println("Человек проживет без воды дольше чем без еды?");
		String c = null;
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (!(c.equalsIgnoreCase("Да") || c.equalsIgnoreCase("Нет"))) {
				System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
			}
			else if (c.equalsIgnoreCase("Нет")) {
				break;
			}
			else {
				COwork = COwork + 5;
				break;
			}
		}
		System.out.println("Добавляют ли в солянку оливки?");
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (!(c.equalsIgnoreCase("Да") || c.equalsIgnoreCase("Нет"))) {
				System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
			}
			else if (c.equalsIgnoreCase("Нет")) {
				break;
			}
			else {
				COwork = COwork + 5;
				break;
			}
		}
		System.out.println("Небольшое количество алкоголя разрешено экипажу корабля?");
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (!(c.equalsIgnoreCase("Да") || c.equalsIgnoreCase("Нет"))) {
				System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
			}
			else if (c.equalsIgnoreCase("Нет")) {
				COwork = COwork + 5;
				break;
			}
			else {
				break;
			}
		}
		System.out.println("В случае экстренной ситуациии голода, капитану корабля положено два пайка вместо одного, как другим членам команды?");
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (!(c.equalsIgnoreCase("Да") || c.equalsIgnoreCase("Нет"))) {
				System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
			}
			else if (c.equalsIgnoreCase("Нет")) {
				break;
			}
			else {
				COwork = COwork + 5;
				break;
			}
		}	
	}
	public void finalQuest (Scanner console) {
		System.out.println("Финальный вопрос. Внимание!");
		System.out.println("Котлетки с макорошками?");
		String c = null;
		while (console.hasNextLine()) {
		c = console.nextLine();
		if (!c.equalsIgnoreCase("Пюрешкой")) {
			System.out.println("Извините, но программа определила, что ваших навыков и знаний недостаточно.");
			System.out.println("Вы нам не подходите. Попробуйте еще раз, когда наберетесь опыта.");
			break;
			}
		else {
			System.out.println("У нас хорошие новости для вас!");
			System.out.println("Вы нам подходите!");
			System.out.println("Ожидайте, свями свяжется наш специалист");
			break;
			}	
		}
	} 
	
}