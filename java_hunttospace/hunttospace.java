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
		CommonText.endBioPart(BF.getFio(), BF.getAge(), BF.getWeigh(), BF.getTall(), BF.getPersonsick(), BF.getNoSick(), BF.getYesSpace());
		CommonText.goToPolitPart();
		PolitForm PF = new PolitForm();
		PF.setPolitPart(console);
		PF.setPolitLead(console);
		PF.setPolitExternal(console);
		PF.setPolitInternal(console);
		PF.politResult(console, PF.getPolitSumm());
		CommonText.goToRolePart();
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (!(q.equalsIgnoreCase("CO") || q.equalsIgnoreCase("DO") || q.equalsIgnoreCase("WM") || q.equalsIgnoreCase("DE"))) {
				System.out.println("Указывайте, пожалуйста, одно из значений: CO, DO, WM, DE");
			}
			else if (q.equalsIgnoreCase("CO")) {
				CO COrole = new CO();
				COrole.workOnSpaceShip(console);
				COrole.mainDishOnShip(console);
				COrole.shortQandA(console);
				if (COrole.getCOwork() < 37) {
					System.out.println("Извините, но программа определила, что ваших навыков и знаний недостаточно.");
					System.out.println("Вы нам не подходите. Попробуйте еще раз, когда наберетесь опыта.");
				}
				else if (COrole.getCOwork() < 55) {
					COrole.finalQuest(console);
				}
				else {
					System.out.println("У нас хорошие новости для вас!");
					System.out.println("Вы нам подходите!");
					System.out.println("Ожидайте, свями свяжется наш специалист");
				}
				break;
			}
			else {
				if (q.equalsIgnoreCase("DO")) {
					DO DOrole = new DO();
					DOrole.workEndExp(console);
					DOrole.mainSickOnShip(console);
					System.out.println("У нас хорошие новости для вас!");
					System.out.println("Вы нам подходите!");
					System.out.println("Ожидайте, свями свяжется наш специалист");
					break;
				}
				else if (q.equalsIgnoreCase("WM")) {
					System.out.println("К сожалению на данную роль набор уже завершен.");
					System.out.println("Оставьте, свой номер телефона и мы вам отправим СМС сообщение, когда появится вакансия");
					int tel = console.nextInt();
					break;
				}
				else {
					System.out.println("Ты бредишь что ли?");
					break;
				}
			}
		}
	} 
}