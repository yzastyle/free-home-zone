import java.util.Scanner;
import java.util.Arrays;

class hunttospace {
	public static void main(String args[]) {
		String I1 = "***Вас приветствует автоматическая программа по найму на экипаж косимеческого корабля =ЛЕТУЧИЙ ПУТИНЕЦ=***";
		String I2 = "Мы рады, что вы выбрали именно наше судно чтобы бараздить бесконечные просторы комоса.";
		String I3 = "Для успешного трудоустройства вам нужно будет пройти биоаналитический анализатор с технологией распазнования скрытых наклоннйостей.";
		String I4 = "                                                                                                 Мистер робот...";
		String I5 = "                                                                                                    Хайль ПУТЕН!";
		System.out.println(I1 + '\n' + I2 + '\n' + I3 + '\n' + I4 + '\n' + I5);	
	/*	System.out.println("Введите, пожалйуста, ваше ФИО.");
		String fio = null; */
		Scanner console = new Scanner(System.in);
		setFio(console);
		/*Scanner console = new Scanner(System.in);
		while (console.hasNextLine()) {
			String s = console.nextLine();
			if (s.matches("[^0-9]*")) {
				fio = s;
				break;
			}
			else {
				System.out.println("Имя " + s + " введено некорректно, используйте, пожалуйста, символы и повторите попытку.");
			}
		}
		System.out.println("Приятно познакомиться" + " " + fio);
		System.out.println("Автоматический определитель ДВЕТЫСЯЧИ путем универсального тудасюда определит вашу профпригодность для экипажа корабля =ЛЕТУЧИЙ ПУТИНЕЦ=");
		System.out.println("Следуйте инструкции ниже, пожалуйста...");
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.println(fio + " ответье, пожалуйста на несколько общих вопросов.");
		System.out.println("Сколько вам лет? " + fio);
		int age = 0;
		while (console.hasNextLine()) {
			String b = console.nextLine();
			if (b.matches("[0-9]*")) {
				age = Integer.parseInt(b);
				if ((age < 18) || (age > 65)) {
					System.out.println("Приносим свои извенения " + fio + ", но минимальный допустимый возраст трудоустройства на наш корабль от 18 до 65 лет.");
					return;
				}
				else {
					System.out.println("Спасибо" + " " + fio);
					break;
					 }
			}
			else {
		  	  System.out.println("Возраст введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
		}
		double weigh = 0;
		System.out.println("Каков ваш вес?");
		while (console.hasNextLine()) {
			String b = console.nextLine();
			if (b.matches("[0-9]*\\.[0-9]*") || b.matches("[0-9]*")) {                                   
				weigh = Double.parseDouble(b);
				if ((weigh < 50) || (weigh > 100)) {
					System.out.println("Приносим свои извенения " + fio + ", но Вы нам не подходите по менедицским показателям");
					System.out.println("Предлагаем Вам ознакомитсья с идеальной медицинской карточкой путенского солдата");
					return;
				}
				else {
					break;
				}
		}
			else {
		  	  	System.out.println("Возраст введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
		}
		double tall = 0;
		System.out.println("Каков ваш рост?");
		while (console.hasNextLine()) {
			String b = console.nextLine();
			if (b.matches("[0-9]*\\.[0-9]*") || b.matches("[0-9]*")) {
				tall = Double.parseDouble(b);
				System.out.println("Спасибо " + fio + ", данные занесены в индивидуальную карту");
				break;
			}
			else {
				System.out.println("Рост введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
		}
		System.out.println("Скажите, пожалуйста, у вас есть какие-либо хронические заболевание?");
		String c = null;
		String[] personsick = {"", "", "", "", ""};
		boolean noSick = false;
		String[] sicklist = {"Бронхиальная астма", "ВСД", "Аритмия", "Панические атаки", "Алкоголизм"};
		int sickpersoncount = 0;
		while (console.hasNextLine()) {
			c = console.nextLine();
			if (c.equalsIgnoreCase("Да")) {
				System.out.println("Напишите, пожалуйста, ваши заболевания через запятую");
				c = console.nextLine();
				personsick = c.split(",");
				sickpersoncount = personsick.length;
				for (int i = 0; i < sicklist.length; i++) {
					for (int j = 0; j < personsick.length; j++) {
						if (sicklist[i].equalsIgnoreCase(personsick[j].trim())) {
							System.out.println("Извините, но у вас присутствует критическое заболевание, вы нам не подходите.");
							return;
						}
						else if (sickpersoncount > 5) {
							System.out.println("Извините, но у вас превышено количество хронических заболеваний, вы нам не подходите.");
							return;
						}
					}
				}
				break;	
			}
			else if (c.equalsIgnoreCase("Нет")) {
				noSick = true;
				break;
			}
			else {
				System.out.println("Отвечайте, пожалуйста \"Да\" или \"Нет\"");
			}
		}
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