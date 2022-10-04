import java.util.Scanner;
import java.util.Arrays;

class BioForm {
	private String fio = null;
	private int age;
	private double weigh;
	private double tall;
	private String[] personsick;
	private boolean noSick;
	private int YesSpace;
	
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
			if (!b.matches("[0-9]*")) {
				System.out.println("Возраст введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
			else {
				age = Integer.parseInt(b);
				if ((age < 18) || (age > 65)) {
					System.out.println("Приносим свои извенения " + getFio() + ", но минимальный допустимый возраст трудоустройства на наш корабль от 18 до 65 лет.");
					System.exit(1);
				}
				else {
					System.out.println("Спасибо" + " " + getFio());
					break;
					 }
			}
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setWeigh (Scanner console) {
		System.out.println("Каков ваш вес?");
		while (console.hasNextLine()) {
			String b = console.nextLine();
			if (!(b.matches("[0-9]*\\.[0-9]*") || b.matches("[0-9]*"))) {                                   
				System.out.println("Возраст введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
			else {
				weigh = Double.parseDouble(b);
				if ((weigh < 50) || (weigh > 100)) {
					System.out.println("Приносим свои извенения " + fio + ", но Вы нам не подходите по менедицским показателям");
					System.out.println("Предлагаем Вам ознакомитсья с идеальной медицинской карточкой путенского солдата");
					System.exit(1);
				}
				else {
					break;
				}
			}
		}
	}
	
	public double getWeigh() {
		return this.weigh;
	}
	
	public void setTall (Scanner console) {
		System.out.println("Каков ваш рост?");
		while (console.hasNextLine()) {
			String b = console.nextLine();
			if (!(b.matches("[0-9]*\\.[0-9]*") || b.matches("[0-9]*"))) {
				System.out.println("Рост введен некорректно, используте, пожалуйста, цифры и повторите попытку.");
			}
			else {
				tall = Double.parseDouble(b);
				System.out.println("Спасибо " + fio + ", данные занесены в индивидуальную карту");
				break;
			}
		}
	}
	
	public double getTall() {
		return this.tall;
	}

	public void setSick (Scanner console) {
		System.out.println("Скажите, пожалуйста, у вас есть какие-либо хронические заболевание?");
		String c = null;
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
	}
	
	public boolean getNoSick() {
		return this.noSick;
	}
	
	public String[] getPersonsick() {
		return this.personsick;
	}
	
	public void setSpaceCount (Scanner console) {
		System.out.println("Отлично, Вы нам подходите. Перейдем к следующему вопросу.");
		System.out.println("Бывали ли вы когда-нибудь в космосе?");
		System.out.println("Ответ должен быть \"Да\" или \"Нет\"");
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
	}
		
	
}