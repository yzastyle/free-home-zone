import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Homework {
	
	public static void main (String[] args) {
	
		List<Integer> customList = new ArrayList<>();
		for (int i = 10; i < 15; i++) {
			customList.add((int)(Math.random() * i));
		} 
		System.out.println("Исходные элементы списка:");
		for (int i = 0; i < customList.size(); i++) {
			System.out.println(customList.get(i));
		}
		
		Homework HW = new Homework();
		
		System.out.println("Нечетные числа:");
		List<Integer> oneList = HW.removeNegativeValue(customList);
		for (int i = 0; i < oneList.size(); i++) {
			System.out.println(oneList.get(i));
		}
		
		System.out.println("Минимальное значение в списке: " + HW.getMin(customList));
		
		System.out.println("Максимальное значение в списке: " + HW.getMax(customList));
		
		System.out.println("Среднее значение в списке: " + HW.getAverageStatic(customList));
		
		System.out.println("Среднее арифметическое значение в списке: " + HW.getAverageMaths(customList));
		
	}
	
	public List<Integer> removeNegativeValue(List<Integer> List) {
		
		ArrayList<Integer> removedNegativeValueList = new ArrayList<>();
		for (int i = 0; i < List.size() - 1; i++) {
			if ((List.get(i) % 2) != 0) {
				removedNegativeValueList.add(List.get(i));
			}
		}
		return removedNegativeValueList;
	}
	
	public Integer getMin(List<Integer> list) {
		int min = list.get(0);
		for (int i: list) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}
	
	public Integer getMax(List<Integer> list) {
		int max = list.get(0);
		for (int i: list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public Integer getAverageStatic(List<Integer> list) {
		int avg = 0;
		Collections.sort(list);
		if (list.size() % 2 != 0) {
			int temp = list.size() / 2;
			avg = list.get((list.size() / 2));
		}
		else {
			int temp = list.size() / 2;
			int tempTwo = list.get(temp -1) + list.get(temp);
			avg = tempTwo / 2;
		}
		
		return avg;
	}
	
	public Integer getAverageMaths(List<Integer> list) {
		int sum = 0;
		for (int i: list) {
			sum = sum + i;
		}
		return sum / list.size();
	}
}