import java.util.Scanner;
import java.util.Arrays;

class CommonText {
	BioForm BFF = new BioForm();
	public void preview() {
		String I1 = "***Вас приветствует автоматическая программа по найму на экипаж косимеческого корабля =ЛЕТУЧИЙ ПУТИНЕЦ=***";
		String I2 = "Мы рады, что вы выбрали именно наше судно чтобы бараздить бесконечные просторы комоса.";
		String I3 = "Для успешного трудоустройства вам нужно будет пройти биоаналитический анализатор с технологией распазнования скрытых наклоннйостей.";
		String I4 = "                                                                                                 Мистер робот...";
		String I5 = "                                                                                                    Хайль ПУТЕН!";
		System.out.println(I1 + '\n' + I2 + '\n' + I3 + '\n' + I4 + '\n' + I5);	
	}
	
	public void goToBioPart() {
		System.out.println("Автоматический определитель ДВЕТЫСЯЧИ путем универсального тудасюда определит вашу профпригодность для экипажа корабля =ЛЕТУЧИЙ ПУТИНЕЦ=");
		System.out.println("Следуйте инструкции ниже, пожалуйста...");
		System.out.print("");
		System.out.print("");
		System.out.print("");
		System.out.println(BFF.getFio());
	}
}