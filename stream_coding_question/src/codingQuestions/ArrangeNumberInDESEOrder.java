package codingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeNumberInDESEOrder {

	public static void main(String[] args) {
		int[] arr = {1,6,3,4,5,9};
		
		int[] sorted = Arrays.stream(arr).sorted().toArray();
		for (int i : sorted) {
			System.out.println(i);
		}
		
		System.out.println(""+"\n");
		List<Integer> sorted2 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		for (int i : sorted2) {
			System.out.println(i);
		}
	
		System.out.println(sorted2);
		
		System.out.println(""+"\n");
		int[] sorted3 = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
		
		for (int i : sorted3) {
			System.out.println(i);
		}
	}
}
















