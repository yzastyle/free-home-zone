import java.util.Scanner;

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
		System.out.println("Автоматический определитель ДВЕТЫСЯЧИ путем универсального тудасюда определит вашу профпригодность для экипажа корабля =ЛЕТУЧИЙ ПУТИНЕЦ");
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
				System.out.println("Спасибо" + " " + fio);
				break;
			}
			else {
		  	  System.out.println("Возраст введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
		}
		
	}
}