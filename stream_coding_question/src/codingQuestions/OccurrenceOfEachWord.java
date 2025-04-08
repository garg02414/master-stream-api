package codingQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfEachWord {

	public static void main(String[] args) {
		
		String str = "I am learning Stream api in java I am learning";
		
		Map<String, Long> get = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println(get);
	}
}
