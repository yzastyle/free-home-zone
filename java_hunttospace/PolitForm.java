import java.util.Scanner;
import java.util.Arrays;

class PolitForm {
	private int politsumm;
	
	
	public void setPolitPart (Scanner console) {
		System.out.println("Как вы относитесь к политической повестке нашей правящей партии \"Единственная Россия\"");
		while (console.hasNextLine()) {
			String q = console.nextLine();	
			if (!(q.matches("[1-9]") || q.matches("10"))) {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
			else {
				politsumm = Integer.parseInt(q);
				break;
			}
		}
	}
	
	public void setPolitLead (Scanner console) {
		System.out.println("");
		System.out.println("Оцените личность нашего великого лидера, где 1 - слабый, 10 - сильнейший");
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (!(q.matches("[1-9]") || q.matches("10"))) {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
			else {
				politsumm = politsumm + Integer.parseInt(q);
				break;
			}
		}
	}
	
	public void setPolitExternal (Scanner console) {
		System.out.println("");
		System.out.println("Оцените внешнюю политику нашего великого лидера, где 1 - максимально негативная, 10 - максимально позитивная");
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (!(q.matches("[1-9]") || q.matches("10"))) {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
			else {
				politsumm = politsumm + Integer.parseInt(q);
				break;
			}
		}
	}
	
	public void setPolitInternal (Scanner console) {
		System.out.println("");
		System.out.println("Оцените внутреннюю политику нашего великого лидера, где 1 - максимально негативная, 10 - максимально позитивная");
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (!(q.matches("[1-9]") || q.matches("10"))) {
				System.out.println("Отвечайте, пожалуйста, цифрами от 1 до 10.");
			}
			else {
				politsumm = politsumm + Integer.parseInt(q);
				break;
			}
		}
	}
	
	public void politResult (Scanner console, int politsumm) {
		if (politsumm <= 20) {
			System.out.println("Извините, но вы не прошли тест политической благонадежности, ваш уровень - дисидент");
			System.out.println("К месту машины по найму Р-33хХ2 вызвана бригада чекистантов");
		}
		else if ((politsumm > 20) && (politsumm < 32)) {
			System.out.println("Представим ситуацию, если вы выдите, как некто срывает плакаты или портит плакаты с нашим могучим лидером");
			System.out.println("Вы: А) Доложите об этом в ближайший чекист-пункт. Б) Оставите это без внимания");
			while (console.hasNextLine()) {
				String q = console.nextLine();
				if (q.equalsIgnoreCase("Б")) {
					System.out.println("Извините, но вы не прошли тест политической благонадежности, ваш уровень - склонный к предательству");
					System.exit(0);
				}
				else if (q.equalsIgnoreCase("А")) {
					System.out.println("Спасибо, перейдем к следующей части нашего автоматического-найма");
					break;
				}
				else {
					System.out.println("Отвечайте, пожалуйста, \"А\" или \"Б\"");
				}
			}
		}
		else {
			System.out.println("Спасибо, перейдем к следующей части нашего автоматического-найма");
		}
	}
	
	public int getPolitSumm() {
		return this.politsumm;
	}
}