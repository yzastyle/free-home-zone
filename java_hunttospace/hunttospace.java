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
		System.out.println("Введите, пожалйуста, ваше ФИО.");
		String fio = null;
		Scanner console = new Scanner(System.in);
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
	}
}