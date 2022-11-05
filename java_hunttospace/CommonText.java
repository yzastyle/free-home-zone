import java.util.Scanner;
import java.util.Arrays;

class CommonText {
	public static void preview() {
		String I1 = "***Вас приветствует автоматическая программа по найму на экипаж косимеческого корабля =ЛЕТУЧИЙ ПУТИНЕЦ=***";
		String I2 = "Мы рады, что вы выбрали именно наше судно чтобы бараздить бесконечные просторы комоса.";
		String I3 = "Для успешного трудоустройства вам нужно будет пройти биоаналитический анализатор с технологией распазнования скрытых наклоннйостей.";
		String I4 = "                                                                                                 Мистер робот...";
		String I5 = "                                                                                                    Хайль ПУТЕН!";
		System.out.println(I1 + '\n' + I2 + '\n' + I3 + '\n' + I4 + '\n' + I5);	
	}
	
	public static void goToBioPart(String str) {
		System.out.println("Автоматический определитель ДВЕТЫСЯЧИ путем универсального тудасюда определит вашу профпригодность для экипажа корабля =ЛЕТУЧИЙ ПУТИНЕЦ=");
		System.out.println("Следуйте инструкции ниже, пожалуйста...");
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.println(str + " ответье, пожалуйста на несколько общих вопросов.");
	}

	public static void endBioPart(String fio1, int age1, double weigh1, double tall1, String[] personSick1, boolean noSick, int SpaceCount) {
		System.out.println("Общая биометральная часть опроса подошла к концу, давайте подвидем итоги:");
		System.out.println("ФИО: " + fio1);
		System.out.println("Возраст: " + age1 + " лет");
		System.out.println("Рост: " + tall1 + " см");
		System.out.println("Вес " + weigh1 + " кг");
		if (noSick) {
			System.out.println("Хранические заболевания отсутствуют.");
		}
		else {
			System.out.println("Хронические заболевания: " + Arrays.toString(personSick1));
		}
		if (SpaceCount > 0) {
			System.out.println("Путешествия открытом космосе. " +  SpaceCount + " раз.");
		}
		else {
			System.out.println("В открытом космосе не бывали.");
		}
	}
	
	public static void goToPolitPart() {
		System.out.println("Следующая часть анализатора, выявляет политическую благонадежность кандидата.");
		System.out.println("На вопросы ниже, отвечайте, пожалуйста, цифрами от 1 до 10.");
		System.out.println("Спасибо.");
		System.out.println("");
	}
	
	public static void goToRolePart() {
		System.out.println("Переходдим к основной части нашего анализитора. Выбора роли для нашего экипажа");
		System.out.println("На текущей момент к нам на корабль требуются люди следующий специальностей:");
		System.out.println("CO - Повар");
		System.out.println("DO - Врач");
		System.out.println("WM - стрелок");
		System.out.println("DE - дебик");
	}
}