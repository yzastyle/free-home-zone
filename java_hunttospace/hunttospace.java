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
		boolean DO = false;
		boolean WM = false;
		boolean DE = false;
		while (console.hasNextLine()) {
			String q = console.nextLine();
			if (!(q.equalsIgnoreCase("CO") || q.equalsIgnoreCase("DO") || q.equalsIgnoreCase("WM") || q.equalsIgnoreCase("DE"))) {
				System.out.println("Указывайте, пожалуйста, одно из значений: CO, DO, WM, DE");
			}
			else if (q.equalsIgnoreCase("CO")) {
				CO COrole = new CO();
				COrole.workOnSpaceShip(console);
				break;
			}
			else {
				if (q.equalsIgnoreCase("DO")) {
					DO = true;
					break;
				}
				else if (q.equalsIgnoreCase("WM")) {
					WM = true;
					break;
				}
				else {
					DE = true;
					break;
				}
			}
		}
		
		/*
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