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
}