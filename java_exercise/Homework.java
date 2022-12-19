import java.util.ArrayList;
import java.util.List;

public class Homework {
	
	public static void main (String[] args) {
	
		List<Integer> customList = new ArrayList<>();
		for (int i = 1; i < 30; i++) {
			customList.add((int)(Math.random() * i));
		}
	/*	for (int i = 0; i < customList.size() - 1; i++) {
			System.out.println(customList.get(i));
		} */
		
		Homework HW = new Homework();
		
		List<Integer> oneList = HW.removeNegativeValue(customList);
		for (int i = 0; i < oneList.size() - 1; i++) {
			System.out.println(oneList.get(i));
		}
		
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
}