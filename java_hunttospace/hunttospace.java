import java.util.Scanner;
import java.util.Arrays;

class hunttospace {
	public static void main(String args[]) {
		CommonText.preview();
		Scanner console = new Scanner(System.in);
		BioForm BF = new BioForm();
		BF.setFio(console);
		CommonText.goToBioPart(BF.getFio());
		BF.setAge(console);
		BF.setWeigh(console);
		BF.setTall(console);
		BF.setSick(console);
		BF.setSpaceCount(console);
		/*
		System.out.println("Отлично, Вы нам подходите. Перейдем к следующему вопросу.");
		System.out.println("Бывали ли вы когда-нибудь в космосе?");
		System.out.println("Ответ должен быть \"Да\" или \"Нет\"");
		int YesSpace = 0;
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (q.equalsIgnoreCase("Да") || q.equalsIgnoreCase("Нет")) {
				if (q.equalsIgnoreCase("Да")) {
					System.out.println("Подскажите, пожалуйста, сколько раз вы были в открытом космосе?");
					YesSpace = console.nextInt();
					System.out.println("Спасибо за информацию.");
				}
				else {
					System.out.println("Спасибо за информацию.");
				}
				break;
			}
			else {
				System.out.println("Отвечайте, пожалуйста \"Да\" или \"Нет\"");
			}
		}
		System.out.println("Общая биометральная часть опроса подошла к концу, давайте подвидем итоги:");
		System.out.println("ФИО: " + fio);
		System.out.println("Возраст: " + age);
		System.out.println("Рост: " + tall);
		System.out.println("Вес " + weigh);
		if (noSick) {
			System.out.println("Хранические заболевания отсутствуют.");
		}
		else {
			System.out.println("Хронические заболевания: " + Arrays.toString(personsick));
		}
		if (YesSpace > 0) {
			System.out.println("Путешествия открытом космосе. " +  YesSpace + " раз.");
		}
		else {
			System.out.println("В открытом космосе не бывали.");
		}
		System.out.println("Следующая часть анализатора, выявляет политическую благонадежность кандидата.");
		System.out.println("На вопросы ниже, отвечайте, пожалуйста, цифрами от 1 до 10.");
		System.out.println("Спасибо.");
		System.out.println("");
		System.out.println("Как вы относитесь к политической повестке нашей правящей партии \"Единственная Россия\"");
		int politsumm = 0;
		while (console.hasNextLine()) {
			String q = console.nextLine();	
			if (q.matches("[1-9]") || q.matches("10")) {
				politsumm = Integer.parseInt(q);
				break;
				}
			else {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
				}
		}
		System.out.println("");
		System.out.println("Оцените личность нашего великого лидера, где 1 - слабый, 10 - сильнейший");
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (q.matches("[1-9]") || q.matches("10")) {
				politsumm = politsumm + Integer.parseInt(q);
				break;
			}
			else {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
		}
		System.out.println("");
		System.out.println("Оцените внешнюю политику нашего великого лидера, где 1 - максимально негативная, 10 - максимально позитивная");
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (q.matches("[1-9]") || q.matches("10")) {
				politsumm = politsumm + Integer.parseInt(q);
				break;
			}
			else {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
		}
		System.out.println("");
		System.out.println("Оцените внутреннюю политику нашего великого лидера, где 1 - максимально негативная, 10 - максимально позитивная");
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (q.matches("[1-9]") || q.matches("10")) {
				politsumm = politsumm + Integer.parseInt(q);
				break;
			}
			else {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
		}
		if (politsumm <= 20) {
			System.out.println("Извините, но вы не прошли тест политической благонадежности, ваш уровень - дисидент");
			System.out.println("К месту машины по найму Р-33хХ2 вызвана бригада чекистантов");
		}
		else if ((politsumm > 20) && (politsumm < 32)) {
			System.out.println("Представим ситуацию, если вы выдите, как некто срывает плакаты или портит плакаты с нашим могучим лидером");
			System.out.println("Вы: А) Доложите об этом в ближайший чекист-пункт. Б) Оставите это без внимания");
			while (console.hasNextLine()) {
				String q = console.nextLine();
				if (q.equalsIgnoreCase("А")) {
					System.out.println("Спасибо, перейдем к следующей части нашего автоматического-найма");
					break;
				}
				else if (q.equalsIgnoreCase("Б")) {
					System.out.println("Извините, но вы не прошли тест политической благонадежности, ваш уровень - склонный к предательству");
					return;
				}
				else {
					System.out.println("Отвечайте, пожалуйста, \"А\" или \"Б\"");
				}
			}
		}
		System.out.println("Переходдим к основной части нашего анализитора. Выбора роли для нашего экипажа");
		System.out.println("На текущей момент к нам на корабль требуются люди следующий специальностей:");
		System.out.println("CO - Повар");
		System.out.println("DO - Врач");
		System.out.println("WM - стрелок");
		System.out.println("DE - дебик");
		boolean CO = false;
		boolean DO = false;
		boolean WM = false;
		boolean DE = false;
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (q.equalsIgnoreCase("CO")) {
				CO = true;
				break;
			}
			else if (q.equalsIgnoreCase("DO")) {
				DO = true;
				break;
			}
			else {
				if (q.equalsIgnoreCase("WM")) {
					WM = true;
					break;
				}
				else if (q.equalsIgnoreCase("DE")) {
					DE = true;
					break;
				}
				else {
					System.out.println("Указывайте, пожалуйста, одно из значений: CO, DO, WM, DE");
				}
			}
		}
		if (CO) {
			System.out.println("Работали ли вы когда-нибудь поваром на космическом корабле?");
			int work = 0;
			while (console.hasNextLine()) {
				String q = console.nextLine();
				if (q.equalsIgnoreCase("Да")) {
					work = 10;
					break;
				}
				else if (q.equalsIgnoreCase("Нет")) {
					break;
				}
				else {
					System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
				}
			}
			System.out.println("Назовите, пожалуйста, какие по вашему мнению 4 основных блюда путенского пехотинца.");
			String[] putmenu = {"", "", "", ""};
			
		}
		else if (DO) {
			System.out.println("Venrf doctar");
		}
		else {
			if (WM) {
				System.out.println("vetka strelka");
			}
			else {
				System.out.println("DE");
			}
		} */
	} 
}