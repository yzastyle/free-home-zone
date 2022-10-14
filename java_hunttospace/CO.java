import java.util.Scanner;
import java.util.Arrays;

class CO {
	private boolean CO;
	private int COwork;
	
	public void workOnSpaceShip (Scanner console) {
		System.out.println("Работали ли вы когда-нибудь поваром на космическом корабле?");
			while (console.hasNextLine()) {
				String q = console.nextLine();
				if (q.equalsIgnoreCase("Да")) {
					COwork = 10;
					break;
				}
				else if (q.equalsIgnoreCase("Нет")) {
					break;
				}
				else {
					System.out.println("Отвечайте \"Да\" или \"Нет\", пожалуйста.");
			}
		}
	}
	/*System.out.println("Назовите, пожалуйста, какие по вашему мнению 4 основных блюда путенского пехотинца.");
			String[] putmenu = {"", "", "", ""}; */
}